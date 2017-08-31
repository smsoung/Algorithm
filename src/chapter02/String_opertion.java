package chapter02;

import java.util.Arrays;

@SuppressWarnings("unused")
public class String_opertion
{
	/**
	 * 算法2.18 定位操作
	 * 
	 * @param s
	 * @param t
	 * @return
	 */
	public int index(String s, String t)
	{
		int s_length = s.length();
		int t_length = t.length();
		int i = 0;
		if (t == null)
			return 0;
		if (s_length < t_length)
			return 0;
		while (i <= (s_length - t_length))
		{
			if (t.equals(s.substring(i, i + t_length)))
			{
				return i;
			}
			i++;
		}
		return 0;
	}

	/**
	 * 算法2.19 字符串联接
	 * 
	 * @param s
	 * @param t
	 * @return
	 */
	public String concat(String s, String t)
	{
		int max = 100;
		String l = null;
		if (s.length() + t.length() < max)
		{
			l = s + t;
		}
		if (s.length() + t.length() > max && s.length() < max)
		{
			l = s + t.substring(0, max - s.length());
		}
		if (s.length() > max)
		{
			l = s.substring(0, max);
		}
		return l;
	}

	/**
	 * 算法2.20 求子串算法
	 * 
	 * @param sub
	 * @param s
	 * @param start
	 * @param len
	 * @return
	 */
	public static String SubStr(String sub, String s, int start, int len)
	{
		if (sub.length() == 0)
		{
			return null;
		}
		if ((start >= 0 && start <= s.length())
				&& (len >= 0 && len <= s.length() - start))
		{
			char[] arr = s.toCharArray();
			for (int i = start; i < start + len; i++)
			{
				sub = sub + arr[i];
			}
		}
		return sub;
	}

	/**
	 * 算法2.21 简单模式匹配算法
	 * 
	 * @param s
	 * @param t
	 * @return
	 */
	public int index_bf(String s, String t)
	{
		int i = 0, j = 0;
		while ((i < s.length()) && (j < t.length()))
		{
			if (s.substring(i, i + 1).equals(t.substring(j, j + 1)))
			{
				i = i + 1;
				j = j + 1;
			} else
			{
				i = i - j + 1;
				j = 0;
			}
		}
		if (j >= t.length())
			return i - t.length() + 1;
		else
			return 0;
	}

	public int[] Letter_FrequenCy(String text)
	{
		String str1 = "abcdefghijklmnopqrstuvwxyz";
		String str2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int[] text_Frequency = new int[26];
		for (int i = 0; i < text.length(); i++)
		{
			String c = text.substring(i, i + 1);
			int j = str1.indexOf(c);
			if (j == -1)
			{
				j = str2.indexOf(c);
			}
			if (j >= 0)
			{
				text_Frequency[j]++;
			}
		}
		return text_Frequency;
	}

//	public static void main(String[] args)
//	{
//		String_opertion str = new String_opertion();
//		String s = "asdfghjklzxcvbnm";
//		String t = "bnm";
//		System.out.println(str.index(s, t));
//		System.out.println(Arrays.toString(str.Letter_FrequenCy(s)));
//	}
}
