package 时间效率;

public class 数组中出现次数超过一半的数字 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 2, 2, 2, 5, 4, 2 };
		System.out.println(MoreThanHalfNum_Solution(array));
	}

	public static int MoreThanHalfNum_Solution(int[] array) {

		int result = array[0];
		int times = 0;
		// 遍历每个元素，并记录次数；若与前一个元素相同，则次数加1，否则次数减1
		for (int i = 1; i < array.length; i++) {
			if (times == 0) {
				// 更新result的值为当前元素，并置次数为1
				result = array[i];
				times = 1;
			} else if (array[i] == result) {
				times++;
			} else {
				times--;
			}
		}

		// 判断result是否符合条件，即出现次数大于数组长度的一半
		times = 0;
		for (int i = 0; i < array.length; i++) {
			if (result == array[i])
				times++;
		}

		return (times > array.length / 2) ? result : 0;
	}

}
