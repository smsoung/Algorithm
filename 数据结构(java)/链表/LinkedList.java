package 链表;

import java.util.Scanner;

public class LinkedList
{
	Lnode h = null;

	public LinkedList()
	{
		h = new Lnode();// 建立头结点，并使其指针域为空
		h.next = null;
		Scanner sc = new Scanner(System.in);// 读入字符串
		String str = sc.nextLine();
		int i = 0;
		while (i < str.length())
		{
			Lnode p = new Lnode();// 建立新结点p
			p.data = str.charAt(i);// 将字符赋给数据域
			p.next = h.next;// 改变指针状况
			h.next = p;// h的直接后继是p
			i++;
		}
	}

	public int size()
	{
		Lnode p;// 设置指针变量p
		int i = 0;
		p = h.next;// p指向第一个结点
		while (p != null)
		{
			i++;
			p = p.next;// p指针后移
		}
		return i;
	}

	public void insertElementAfter(Lnode p, char x)
	{
		Lnode s = new Lnode();// 生成一个新结点s
		s.data = x;
		s.next = p.next;// 新结点链入单链表中
		p.next = s;
	}

	public int insertElementAt(int i, char x)
	{
		Lnode p, s;// 定义指针变量p,定义结点s
		p = h;// 初始化指针变量
		int j = 0;
		while (p != null && j < i - 1)// 寻找第i-1号结点
		{
			p = p.next;
			j++;
		}
		if (p != null)
		{
			s = new Lnode();
			s.data = x;
			s.next = p.next;// 改变指针状态，将s插入表中
			p.next = s;
			return 1;// 返回1表示正常结束
		} else
		{
			return 0;// 返回0表示插入失败
		}
	}

	public void remove(Lnode p)
	{
		Lnode q;
		if (p.next != null)
		{
			q = p.next;// q位p的直接后继
			p.next = q.next;// 删除q
			q = null;// 释放q结点空间
		}
	}

	public Lnode search(char x)
	{
		Lnode p = h.next;
		while (p != null && p.data != x)
		{
			p = p.next;
		}
		return p;
	}
}
