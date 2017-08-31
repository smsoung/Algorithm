package chapter02;

import java.util.Scanner;

import org.xml.sax.HandlerBase;

class Lnode
{
	public char data;
	public Lnode next;
}

public class LinkedList
{
	Lnode h = null;

	public void setH(Lnode h)
	{
		this.h = h;
	}

	/**
	 * 算法2.5 头插法
	 */
	public LinkedList()
	{
		char ch;
		Lnode p;
		h = new Lnode();
		h.next = null;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int i = 0;
		while (i < str.length())
		{
			ch = str.charAt(i);
			p = new Lnode();
			p.data = ch;
			p.next = h.next;
			h.next = p;
			i++;
		}
	}

	/**
	 * 算法2.7 求单链表的长度
	 * 
	 * @return
	 */
	public int size()
	{
		Lnode p;
		int i = 0;
		p = h.next;
		while (p != null)
		{
			i++;
			p = p.next;
		}
		return i;
	}

	/**
	 * 算法2.8 插入算法
	 * 
	 * @param p
	 * @param x
	 */
	public void insertElenmentAfter(Lnode p, char x)
	{
		Lnode s = new Lnode();
		s.data = x;
		s.next = p.next;
		p.next = s;
	}

	/**
	 * 算法2.9 插入算法
	 * 
	 * @param i
	 * @param x
	 * @return
	 */
	public int insertElementAt(int i, char x)
	{
		Lnode p, s;
		int j;
		p = h;
		j = 0;
		while (p != null && j < i - 1)
		{
			p = p.next;
			j++;
		}
		if (p != null)
		{
			s = new Lnode();
			s.data = x;
			s.next = p.next;
			p.next = s;
			return 1;
		} else
		{
			return 0;
		}

	}

	/**
	 * 算法2.10 删除算法
	 * 
	 * @param p
	 */
	public void remove(Lnode p)
	{
		Lnode q;
		if (p.next != null)
		{
			q = p.next;
			p.next = q.next;
			q = null;
		}
	}

	/**
	 * 算法2.11 按值查找
	 * 
	 * @param x
	 * @return
	 */
	public Lnode search(char x)
	{
		Lnode p;
		p = h.next;
		while (p != null && p.data != x)
		{
			p = p.next;
		}
		return p;
	}

	/**
	 * 算法2.11 取元素
	 * 
	 * @param i
	 * @return
	 */
	public Lnode getNode(int i)
	{
		Lnode p;
		int j;
		p = h.next;
		j = 1;
		while (p != null && j < i)
		{
			p = p.next;
			j++;
		}
		if (j == i)
			return p;
		else
			return null;
	}

	/**
	 * 算法2.24 单链表的逆置
	 * 
	 * @param h
	 * @return
	 */
	public int inverse(Lnode h)
	{
		Lnode r, q, p;
		p = h.next;
		if (p == null)
			return 0;
		else if (p.next == null)
			return 0;

		q = p;
		p = p.next;
		q.next = null;
		while (p != null)
		{
			r = p.next;
			p.next = q;
			q = p;
			p = r;
		}
		h.next = q;
		return 1;
	}

	public Lnode hb(Lnode pa, Lnode pb)
	{

		Lnode p, q, pc;
		pc = new Lnode();
		p = pc;
		while (pa != null && pb != null)
		{
			q = new Lnode();
			if (pb.data < pb.data)
			{
				q.data = pb.data;
				pb = pb.next;
			} else
			{
				q.data = pa.data;
				pa = pa.next;
			}
			p.next = q;
			p = q;
		}
		while (pa != null)
		{
			q = new Lnode();
			q.data = pa.data;
			pa = pa.next;
			p.next = q;
			p = q;
		}
		while (pb != null)
		{
			q = new Lnode();
			q.data = pb.data;
			pb = pb.next;
			p.next = q;
			p = q;
		}
		p.next = null;
		return pc;
	}

	public void clear()
	{
		// TODO Auto-generated method stub
	}

	public boolean isEmpty()
	{
		// TODO Auto-generated method stub
		return false;
	}

	public int indexOf(Lnode p)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public Lnode getPre(Lnode p)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public Lnode getNext(Lnode p)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public Lnode remove(int i)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
