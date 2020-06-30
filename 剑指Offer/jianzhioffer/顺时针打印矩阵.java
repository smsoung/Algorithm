package jianzhioffer;

import java.util.ArrayList;

public class 顺时针打印矩阵 {
	
	public static ArrayList<Integer> printMatrix(int[][] matrix) {
		// if (matrix == null)
		// return null;
		ArrayList<Integer> list = new ArrayList<>();
		int row = matrix.length;
		int col = matrix[0].length;

		int left = 0, right = col - 1, top = 0, bottom = row - 1;
		while (left <= right && top <= bottom) {
			// 从左到右打印一行
			for (int i = left; i <= right; i++)
				list.add(matrix[top][i]);
			// 从上到下打印一列
			for (int i = top + 1; i <= bottom; i++)
				list.add(matrix[i][right]);
			// 从右向左打印一行
			if (bottom > top)
				for (int i = right - 1; i >= left; i--)
					list.add(matrix[bottom][i]);
			// 从下向上打印一列
			if (right > left)
				for (int i = bottom - 1; i > top; i--)
					list.add(matrix[i][left]);
			left++;
			top++;
			right--;
			bottom--;
		}
		return list;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(printMatrix(matrix));
	}
}
