package 代码的鲁棒性;

import 链表.ListNode;

public class 合并两个排序的链表 {

	public ListNode Merge(ListNode list1, ListNode list2) {
		if (list1 == null && list2 == null) {
			return null;
		} else if (list1 != null && list2 == null) {
			return list1;
		} else if (list1 == null && list2 != null) {
			return list2;
		}

		ListNode listMerge = null;
		if (list1.val <= list2.val) {
			listMerge = list1;
			listMerge.next = Merge(list1.next, list2);
		} else {
			listMerge = list2;
			listMerge.next = Merge(list1, list2.next);
		}
		return listMerge;
	}
}
