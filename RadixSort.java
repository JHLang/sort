package com.sort.demo;

public class RadixSort {

	public static void main(String[] args) {
		// 创建一个数组，这个数组元素是乱序的
		int[] array = { 63, 4, 24, 1, 3, 15 };
		// 创建快速排序类的对象
		RadixSort sorter = new RadixSort();
		// 调用排序方法将数组排序
		sorter.sort(array);
	}

	/**
	 * 
	 * @param array 要排序的数组
	 * 
	 */

	public void sort(int[] array) { 
		int d=0;//d表示最大的数有多少位
		for(int i=0;i<array.length;i++){
			if(String.valueOf(array[i]).length()>d){
				d=String.valueOf(array[i]).length();
			}
		}
		int x = 0;
		int y = 1;
		int z = 1; //控制键值排序依据在哪一位
		int[][] temp = new int[10][array.length]; //数组的第一维表示可能的余数0-9
		int[] order = new int[10]; //数组orde[i]用来表示该位是i的数的个数
		//该循环共循环2次（因为该数组中最大元素为两位数），第一次按每个元素个位上的数从小到大排序（若个位上的数字相同，则原数组哪个元素在前，哪个元素仍旧排在前面（其实个位上的数字相同的元素，第一轮排序的先后不影响结果））;
		//第二轮排序将一位数的元素从小到大排序，后接着将两位数的元素从小到大排在一位数的元素后面，这样整个数组就变成有序的了
		while(z <= d){
			for(int i = 0; i < array.length; i++){
				int l = ((array[i] / y) % 10);		
				temp[l][order[l]] = array[i];		
				order[l]++;							
				System.out.println("temp["+l+"]["+order[l]+"]="+"array["+i+"]="+array[i]);
				System.out.println("order["+l+"]="+order[l]);
			}
			for(int i = 0; i < 10; i++){
				if(order[i] != 0){					
					for(int j = 0; j < order[i]; j++) {
						array[x] = temp[i][j];		  
						System.out.println("array["+x+"]=temp["+i+"]["+j+"]="+temp[i][j]);
						x++;						   
					}
				}
				order[i] = 0;
			}
			y *= 10;			//y=10
			x = 0;				//x=o
			z++;				//z=2
		}
		showArray(array);
	}

	/**
	 * 显示数组所有元素
	 * 
	 * @param array 要显示的数组
	 */
	public static void showArray(int[] array) {
		for (int i : array) {// foreach格式遍历数组
			System.out.print(i + "  ");// 输出数组每个元素值
		}
	}

}
