package 数组;

public class 二维数组中的查找
{
	public static boolean Find(int target, int[][] array)
	{
		int row = array.length - 1;
		int col = 0;
		while (row >= 0 && col <= array[0].length - 1)
		{
			if (target < array[row][col])
				row--;
			else if (target > array[row][col])
				col++;
			else
				return true;
		}
		return false;
	}

	public static void main(String[] args)
	{
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(Find(2, arr));
	}
}
