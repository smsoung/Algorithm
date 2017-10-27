
public class 数值的整数次方
{
	public double Power(double base, int n)
	{
		double result = 1, curr = base;
		int exponent;
		if (n > 0)
		{
			exponent = n;
		} else if (n < 0)
		{
			if (base == 0)
				throw new RuntimeException("分母不能为零");
			exponent = -n;
		} else
		{
			return 1;
		}

		while (exponent != 0)
		{
			if ((exponent & 1) == 1)
				result *= curr;
			curr *= curr;
			exponent >>= 1;
		}
		return n >= 0 ? result : (1 / result);
	}
}
