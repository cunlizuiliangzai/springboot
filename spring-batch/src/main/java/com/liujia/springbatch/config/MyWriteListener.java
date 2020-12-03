package com.liujia.springbatch.config;

import com.liujia.springbatch.entity.BlogInfo;
import org.springframework.batch.core.ItemWriteListener;

import java.util.List;

import static java.lang.String.format;

public class MyWriteListener implements ItemWriteListener<BlogInfo> {

    @Override
    public void beforeWrite(List<? extends BlogInfo> items) {
    }

    @Override
    public void afterWrite(List<? extends BlogInfo> items) {
    }

    @Override
    public void onWriteError(Exception exception, List<? extends BlogInfo> items) {
        try {
            System.out.println(format("%s%n", exception.getMessage()));
            for (BlogInfo message : items) {
                System.out.println(format("Failed writing BlogInfo : %s", message.toString()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}