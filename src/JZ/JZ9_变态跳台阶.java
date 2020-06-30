package JZ;

public class JZ9_变态跳台阶 {
	
	public int JumpFloorII(int target) {
		if (target <= 1)
			return target;
		return 2 * JumpFloorII(target - 1);
	}

}
