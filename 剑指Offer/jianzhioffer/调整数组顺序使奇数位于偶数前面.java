package jianzhioffer;

import java.util.Arrays;

public class 调整数组顺序使奇数位于偶数前面 {
	// 前偶后奇直接交换不能保证顺序
	public static void reOrderArray(int[] array) {
		int i = 0, j = array.length - 1;
		while (i < j) {
			while (array[i] % 2 == 1)
				i++;
			while (array[j] % 2 == 0)
				j--;
			if (i < j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
	}

	// 采用冒泡排序，相邻的两个元素前偶后奇依次交换。
	public static void reOrderArray1(int[] array) {
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] % 2 == 0 && array[i + 1] % 2 == 1) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array = new int[(int) (Math.random() * 10) + 5];
		for (int i = 0; i < array.length; i++)
			array[i] = (int) (Math.random() * 20);
		System.out.println(Arrays.toString(array));
		// reOrderArray(array);
		reOrderArray1(array);
		System.out.println(Arrays.toString(array));
	}
}
