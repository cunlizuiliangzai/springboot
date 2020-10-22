package com.liujia.排序;

import java.util.Comparator;

/**
 * @author ex_111806190
 * @since 2020-10-22 15:31
 */
public class BubbleSorter implements Sorter {


    @Override
    public <T extends Comparable<T>> void sort(T[] list) {
        for (int i = 0; i < list.length; ++i) {
            for (int j = 0; j < list.length - i - 1; ++j) {
                if (list[j].compareTo(list[j + 1]) > 0) {
                    T temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    @
            Override
    public <T> void sort(T[] list, Comparator<T> comp) {
        for (int i = 0; i < list.length; ++i) {
            for (int j = 0; j < list.length - i - 1; ++j) {
                if (comp.compare(list[j], list[j + 1]) > 0) {
                    T temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}
