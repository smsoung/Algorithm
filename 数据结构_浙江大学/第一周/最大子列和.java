package 第一周;

public class 最大子列和
{
	public static int MaxSubseqSum4(int A[], int N)
	{
		int ThisSum = 0, MaxSum = 0;
		for (int i = 0; i < N; i++)
		{
			ThisSum += A[i];
			if (ThisSum > MaxSum)
				MaxSum = ThisSum;
			else if (ThisSum < 0)
				ThisSum = 0;
		}
		return MaxSum;
	}

	public static void main(String[] args)
	{
		int[] arr = { -2, 11, -4, 13, -5, -2 };
		System.out.println(MaxSubseqSum4(arr, arr.length));
	}
}
