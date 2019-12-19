package com.ht.test;

public class binarysearch {  //二分查找（折半查找）
    public int compute(int[] a, int num) {
        int b, c, d;
        b = 0;
        c = a.length;
        while (b <= c) {
            //d = b + (c-b) * (num - a[b]) / (a[c] - a[b]);
            d = b + (c - b) / 2;
            if (a[d] < num) {
                b = d + 1;
            } else if (a[d] > num) {
                c = d - 1;
            } else {
                return a[d];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] src = {0, 12, 24, 54, 67, 75, 87, 99};
        binarysearch b = new binarysearch();
        System.out.println(b.compute(src, 75));
    }
}
