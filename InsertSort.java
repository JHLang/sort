package com.sort.demo;

public class InsertSort {

	public static void main(String[] args) {
		// ����һ�����飬�������Ԫ���������
		int[] array = { 63, 4, 24, 1, 3, 15 };
		// ��������������Ķ���
		InsertSort sorter = new InsertSort();
		// �������򷽷�����������
		sorter.sort(array);
	}

	/**
	 * 
	 * @param array Ҫ���������
	 * �ȶԵ�һ��������Ԫ����������һ������ĳ���Ϊ2�����飬Ȼ����������Ԫ�����򡪡�����Ԫ�ش�С���뵽�����ɵ����������У�����һ������ĳ���Ϊ3�����飬�Դ����ƣ���ԭ�����������
	 */
	private void sort(int[] array){
		//�������Ϊ�ջ������鳤��Ϊ1������Ҫ����
		if(array == null || array.length < 2){
			return ;
		}
		//array.length>1���������
		//��ѭ������ѭ��array.length-1��
		for(int i=1;i<array.length;i++){
			//��ѭ������ѭ��i��
			for(int j=i;j>0;j--){				
				if(array[j]<array[j-1]){
					int temp=array[j];	//�ѵڶ���Ԫ�ص�ֵ�洢����ʱ������
					array[j]=array[j-1];//�ѵ�һ��Ԫ�ص�ֵ��������ڶ���Ԫ��
					array[j-1]=temp;	//����ʱ������ֵ��Ҳ����ԭ�����ڶ���Ԫ�ص�ֵ���������һ��Ԫ�أ�
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
