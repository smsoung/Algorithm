package chapter02;

public class SqList
{
	final int maxlen = 1000;
	int[] arr = new int[maxlen];
	int len = arr.length;
	
	public int getMaxlen()
	{
		return maxlen;
	}
	
	public int size()//算法2.1
	{
		return len;
	}

	public void insertElementAt(Object obj, int i)//算法2.2
	{
		int j;
		if (len == maxlen)
		{
			System.out.println("溢出");
			return;
		} else
		{
			if (i < 1 || i > len + 1)
			{
				System.out.println("插入位置不正确");
				return;
			} else
			{
				for (j = len - 1; j >= i - 1; j--)
					arr[j + 1] = arr[j];
				arr[i - 1] = (int) obj;
				len++;
				return;
			}
		}
	}

	public Object remove(int i)//算法2.3
	{
		// TODO Auto-generated method stub
		Object obj;
		int j;
		if (i < 1 || i > len)
		{
			System.out.println("删除位置不正确");
			return null;
		} else
		{
			obj = arr[i - 1];
			for (j = i; j < len; j++)
				arr[j - 1] = arr[j];
			len--;
			return obj;
		}
	}
	
	public int indexOf(Object obj)//算法2.4
	{
		int i;
		for (i = 0; i < len; i++)
		{
			if (obj.equals(arr[i]))
			{
				return i+1;
			}
		}
		return 0;
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

	public Object get(int i)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public Object getPre(Object obj)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public Object getNext(Object obj)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public Object remove(Object obj)
	{
		// TODO Auto-generated method stub
		return null;
	}
}
