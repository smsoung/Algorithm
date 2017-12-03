package 队列;

public class Lqueue
{
	NodeType front;
	NodeType rear;

	/**
	 * 初始化操作
	 */
	public Lqueue()
	{
		front = new NodeType();
		front.next = null;
		rear = front;
	}

	/**
	 * 判断队空操作
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		if (front == rear)
			return true;
		return false;
	}

	/**
	 * 求队长度操作
	 * 
	 * @return
	 */
	public int size()
	{
		NodeType p = front.next;
		int i = 0;
		while (p != null)
		{
			i++;
			p = p.next;
		}
		return i;
	}

	/**
	 * 读队头元素操作
	 * 
	 * @return
	 */
	public int head()
	{
		if (front == rear)
			return 0;
		else
			return front.next.data;
	}

	/**
	 * 入队操作
	 * 
	 * @param x
	 */
	public void enQueue(int x)
	{
		NodeType s = new NodeType();
		s.data = x;
		s.next = null;
		rear.next = s;
		rear = s;
	}

	/**
	 * 出队列操作
	 * 
	 * @return
	 */
	public int delQueue()
	{
		if (front == rear)
			return 0;
		else
		{
			NodeType p = front.next;
			front.next = p.next;
			if (p.next == null)
				rear = front;
			int x = p.data;
			p = null;
			return x;
		}
	}
}
