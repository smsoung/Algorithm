package 队列;

public class Cqueue
{
	final int maxsize = 100;
	int elem[] = new int[maxsize];
	int front, rear;

	public Cqueue()
	{
		front = 0;
		rear = 0;
	}

	/**
	 * 判断队空
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		if (rear == front)
			return true;
		return false;
	}

	/**
	 * 求队长度
	 * 
	 * @return
	 */
	public int size()
	{
		return ((rear - front + maxsize) % maxsize);
	}

	/**
	 * 读对头元素
	 * 
	 * @return
	 */
	public int head()
	{
		if (rear == front)
			return 0;
		else
			return elem[(front + 1) % maxsize];
	}

	/**
	 * 入队操作
	 * 
	 * @param x
	 */
	public void enQueue(int x)
	{
		if ((rear + 1) % maxsize == front)
			System.out.printf("溢出");
		else
		{
			rear = (rear + 1) % maxsize;
			elem[rear] = x;
		}
	}

	/**
	 * 出对操作
	 * 
	 * @return
	 */
	public int delQueue()
	{
		if (rear == front)
			return 0;
		else
		{
			front = (front + 1) % maxsize;
			return elem[front];
		}
	}

	
}