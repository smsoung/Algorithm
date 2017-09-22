package test;

public class test
{
	public static void main(String[] args)
	{
		// printf(10000);
		printf1(11300);
	}

	//循环打印1~n
	static void printf(int n)
	{
		for (int i = 1; i < n; i++)
		{
			System.out.println(i);
		}
	}

	//递归打印1~n
	static void printf1(int n)
	{
		if (n > 0)
		{
			printf1(n - 1);
			System.out.println(n);
		}
	}
}
