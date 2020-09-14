import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.liujia.ExcelTestApplication;
import com.liujia.entity.LoanInfo;
import com.liujia.listenner.ExcelListener;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.util.ArrayList;

/**
 * @author ex_111806190
 * @since 2020-9-11 11:08
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ExcelTestApplication.class})
public class excelTest {

    //导入
    @Test
    public void testReadExcel() throws IOException {
        InputStream inputStream = new FileInputStream(new File("D:\\123.xlsx"));
        ExcelListener excelListener = new ExcelListener();
        EasyExcelFactory.readBySax(inputStream, new Sheet(1, 1, LoanInfo.class), excelListener);
        inputStream.close();
    }


    //导出
    @Test
    public void test1() throws FileNotFoundException {
        ArrayList<LoanInfo> loanInfos = new ArrayList<>();
        LoanInfo loanInfo = new LoanInfo();
        loanInfo.setId("123");
        loanInfo.setName("liujia");
        loanInfos.add(loanInfo);
        OutputStream out = new FileOutputStream("D:\\456.xlsx");
        try {
            ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX);
            //写第一个sheet, sheet1  数据全是List<String> 无模型映射关系
            Sheet sheet1 = new Sheet(1, 0,LoanInfo.class);
            writer.write(loanInfos, sheet1);
            writer.finish();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
