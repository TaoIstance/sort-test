package com.ht.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class deliver {
    public static void main(String[] args){
        List<List<String>> fatherlist = new LinkedList<List<String>>();
        List<String> childlist = new ArrayList<String>();
        childlist.add("aaa");
        fatherlist.add(childlist);
        childlist.add("bbb");
        //System.out.println(fatherlist);


        String a = "a";
        String b = a;
        change(b);
        System.out.println(a);
    }
    public static void change(String b){
        b="zhangsan";
    }
}
