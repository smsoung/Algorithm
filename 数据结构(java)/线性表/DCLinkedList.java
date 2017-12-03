package 线性表;

public class DCLinkedList
{
	/**
	 * 头结点
	 */
	DNode h = null;

	/**
	 * 插入算法 在结点p之前插入结点s
	 * 
	 * @param h
	 * @param i
	 * @param x
	 * @return
	 */
	public int insert(DNode h, int i, char x)
	{
		DNode p, s;
		p = h.next;
		int j = 1;
		while (p != h && j < i)// 查找第i个元素,直到p指向头结点h或p指向第i个元素结束
		{
			j++;
			p = p.next;
		}
		if (j == i)
		{
			s = new DNode();
			s.data = x;
			s.prior = p.prior;// 改变指针链接，使s插入p之前
			p.prior.next = s;
			s.next = p;
			p.prior = s;
			return 1;
		} else
			return 0;
	}

	/**
	 * 删除算法 删除第i个结点p
	 * 
	 * @param h
	 * @param i
	 * @return
	 */
	public char delete(DNode h, int i)
	{
		DNode p = h.next;
		int j = 1;
		while (p != h && j < i)// 在双向链表中依次查找第i个元素
		{
			j++;
			p = p.next;
		}

		if (j == i)
		{
			char s = p.data;
			p.prior.next = p.next;// 删除结点P
			p.next.prior = p.prior;
			p = null;// 释放P结点空间
			return s;
		} else
			return 0;
	}
}
