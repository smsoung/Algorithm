package 栈;

public class SequentialStack
{
	final int maxsize = 100;
	int[] arr = new int[maxsize];
	/**
	 * 栈顶指针 top不是指针变量，只是整型变量
	 */
	int top;

	/**
	 * 入栈
	 * 
	 * @param x
	 */
	public void push(int x)
	{
		if (top == maxsize)// 若栈s未满，将x压入栈中；否则，栈的状态不变并给出错误信息
			System.out.println("溢出");
		else
			arr[top++] = x;
	}

	/**
	 * 出栈
	 * 
	 * @return
	 */
	public int pop()
	{
		if (top == 0)// 若栈不空，则删去栈顶元素并返回元素值，否则返回空元素null
			return 0;
		else
		{
			top--;
			return arr[top];
		}
	}

}
