package com.liujia.generator;

import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;

//代码自动生成
public class Generator {


    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        // 这里修改为自己项目本地工程目录即可
//        String projectPath = "D:\\document/CODE/SMARTCHARGE_CODE\\cdt-webmgmtcomponent\\cdt-webmgmtcomponent-service";

        String projectPath = "D:\\project\\springboot\\excel-test";
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("liujia");
        gc.setOpen(false);
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://39.96.47.9:3306/bwc");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("test");
        dsc.setPassword("test");
        dsc.setSchemaName("bwc");
        mpg.setDataSource(dsc);

        //数据表的列表
        String[] tableName = {"test_order"};

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.liujia");
        mpg.setPackageInfo(pc);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        // 如果模板引擎是 freemarker
        String templatePath = "/templates/mapper.xml.ftl";

        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return projectPath + "/src/main/resources/mapper/"
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });

        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        // 配置模板y
        TemplateConfig templateConfig = new TemplateConfig();

        templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);


        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setSuperEntityClass("com.liujia.base.MpBaseEntity");
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
//            strategy.setSuperControllerClass("com.tt.springboot_redis.common.BaseController");
        strategy.setInclude(tableName);
        strategy.setSuperEntityColumns("uuid", "create_time", "create_user", "update_time", "update_user", "delete_flag");
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setTablePrefix(pc.getModuleName() + "_");
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }
}

