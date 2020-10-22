package com.liujia.设计模式.适配器模式;

/**
 * @author ex_111806190
 * @since 2020-10-21 17:01
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
