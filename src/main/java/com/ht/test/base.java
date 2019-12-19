package com.ht.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class base {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        /*
         * 这种方式会导致出现java.util.ConcurrentModificationException异常
         * 原因在于:对List采用的是foreach遍历操作,并且遍历过程中对list进行了删除操作,
         * 导致Iterator在执行next()方法时调用 checkForComodification()方法
         * 接着将cursor的值赋给lastRet，并对cursor的值进行操作
         */
        for (String str : list) {
            if ("a".equals(str)) {
                list.remove(str);
            }
        }

        /*Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String temp = iterator.next();
            if ("a".equals(temp)) {
                iterator.remove();
            }
        }*/
        System.out.println(list); //[a, c]
    }
}