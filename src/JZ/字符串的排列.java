package JZ;

import java.util.ArrayList;
import java.util.List;

public class 字符串的排列 {

	public static ArrayList<String> Permutation(String str) {
		List<String> list = new ArrayList<>();
		PermutationHelper(str.toCharArray(), 0, list);
		return (ArrayList<String>) list;
	}

	public static void PermutationHelper(char[] cs, int i, List<String> list) {
		// 递归结束条件：索引已经指向c最后一个元素时
		if (i == cs.length - 1) {
			String val = String.valueOf(cs);
			if (!list.contains(val)) {
				list.add(val);
				return;
			}
		} else {
			for (int j = i; j < cs.length; j++) {
				swap(cs, i, j);
				PermutationHelper(cs, i + 1, list);
				swap(cs, i, j);
			}
		}
	}

	// 交换元素
	public static void swap(char[] cs, int i, int j) {
		if (i != j) {
			char temp = cs[i];
			cs[i] = cs[j];
			cs[j] = temp;
		}
	}
}
