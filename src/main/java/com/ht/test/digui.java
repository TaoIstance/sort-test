package com.ht.test;

public class digui {  //递归
    static int dj(int a) {
        if (a < 2) {
            return 1;
        }
        return dj(a - 1) + dj(a - 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(dj(i));
        }
    }
}


