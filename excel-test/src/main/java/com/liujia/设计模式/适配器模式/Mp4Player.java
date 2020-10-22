package com.liujia.设计模式.适配器模式;

/**
 * @author ex_111806190
 * @since 2020-10-21 17:02
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
