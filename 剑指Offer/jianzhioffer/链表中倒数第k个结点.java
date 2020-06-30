package jianzhioffer;

public class 链表中倒数第k个结点 {

	public static ListNode FindKthToTail(ListNode head, int k) {
		if (head == null || k <= 0)
			return null;
		ListNode pre = head;
		ListNode last = head;
		for (int i = 0; i < k - 1; i++) {
			if (pre.next != null)
				pre = pre.next;
			else
				return null;
		}

		while (pre.next != null) {
			pre = pre.next;
			last = last.next;
		}

		return last;
	}
}