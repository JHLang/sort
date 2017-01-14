package com.sort.demo;

public class SelectionSort {

	public static void main(String[] args) {
		// ����һ�����飬�������Ԫ���������
		int[] array = { 63, 4, 24, 1, 3, 15 };
		// ��������������Ķ���
		SelectionSort sorter = new SelectionSort();
		// �������򷽷�����������
		sorter.sort(array);
	}
	
	/**
	 * 
	 * @param array Ҫ���������
	 * 
	 */
	private void sort(int[] array){
		//�������Ϊ�ջ������鳤��Ϊ1������Ҫ����
		if(array == null || array.length < 2){
			return ;
		}
		//array.length>1���������
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
	 * ��ʾ��������Ԫ��
	 * 
	 * @param array Ҫ��ʾ������
	 */
	public void showArray(int[] array) {
		for (int i : array) {// foreach��ʽ��������
				System.out.print(i + "  ");// �������ÿ��Ԫ��ֵ
		}
	}
	
}
