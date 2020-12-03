package com.liujia.LRU;

import org.apache.commons.collections4.map.LRUMap;


/**
 * 最近最少使用的淘汰
 */
public class LruMap {
    public static void main(String[] args) {
        LRUMap<String, Object> map = new LRUMap<>(3);
        map.put("A","1");
        map.put("B","2");
        map.put("C","3");

        Object a = map.get("A");
        map.put("D","4");
        System.out.println(map);
    }
}
