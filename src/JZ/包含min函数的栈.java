package JZ;

import java.util.Stack;

public class 包含min函数的栈 {
	
	Stack<Integer> data = new Stack<>();// 数据栈
	Stack<Integer> min = new Stack<>();// 辅助栈

	public void push(int node) {
		data.push(node);
		if (min.empty() || node < min.peek())
			min.push(node);
		else
			min.push(min.peek());
	}

	public void pop() {
		data.pop();
		min.pop();
	}

	public int top() {
		return data.peek();
	}

	public int min() {
		return min.peek();
	}
}
