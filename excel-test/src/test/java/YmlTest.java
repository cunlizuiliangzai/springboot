import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liujia.ExcelTestApplication;
import com.liujia.config.ConfigBean;
import com.liujia.config.DayofWeek;
import com.liujia.config.Person;
import com.liujia.util.ResourceUtil;
import org.apache.ibatis.type.Alias;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Objects;

/**
 * @author ex_111806190
 * @since 2020-9-17 9:26
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ExcelTestApplication.class})
public class YmlTest implements ApplicationContextAware {


    @Value("${name}")
    private String name;
    @Value("${name1}")
    private String name1;
    @Value("${name2}")
    private String name2;


    @Value("${friends.lastname:wocao}")   //配置文件有值取值，每值默认
    private String lastName;

    @Value("${friends.age:280}")
    private Integer age;

    @Autowired
    private DayofWeek dayofWeek;

    @Qualifier("person")
    @Autowired
    private Person person;

    @Value("#{12*13}")
    private Integer flag;

    //别名注入
    @Autowired
    @Qualifier("configBean")
    private ConfigBean configBean;

    //别名注入
    @Autowired
//    @Qualifier("getConfigBean")
    private ConfigBean getConfigBean;

    @Test
    public void test() {
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(dayofWeek.getWeek());
        String week = (String) ResourceUtil.getParamFromProp("week");
        System.out.println(flag);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("");
    }
}
