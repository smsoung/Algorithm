package JZ;

import java.util.Stack;

public class 栈的压入_弹出序列 {
	
	public boolean IsPopOrder(int[] pushA, int[] popA) {
		if (pushA == null || popA == null)
			return false;
		Stack<Integer> stack = new Stack<>();
		// 弹出序列索引
		int popIndex = 0;
		for (int i = 0; i < pushA.length; i++) {
			stack.push(pushA[i]);
			// 如果栈不为空，且栈顶元素等于弹出序列
			while (!stack.empty() && stack.peek() == popA[popIndex]) {
				stack.pop();// 出栈
				popIndex++;// 弹出序列后移一位
			}
		}
		return stack.empty();
	}
}
