import com.liujia.ExcelTestApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ex_111806190
 * @since 2020-9-25 11:37
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ExcelTestApplication.class})
public class LoggerTest {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void test() {
        logger.trace("这是trace日志...");
        logger.debug("这是debug日志...");
        //SpringBoot默认给我们使用的是info级别的，没有指定级别的就用SpringBoot默认规定的级别；root级别
        logger.info("这是info日志...");
        logger.warn("这是warn日志...");
        logger.error("这是error日志...");
    }

}
