package com.liujia.排序;

import java.util.Comparator;

/**
 * @author ex_111806190
 * @since 2020-10-22 15:28
 */
public interface Sorter {

    public <T extends Comparable<T>> void sort(T[] list);


    public <T> void sort(T[] list, Comparator<T> comp);

}
