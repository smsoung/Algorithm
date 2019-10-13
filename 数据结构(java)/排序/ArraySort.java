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
		for (int p = 0; p < arr.length-1; p++) {//p指针指向第一位，没排好一趟向后移一位
			int flag = 0;
			for (int i = p+1; i < arr.length; i++) {//i指向p的后一位，比较一次向后移一位
				if (arr[p] > arr[i]) {
					int temp = arr[p];
					arr[p] = arr[i];
					arr[i] = temp;
					flag = 1;//标识发生了交换
				}
			}
			if(flag == 0)//全程无交换
				break;
		}
	}
	
	//冒泡排序
	public static void bubbleSort(int[] arr){
		for (int p = arr.length-1; p > 0; p--) {//p指针指向最后一位，每排好一趟向前移一位
			int flag = 0;
			for (int i = 0; i < p; i++) {//i指向0，比较一次向后移一位
				if(arr[i] > arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					flag = 1;//标识发生了交换
				}
			}
			if(flag == 0)//全程无交换
				break;
		}
	}
	
	//插入排序，每趟将一个待排序的关键字按照其值大小插入到已经排好的部分有序序列的适当位置上
	public static void insertSort(int[] arr){
		for (int p = 1; p < arr.length; p++) {
			int temp = arr[p];//摸下一张牌
			int i;
			for (i = p; i>0 && arr[i-1]>temp; i--) {
				arr[i] = arr[i-1];//移出空位
			}
			arr[i] = temp;//新牌落位
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
