package com.sort.demo;

public class InsertSort {

	public static void main(String[] args) {
		// 创建一个数组，这个数组元素是乱序的
		int[] array = { 63, 4, 24, 1, 3, 15 };
		// 创建快速排序类的对象
		InsertSort sorter = new InsertSort();
		// 调用排序方法将数组排序
		sorter.sort(array);
	}

	/**
	 * 
	 * @param array 要排序的数组
	 * 先对第一、二两个元素排序，生成一个有序的长度为2的数组，然后加入第三个元素排序——根据元素大小插入到新生成的有序数组中，生成一个有序的长度为3的数组，以此类推，对原数组进行排序
	 */
	private void sort(int[] array){
		//如果数组为空或者数组长度为1，则不需要排序
		if(array == null || array.length < 2){
			return ;
		}
		//array.length>1则进行排序
		//外循环，需循环array.length-1次
		for(int i=1;i<array.length;i++){
			//内循环，需循环i次
			for(int j=i;j>0;j--){				
				if(array[j]<array[j-1]){
					int temp=array[j];	//把第二个元素的值存储到临时变量中
					array[j]=array[j-1];//把第一个元素的值赋给数组第二个元素
					array[j-1]=temp;	//把临时变量的值（也就是原组数第二个元素的值赋给数组第一个元素）
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
