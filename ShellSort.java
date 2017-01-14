package com.sort.demo;

import java.util.ArrayList;

public class ShellSort {

	public static void main(String[] args) {
		// ����һ�����飬�������Ԫ���������
		int[] array = { 63, 4, 24, 1, 3, 15, 88, 76, 53, 98, -2 };
		// ��������������Ķ���
		ShellSort sorter = new ShellSort();
		// �������򷽷�����������
		sorter.sort(array);
	}
	
	/**
	 * 
	 * @param array Ҫ���������
	 * 
	 */
	private void sort(int[] array){
		int d = array.length/2 ;
	    while (1 <= d) {
	       // ȡ���Ϊd��Ԫ��
	       for (int i = 0; i < array.length; i += d) {
	            int temp = array[i];//ȡ����һ��Ԫ����Ϊ�Ƚ϶���
	            // �Ծ���Ϊ d ��Ԫ�����������
	            int j = 0;
	            for (j = i + d; j < array.length && temp > array[j]; j = j + d) {
	            	array[i] = array[j];
	            }
	            array[j - d] = temp;
	        }
	        d = d / 2; // ��С����
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
