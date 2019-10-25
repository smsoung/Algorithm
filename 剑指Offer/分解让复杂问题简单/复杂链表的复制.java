package 分解让复杂问题简单;

public class 复杂链表的复制 {
	
	public RandomListNode Clone(RandomListNode pHead) {

		if (pHead == null)
			return null;

		RandomListNode currentNode = pHead;
		// 1、复制每个结点，如复制结点A得到A1，将结点A1插到结点A后面；
		while (currentNode != null) {
			RandomListNode cloneNode = new RandomListNode(currentNode.label);
			RandomListNode nextNode = currentNode.next;
			currentNode.next = cloneNode;
			cloneNode.next = nextNode;
			currentNode = nextNode;
		}

		// 2、重新遍历链表，复制老结点的随机指针给新结点，如A1.random = A.random.next;
		currentNode = pHead;
		while (currentNode != null) {
			if (currentNode.random != null)
				currentNode.next.random = currentNode.random.next;
			currentNode = currentNode.next.next;
		}

		// 3、拆分链表，将链表拆分为原链表和复制后的链表
		currentNode = pHead;
		RandomListNode pCloneHead = pHead.next;
		while (currentNode != null) {
			RandomListNode cloneNode = currentNode.next;
			currentNode.next = cloneNode.next;
			if (cloneNode.next != null)
				cloneNode.next = cloneNode.next.next;
			currentNode = currentNode.next;
		}

		return pCloneHead;

	}
}
