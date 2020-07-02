package com.study.javaclass.排序查找算法;

/**
 * java 常见的几种排序算法
 */
public class TestClass {

    public static int[] arr = null;
    static {
        arr = new int[]{6, 2, 1, -9, -18};
    }

    /**
     * 插入排序
     */
    public static void CRPXfuntion(){

    }

    /**
     * 冒泡排序
     * 1、是通过每一次遍历获取最大值/最小值
     * 2、将最大值/最小值 放在尾部/头部
     * 3、然后除开 最大值/最小值，剩下的数据再进行遍历获取 最大值/最小值
     */
    public static void MPPXfuntion(){
        for (int i = 0; i < arr.length; i++) {
            //外层循环，遍历次数
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 内部循环，升序（如果前一个值比后一个值大，则交换）
            }
        }
    }

    /**
     * 选择排序
     */
    public static void XZPXfuntion(){

    }

    /**
     * 希尔排序
     */
    public static void XEPXfuntion(){

    }

    /**
     * 快速排序
     */
    public static void KSPXfuntion(){

    }

    /**
     * 归并排序
     */
    public static void GBPXfuntion(){

    }

    public static void main(String[] args) {

    }
}
