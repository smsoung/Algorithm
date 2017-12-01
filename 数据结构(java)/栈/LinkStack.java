package 栈;

public class LinkStack
{
	/**
	 * 栈顶指针 指针变量
	 */
	Stacknode top;

	/**
	 * 入栈
	 * 
	 * @param x
	 */
	public void push(int x)
	{
		Stacknode s = null;
		s = new Stacknode();
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
			Stacknode p = top;
			top = p.next;
			p = null;
			return x;
		}
	}
}
