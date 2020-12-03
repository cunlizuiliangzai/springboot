package com.liujia.springbatch.config;


import com.liujia.springbatch.entity.BlogInfo;
import org.springframework.batch.core.ItemReadListener;

import static java.lang.String.format;

public class MyReadListener implements ItemReadListener<BlogInfo> {


    @Override
    public void beforeRead() {
    }

    @Override
    public void afterRead(BlogInfo item) {
    }

    @Override
    public void onReadError(Exception ex) {
        try {
            System.out.println(format("%s%n", ex.getMessage()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}