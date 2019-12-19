package com.ht.test;

public class paixu {  //排序算法
    public void mp() {   //冒泡排序
        int[] a = {12, 43, 25, 67, 99, 53};
        int num;
        boolean flag = true;
        for (int i = 0; i < a.length - 1 && flag; i++) {//比较趟数
            flag = false;
            for (int j = 0; j < a.length - 1 - i; j++) {//每趟比较次数
                if (a[j] > a[j + 1]) {
                    num = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = num;
                    flag = true;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public void xz() {  //简单选择排序
        int[] a = {12, 43, 25, 67, 99, 53};
        int min, num;
        for (int i = 0; i < a.length - 1; i++) {
            min = i;    //将第i个数假设为最小数，记录下标
            for (int j = i + 1; j < a.length; j++) {    //如果数组中有比i更小的数字，修改之前记录的最小下标
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            if (min != i) { //比较如果第i个数不是当前最小的，交换位置
                num = a[i];
                a[i] = a[min];
                a[min] = num;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public void cr() {   //插入排序
        int[] a = {12, 43, 25, 67, 99, 5, 38};
        int num, j;
        for (int i = 1; i < a.length; i++) {
            num = a[i];//将比较的数字暂存
            for (j = i; j > 0 && a[j - 1] > num; j--) {//拿前面一位数和暂存数字进行比较
                a[j] = a[j - 1];  //如果前面数字大，将该数向后移一位,并--拿更前面一个数字进行比较
            }
            a[j] = num; //将比较的数字插入到比较完后合适位置，即左边比他小右边比他大。这个a[j]是j--后的
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        paixu px = new paixu();
        //px.mp();
        //px.xz();
        px.cr();
    }
}
