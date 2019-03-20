package com.upcard.lintcode.simple;

import java.util.Arrays;

public class SortInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 5, 7, 3,1,4,2,5,6,3,4,98,57,124,788,43,4 };
		// {1,4,2,5,6,3,4,98,57,124,788,43,4};
		int b = 0;
//		for(;b < a.length; b++) {
//			System.out.println(a[b]);
//		}
//		bubbleSort(a);
//		for (; b < a.length; b++) {
//			System.out.println("----->" + a[b]);
//		}
		
		selectionSort1(a);
		for (; b < a.length; b++) {
			System.out.println("----->" + a[b]);
		}

	}

	/**
	 * ð������ �Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������
	 * ��ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԣ�����������Ԫ��Ӧ�û����������� ������е�Ԫ���ظ����ϵĲ��裬�������һ����
	 * �ظ�����1~3��ֱ��������ɡ� �Ľ�����ô�ڲ�ѭ��ִ�����һ�Σ���ǰ���ֵ�ͻ�̶�������û��Ҫ�ٴαȽ�
	 * 
	 * @param array
	 */
	public static void bubbleSort(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) { // ����Ԫ�������Ա�
					int temp = arr[j + 1]; // Ԫ�ؽ���
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void selectionSort1(int[] array) { 
		int minIndex, temp;
		for (int i = 0; i < array.length - 1; i++) {
			minIndex = i;
			for(int j = i + 1; j < array.length; j++) {
				if(array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
	}

	/**
	 * ѡ������
	 * ������δ�����������ҵ���С����Ԫ�أ���ŵ��������е���ʼλ�ã�Ȼ���ٴ�ʣ��δ����Ԫ���м���Ѱ����С����Ԫ�أ�Ȼ��ŵ����������е�ĩβ���Դ����ƣ�ֱ������Ԫ�ؾ�������ϡ�
	 * ѡ��һ����׼ֵ��Ȼ����ʣ����������ݱȽϣ��������ȡ�ڵ�ֵ�ȵ�ǰֵС����ô��׼ֵ������С��ֵ��ֱ��������������ϣ���ʱ�ĵ�ǰֵ����С��ֵ������Сֵ��������ĩβ�滻��
	 * �ظ����ϲ���
	 * 
	 * @param array
	 */
	public static void selectionSort(int[] array) {
		int length = array.length;
		int minIndex;
		int temp;
		for (int i = 0; i < length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < length; j++) {
				if(array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
	}

	/**
	 * �������� ͨ�������������У�����δ�������ݣ��������������дӺ���ǰɨ�裬�ҵ���Ӧλ�ò����롣
	 *  �ӵ�һ��Ԫ�ؿ�ʼ����Ԫ�ؿ�����Ϊ�Ѿ�������
	 *  
	 *  ȡ����һ��Ԫ�أ����Ѿ������Ԫ�������дӺ���ǰɨ�裻 
	 *  �����Ԫ�أ������򣩴�����Ԫ�أ�����Ԫ���Ƶ���һλ�ã�
	 *  �ظ���һ���裬ֱ���ҵ��������Ԫ��С�ڻ��ߵ�����Ԫ�ص�λ�ã� 
	 *  ����Ԫ�ز��뵽��λ�ú� �ظ����ϲ��衣
	 * 
	 * @param arr
	 */
	public void insertionSort(int[] arr) {
		int temp;
		for(int i = 0; i < arr.length - 1; i++) {
			temp = arr[i];
			for(int j = i; j > 0 && j < arr.length -1; j--) {
				if(arr[i] > arr[j]) {
					arr[j + 1] = arr[i];
				}
			}
		}
	}

	/**
	 * 
	 * @param array
	 */
	public void quickSort(int[] array) {

	}

}
