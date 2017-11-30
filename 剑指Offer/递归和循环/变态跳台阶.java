package 递归和循环;

public class 变态跳台阶
{
	public int JumpFloorII(int target)
	{
		if (target <= 1)
			return target;
		return 2 * JumpFloorII(target - 1);

	}
}
