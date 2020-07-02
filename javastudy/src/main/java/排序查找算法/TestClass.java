package 排序查找算法;

import com.alibaba.fastjson.JSONArray;

/**
 * java 常见的几种排序算法
 */
public class TestClass {

    public static volatile int[] arr = null;
    static {
        arr = new int[]{6,1,2,7,9,3,4,5,10,8};
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
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public static void quickSort_1(int[] data, int start, int end) {
        if (data == null || start < 0 || end > data.length - 1) {
            throw new IllegalArgumentException("Invalid Parameters");
        }
        if (start == end) return;
        int index = partition(data, start, end);
        if (index > start) {
            quickSort_1(data, start, index - 1);
        }
        if (index < end) {
            quickSort_1(data, index + 1, end);
        }
    }

    private static int partition(int[] data, int start, int end) {
        int index = start + (int)(Math.random() * (end - start + 1));
        swap(data, index, end);
        int small = start - 1;
        for (index = start; index < end; index++) {
            if (data[index] < data[end]) {
                small++;
                if (small != index) {
                    swap(data, index, small);
                }
            }
        }
        swap(data, small + 1, end);
        return small + 1;
    }

    private static void swap(int[] data, int i, int j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }


    /**
     * 选择排序    "挖坑填数+分治"
     * 6,1,2,7,9,3,4,5,10,8
     */
    public static void quickSort_2(int[] data, int start, int end) {
        // 首先需要一个判断条件来跳出递归程序
        if (data == null || start >= end) return;
        // 设置需要排序的数组长度  即 数组的 index 下标
        int i = start, j = end;
        // 挑选基准位
        int pivotKey = data[start];
        while (i < j) {
            while (i < j && data[j] >= pivotKey){
                j--;
            }
            if (i < j){
                data[i++] = data[j];
            }
            while (i < j && data[i] <= pivotKey){
                i++;
            }
            if (i < j){
                data[j--] = data[i];
            }
        }
        data[i] = pivotKey;
        quickSort_2(data, start, i - 1);
        quickSort_2(data, i + 1, end);
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

//        MPPXfuntion();
        System.out.println(JSONArray.toJSON(arr));

        quickSort_2(arr, 0, arr.length-1);
        System.out.println(JSONArray.toJSON(arr));

//        quickSort_1(arr,0,arr.length-1);

        System.out.println(JSONArray.toJSON(arr));
    }
}
