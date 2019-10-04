package 排序;

import java.util.Arrays;

public class InsertSort {
	
	public static void main(String[] args) {
		int[] a = {1,3,16,5,4,8,46,13};
		insertSort(a, a.length);
		System.out.println(Arrays.toString(a));
	}
	
	public static void insertSort(int[] arr,int n){
		int i,j;
		int temp;
		for (i = 1; i < n; i++) {
			temp = arr[i];
			
			j = i-1;
			
			while (j>=0 && temp<arr[j]) {
				arr[j+1] = arr[j];
				--j;
			}
			arr[j+1] = temp;
		}
	}
	
}
