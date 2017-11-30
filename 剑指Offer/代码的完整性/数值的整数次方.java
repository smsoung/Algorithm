package 代码的完整性;

public class 数值的整数次方
{
	public static double Power(double base, int exponent)
	{
		double result = 1;
		int n;
		if (exponent > 0)
		{
			n = exponent;
		} else if (exponent < 0)
		{
			if (base == 0)
				throw new RuntimeException("分母不能为零");
			n = -exponent;
		} else
		{
			return 1;
		}

		while (n != 0)
		{
			if ((n & 1) == 1)
				result *= base;
			base *= base;
			n >>= 1;
		}

		return exponent > 0 ? result : (1 / result);
	}

	public static void main(String[] args)
	{
		System.out.println(Power(2, 5));
	}
}
