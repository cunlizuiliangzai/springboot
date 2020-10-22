package com.liujia.设计模式.单例模式;

/**
 * @author ex_111806190
 * @since 2020-10-21 15:42
 * 懒汉
 */
public class LazySingle {

    private static LazySingle instance;

    private LazySingle() {
    }

    public static LazySingle getSingleton() {
        if(instance == null){
            synchronized (LazySingle.class) {
                if (instance == null) {
                    instance = new LazySingle();
                }
            }
        }
        return instance;
    }

}
