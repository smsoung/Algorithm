package JZ;

public class JZ2_替换空格 {
	
	public static String replaceSpace(StringBuffer sb) {
		int spacenum = 0;// 空格数
		for (int i = 0; i < sb.length(); i++)// 遍历一遍字符串找出空格的数量
		{
			if (sb.charAt(i) == ' ')
				spacenum++;
		}

		int indexold = sb.length() - 1;// indexold为替换前的sb下标
		int newlength = sb.length() + spacenum * 2;// 计算空格转换成%20之后的sb长度
		int indexnew = newlength - 1;// indexnew为把空格替换为%20后的sb下标
		sb.setLength(newlength);// 使sb的长度扩大到转换成%20之后的长度,防止下标越界
		// 从后往前插入
		for (; indexold >= 0 && indexold < newlength; indexold--) {
			// 如果字符为空格，将'%20'插入到新的位置
			if (sb.charAt(indexold) == ' ') {
				sb.setCharAt(indexnew--, '0');
				sb.setCharAt(indexnew--, '2');
				sb.setCharAt(indexnew--, '%');
			} else {
				// 否则将老的字符，插入到新的位置
				sb.setCharAt(indexnew--, sb.charAt(indexold));
			}
			System.out.println(sb.toString());
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc def ghj");
		System.out.println(replaceSpace(sb));
	}

}
