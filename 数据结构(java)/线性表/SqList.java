package 线性表;

public class SqList
{
	final int maxlen = 1000;
	Object[] arr = new Object[maxlen];
	int len = 0;

	/**
	 * 插入算法 在第i个元素插入一个新的元素
	 * 
	 * @param obj
	 * @param i
	 */
	public void insert(Object obj, int i)
	{
		if (len == maxlen)// 判断线性表的存储空间是否已满
		{
			System.out.println("溢出");
			return;
		} else
		{
			if (i < 1 || i > len + 1)// 检查i值是否超出所允许范围(i是序号)
			{
				System.out.println("插入位置不正确");
				return;
			} else
			{
				for (int j = len - 1; j >= i - 1; j--)// 将元素倒序后移一个位置(j是索引)
					arr[j + 1] = arr[j];
				arr[i - 1] = obj;// 新元素插入
				len++;// 线性表长度加1
				return;
			}
		}
	}

	/**
	 * 删除算法 i为删除元素的位序号，删除元素的值返回
	 * 
	 * @param i
	 * @return
	 */
	public Object remove(int i)
	{
		Object obj;
		if (i < 1 || i > len)// 检查i值是否超出所允许范围(i是序号)
		{
			System.out.println("删除位置不正确");
			return null;
		} else
		{
			obj = arr[i - 1];// 把第i个元素赋给obj
			for (int j = i; j < len; j++)// 将元素依次前移一个位置(j是索引)
				arr[j - 1] = arr[j];
			len--;// 线性表长度减1
			return obj;
		}
	}

	/**
	 * 查找算法
	 * 
	 * @param obj
	 * @return
	 */
	public int find(Object obj)
	{
		for (int i = 0; i < len; i++)// 在线性表中按顺序查找
		{
			if (obj.equals(arr[i]))
				return i + 1;
		}
		return -1;
	}
}
