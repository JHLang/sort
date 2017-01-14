package com.sort.demo;

import java.util.ArrayList;

public class ShellSort {

	public static void main(String[] args) {
		// 创建一个数组，这个数组元素是乱序的
		int[] array = { 63, 4, 24, 1, 3, 15, 88, 76, 53, 98, -2 };
		// 创建快速排序类的对象
		ShellSort sorter = new ShellSort();
		// 调用排序方法将数组排序
		sorter.sort(array);
	}
	
	/**
	 * 
	 * @param array 要排序的数组
	 * 
	 */
	private void sort(int[] array){
		int d = array.length/2 ;
	    while (1 <= d) {
	       // 取间隔为d的元素
	       for (int i = 0; i < array.length; i += d) {
	            int temp = array[i];//取出第一个元素作为比较对象
	            // 对距离为 d 的元素组进行排序
	            int j = 0;
	            for (j = i + d; j < array.length && temp > array[j]; j = j + d) {
	            	array[i] = array[j];
	            }
	            array[j - d] = temp;
	        }
	        d = d / 2; // 减小增量
	    }
		showArray(array);
	}
	
	/**
	 * 显示数组所有元素
	 * 
	 * @param array 要显示的数组
	 */
	public void showArray(int[] array) {
		for (int i : array) {// foreach格式遍历数组
				System.out.print(i + "  ");// 输出数组每个元素值
		}
	}
	
	
}
