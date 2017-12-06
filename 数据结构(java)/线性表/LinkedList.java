package 线性表;

import java.util.Scanner;

public class LinkedList
{
	/**
	 * 头结点
	 */
	ListNode h = null;

	/**
	 * 设置头结点
	 * 
	 * @param h
	 */
	public void setH(ListNode h)
	{
		this.h = h;
	}

	/**
	 * 构造方法(头插法)
	 */
	@SuppressWarnings("resource")
	public LinkedList()
	{
		h = new ListNode();// 建立头结点，并使其指针域为空
		h.next = null;
		Scanner scanner = new Scanner(System.in);// 读入字符串
		String str = scanner.nextLine();
		int i = 0;
		while (i < str.length())
		{
			ListNode p = new ListNode();// 建立新结点p
			p.data = str.charAt(i);// 将字符赋给数据域
			p.next = h.next;// 改变指针状况
			h.next = p;// h的直接后继是p
			i++;
		}
	}

	/**
	 * 求单链表的长度
	 * 
	 * @return
	 */
	public int size()
	{
		ListNode p = h.next;// 设置指针变量p指向第一个结点
		int i = 0;
		while (p != null)// 依次访问单链表的每个结点，p=null时结束
		{
			i++;
			p = p.next;// p指针后移
		}
		return i;
	}

	/**
	 * 插入算法 将值为x的结点插在p之后
	 * 
	 * @param p
	 * @param x
	 */
	public void insertElementAfter(ListNode p, char x)
	{
		ListNode s = new ListNode();// 生成一个新结点s
		s.data = x;
		s.next = p.next;// 新结点链入单链表中
		p.next = s;
	}

	/**
	 * 插入算法 在第i个元素之前插入一个元素
	 * 
	 * @param i
	 * @param x
	 * @return
	 */
	public int insertElementAt(int i, char x)
	{
		ListNode p, s;// 定义指针变量p,定义结点s
		p = h;// 初始化指针变量
		int j = 0;
		while (p != null && j < i - 1)// 寻找第i-1号结点
		{
			p = p.next;
			j++;
		}
		if (p != null)
		{
			s = new ListNode();
			s.data = x;
			s.next = p.next;// 改变指针状态，将s插入表中
			p.next = s;
			return 1;// 返回1表示正常结束
		} else
		{
			return -1;// 返回-1表示插入失败
		}
	}

	/**
	 * 删除算法 删除p的后继结点
	 * 
	 * @param p
	 */
	public void remove(ListNode p)
	{
		ListNode q;
		if (p.next != null)
		{
			q = p.next;// q位p的直接后继
			p.next = q.next;// 删除q
			q = null;// 释放q结点空间
		}
	}

	/**
	 * 按值查找
	 * 
	 * @param x
	 * @return
	 */
	public ListNode search(char x)
	{
		ListNode p = h.next;
		while (p != null && p.data != x)
		{
			p = p.next;
		}
		return p;
	}

	/**
	 * 取元素
	 * 
	 * @param i
	 * @return
	 */
	public ListNode get(int i)
	{
		ListNode p = h.next;
		int j = 1;
		while (p != null && j < i)// 移动指针p,直到p为空或p指向第i个元素
		{
			p = p.next;
			j++;
		}
		if (i == j)
			return p;// 返回第i个元素的存储地址
		else
			return null;
	}
}
