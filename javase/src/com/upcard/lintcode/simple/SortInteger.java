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
	 * 冒泡排序 比较相邻的元素。如果第一个比第二个大，就交换它们两个；
	 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数； 针对所有的元素重复以上的步骤，除了最后一个；
	 * 重复步骤1~3，直到排序完成。 改进：那么内层循环执行完毕一次，当前最大值就会固定，后续没必要再次比较
	 * 
	 * @param array
	 */
	public static void bubbleSort(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) { // 相邻元素两两对比
					int temp = arr[j + 1]; // 元素交换
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
	 * 选择排序
	 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
	 * 选择一个基准值，然后与剩余的数组内容比较，如果无序取内的值比当前值小，那么基准值换成最小的值，直到无序区排序完毕，此时的当前值是最小的值，将最小值与有序区末尾替换；
	 * 重复以上步骤
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
	 * 插入排序 通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
	 *  从第一个元素开始，该元素可以认为已经被排序；
	 *  
	 *  取出下一个元素，在已经排序的元素序列中从后向前扫描； 
	 *  如果该元素（已排序）大于新元素，将该元素移到下一位置；
	 *  重复上一步骤，直到找到已排序的元素小于或者等于新元素的位置； 
	 *  将新元素插入到该位置后； 重复以上步骤。
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
