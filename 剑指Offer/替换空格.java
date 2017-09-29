
public class 替换空格
{
	public static String replaceSpace(StringBuffer sb)
	{
		int spacenum = 0;//spacenum为计算空格数
		for (int i = 0; i < sb.length(); i++)
		{
			if (sb.charAt(i) == ' ')
				spacenum++;
		}

		int indexold = sb.length() - 1;//indexold为替换前的sb下标
		int newlength = sb.length() + spacenum * 2;//转换之后的长度
		int indexnew = newlength - 1;//indexnew为替换后sb的下标
		sb.setLength(newlength);//使sb的长度扩大到转换成%20之后的长度，防止下标越界
		System.out.println(sb.toString());
		
		for (; indexold >= 0 && indexold < newlength; indexold--)
		{
			
			if (sb.charAt(indexold) == ' ')
			{
				sb.setCharAt(indexnew--, '0');
				sb.setCharAt(indexnew--, '2');
				sb.setCharAt(indexnew--, '%');
			} else
			{
				sb.setCharAt(indexnew--, sb.charAt(indexold));
			}
			System.out.println(sb.toString());
		}
		return sb.toString();
	}

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("abc def ghj");
		System.out.println(replaceSpace(sb));
	}

}
