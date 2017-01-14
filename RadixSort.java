package com.sort.demo;

public class RadixSort {

	public static void main(String[] args) {
		// ����һ�����飬�������Ԫ���������
		int[] array = { 63, 4, 24, 1, 3, 15 };
		// ��������������Ķ���
		RadixSort sorter = new RadixSort();
		// �������򷽷�����������
		sorter.sort(array);
	}

	/**
	 * 
	 * @param array Ҫ���������
	 * 
	 */

	public void sort(int[] array) { 
		int d=0;//d��ʾ�������ж���λ
		for(int i=0;i<array.length;i++){
			if(String.valueOf(array[i]).length()>d){
				d=String.valueOf(array[i]).length();
			}
		}
		int x = 0;
		int y = 1;
		int z = 1; //���Ƽ�ֵ������������һλ
		int[][] temp = new int[10][array.length]; //����ĵ�һά��ʾ���ܵ�����0-9
		int[] order = new int[10]; //����orde[i]������ʾ��λ��i�����ĸ���
		//��ѭ����ѭ��2�Σ���Ϊ�����������Ԫ��Ϊ��λ��������һ�ΰ�ÿ��Ԫ�ظ�λ�ϵ�����С������������λ�ϵ�������ͬ����ԭ�����ĸ�Ԫ����ǰ���ĸ�Ԫ���Ծ�����ǰ�棨��ʵ��λ�ϵ�������ͬ��Ԫ�أ���һ��������Ⱥ�Ӱ��������;
		//�ڶ�������һλ����Ԫ�ش�С�������򣬺���Ž���λ����Ԫ�ش�С��������һλ����Ԫ�غ��棬������������ͱ���������
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
	 * ��ʾ��������Ԫ��
	 * 
	 * @param array Ҫ��ʾ������
	 */
	public static void showArray(int[] array) {
		for (int i : array) {// foreach��ʽ��������
			System.out.print(i + "  ");// �������ÿ��Ԫ��ֵ
		}
	}

}
