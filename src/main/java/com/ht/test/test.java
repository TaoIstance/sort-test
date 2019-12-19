package com.ht.test;

import java.util.Arrays;

public class test {
    public int cx(int num) {
        int[] src = {21, 35, 45, 76, 84, 12, 42};
        int b = 0;
        int c = src.length;
        while (b <= c) {
            int d = b + (c - b) / 2;
            if (src[d] < num) {
                b = d + 1;
            } else if (src[d] > num) {
                c = d - 1;
            } else {
                return src[d];
            }
        }
        return 0;
    }

    public void xz() {
        int[] a = {21, 35, 45, 76, 84, 12, 42};
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int num = a[min];
                a[min] = a[i];
                a[i] = num;
            }
        }
        for (int x = 0; x < a.length; x++) {
            System.out.println(a[x]);
        }
    }

    public void mp() {
        int[] a = {21, 35, 45, 76, 84, 12, 42};
        boolean flag = true;
        for (int i = 0; i < a.length - 1 & flag; i++) {
            flag = false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int num = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = num;
                    flag = true;
                }
            }
        }
        for (int x = 0; x < a.length; x++) {
            System.out.println(a[x]);
        }
    }

    public void cr() {
        int[] a = {21, 35, 45, 76, 84, 12, 42};
        int j, num;
        for (int i = 1; i < a.length; i++) {
            num = a[i];
            for (j = i; j > 0 && a[j - 1] > num; j--) {
                a[j] = a[j - 1];
            }
            a[j] = num;
        }
        for (int x = 0; x < a.length; x++) {
            System.out.println(a[x]);
        }
    }

    public void arrays() {
        int[] a = {21, 35, 45, 76, 84, 12, 42};
        Arrays.sort(a);   //升序排序
        System.out.println(Arrays.toString(a));   //输出
        System.out.println(Arrays.binarySearch(a, 45));   //查找元素下标
    }

    public void fz() {   //反转排序
        int[] a = {21, 35, 45, 76, 84, 12, 42};
        int c = a.length / 2;
        for (int i = 0; i < c; i++) {
            int num = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = num;
        }
        for (int x = 0; x < a.length; x++) {
            System.out.println(a[x]);
        }
    }

    public void sc() {   //删除指定元素
        int[] a = {21, 35, 45, 76, 84, 12, 42};
        int[] a2 = new int[a.length - 1];
        int n = 35;
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("没有那个数字");
        } else {
            for (int i = index; i < a.length - 1; i++) {
                a[i] = a[i + 1];
            }
            System.arraycopy(a, 0, a2, 0, a2.length);
        }
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a));
    }

    public void kz() {   //复制和扩展数组
        int[] a = {21, 35, 45, 76, 12};
        int[] a2 = new int[a.length + 1];
        //int[] a2 = Arrays.copyOf(a,a.length + 1);
        System.arraycopy(a, 0, a2, 0, a.length);
        //原数组，原数组起始位置，目的数组，目的数组起始位置，所需复制数组的长度
        int index = 1;
        for (int i = a2.length - 1; i > index; i--) {
            a2[i] = a2[i - 1];
        }
        a2[index] = 55;
        System.out.println(Arrays.toString(a2));
    }

    public void hb() {   //合并数组
        int[] a = {1, 2, 3, 4, 5};
        int[] a1 = {6, 7, 8, 9};
        int[] a2 = new int[a.length + a1.length];
        System.arraycopy(a, 0, a2, 0, a.length);
        System.arraycopy(a1, 0, a2, a.length, a1.length);
        System.out.println(Arrays.toString(a2));
    }


    public static void main(String[] args) {
        test t = new test();
        //System.out.println(t.cx(35));
        //t.xz();
        //t.mp();
        //t.cr();
        //t.arrays();
        //t.fz();
        //t.sc();
        //t.kz();
        //t.hb();
    }
}
