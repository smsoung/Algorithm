
public class 跳台阶
{
	public int JumpFloor(int target)
	{
		if (target <= 2)
			return target;
		return JumpFloor(target - 1) + JumpFloor(target - 2);
	}
}
