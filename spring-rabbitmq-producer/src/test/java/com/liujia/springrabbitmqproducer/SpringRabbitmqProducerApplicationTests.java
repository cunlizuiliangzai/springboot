package com.liujia.springrabbitmqproducer;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRabbitmqProducerApplicationTests {

    @Autowired
    private ApiCoreSender sender;

    @Test
    public void test_sender() {
        sender.sender("֧�������ţ�"+System.currentTimeMillis());
    }

    @Test
    public void test_user() {
        sender.user("�û�����");
    }

    @Test
    public void test_userQuery() {
        sender.userQuery("��ѯ�û���Ϣ��");
    }

    @Test
    public void test_order() {
        sender.order("��������");
    }

    @Test
    public void test_orderQuery() {
        sender.orderQuery("��ѯ������Ϣ��");
    }

    @Test
    public void test_orderDetailQuery() {
        sender.orderDetailQuery("��ѯ����������Ϣ��");
    }

}
