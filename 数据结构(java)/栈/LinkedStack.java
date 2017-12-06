package 栈;

public class LinkedStack
{
	/**
	 * 栈顶指针 指针变量
	 */
	StackNode top;

	/**
	 * 入栈
	 * 
	 * @param x
	 */
	public void push(int x)
	{
		StackNode s = null;
		s = new StackNode();
		s.data = x;
		s.next = top;
		top = s;
	}

	/**
	 * 出栈
	 * 
	 * @return
	 */
	public int pop()
	{
		if (top == null)
			return 0;
		else
		{
			int x = top.data;
			StackNode p = top;
			top = p.next;
			p = null;
			return x;
		}
	}
}
