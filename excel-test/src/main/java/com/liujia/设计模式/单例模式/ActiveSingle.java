package com.liujia.设计模式.单例模式;

/**
 * @author ex_111806190
 * @since 2020-10-21 15:47
 * 饿汉
 */
public class ActiveSingle {
    //创建 SingleObject 的一个对象
    private static ActiveSingle instance = new ActiveSingle();

    //让构造函数为 private，这样该类就不会被实例化
    private ActiveSingle(){}

    //获取唯一可用的对象
    public static ActiveSingle getInstance(){
        return instance;
    }

}
