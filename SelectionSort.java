package com.sort.demo;

public class SelectionSort {

	public static void main(String[] args) {
		// 创建一个数组，这个数组元素是乱序的
		int[] array = { 63, 4, 24, 1, 3, 15 };
		// 创建快速排序类的对象
		SelectionSort sorter = new SelectionSort();
		// 调用排序方法将数组排序
		sorter.sort(array);
	}
	
	/**
	 * 
	 * @param array 要排序的数组
	 * 
	 */
	private void sort(int[] array){
		//如果数组为空或者数组长度为1，则不需要排序
		if(array == null || array.length < 2){
			return ;
		}
		//array.length>1则进行排序
		for(int i = array.length-1 ; i>0 ; i--){
			for(int j=0 ; j<i ; j++){
				if(array[j]>array[j+1]){
					int temp=array[j];	
					array[j]=array[j+1];
					array[j+1]=temp;	
				}
			}
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
