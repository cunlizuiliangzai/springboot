import com.alibaba.fastjson.JSON;
import com.liujia.ExcelTestApplication;
import com.liujia.entity.ShopOrder;
import com.liujia.mapper.TestOrderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * @author ex_111806190
 * @since 2020-9-17 9:27
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ExcelTestApplication.class})
public class OrderTest {

    @Autowired
    TestOrderMapper orderMapper;

    @Test
    public void test() {

        ShopOrder shopOrderList = orderMapper.getShopOrderList("20200801091754-5db339c38a_business");
        String s = JSON.toJSONString(shopOrderList);
        System.out.println(s);

    }



}
