package jianzhioffer;

import java.util.Arrays;

public class 二叉搜索树的后序遍历序列 {
	
	public static boolean VerifySquenceOfBST(int[] sequence) {
		if (sequence == null || sequence.length <= 0)
			return false;
		int root = sequence[sequence.length - 1];

		// 在二叉搜索树中左子数的结点小于根节点
		int i = 0;
		for (; i < sequence.length - 1; i++) {
			if (sequence[i] > root)
				break;
		}

		// 在二叉搜索树中右子树的结点大于根节点
		int j = i;
		for (; j < sequence.length - 1; j++) {
			if (sequence[j] < root)
				return false;
		}

		// 判断左子树是不是二叉搜索树
		boolean left = true;
		if (i > 0)
			left = VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i));

		// 判断右子树是不是二叉搜索树
		boolean right = true;
		if (i < sequence.length - 1)
			right = VerifySquenceOfBST(Arrays.copyOfRange(sequence, i, sequence.length - 1));

		return (left && right);
	}

	public static void main(String[] args) {
		int[] sequence = { 5, 7, 6, 9, 11, 10, 8 };
		System.out.println(VerifySquenceOfBST(sequence));
	}

}
