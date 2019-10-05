package 排序;

import java.util.Arrays;

public class ArraySort {
	
	public static void main(String[] args) {
		int[] a = {49,38,65,97,76,13,27,49};
//		insertSort(a);
//		bubbleSort(a);
//		quickSort(a, 0, a.length-1);
		selectSort(a);
		System.out.println(Arrays.toString(a));
	}
	
	//选择排序
	public static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	//冒泡排序
	public static void bubbleSort(int[] arr){
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	//直接插入排序
	public static void insertSort(int[] arr){
		int i,j;
		int temp;
		for (i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i-1;
			while (j>=0 && temp<arr[j]) {
				arr[j+1] = arr[j];
				--j;
			}
			arr[j+1] = temp;
		}
	}
	
	//快速排序
	public static void quickSort(int[] arr,int low,int high){
		int temp;
		int i = low,j=high;
		if(low<high){
			temp = arr[low];
			while(i<j){
				while(i<j && arr[j]>=temp) --j;
				if(i<j){
					arr[i] = arr[j];
					++i;
				}
				
				while(i<j && arr[i]<=temp) ++i;
				if(i<j){
					arr[j] = arr[i];
					--j;
				}
			}
			arr[i] = temp;
			quickSort(arr, low, i-1);
			quickSort(arr, i+1, high);
		}
	}
}
