import java.util.ArrayList;
import java.util.Stack;

class ListNode
{
	int val;
	ListNode next = null;
	
	ListNode(int val)
	{
		this.val = val;
	}
}

public class 从尾到头打印链表
{
	ArrayList<Integer> arrayList = new ArrayList<>();
	//递归实现
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode)
	{
		if (listNode != null)
		{
			printListFromTailToHead(listNode.next);
			arrayList.add(listNode.val);
		}
		return arrayList;
	}
	
	//借助栈实现
	public ArrayList<Integer> printListFromTailToHead1(ListNode listNode){
		Stack<Integer> stack = new Stack<>();
		while(listNode!=null) {
			stack.push(listNode.val);
			listNode=listNode.next;
		}
		while(!stack.isEmpty()) {
			arrayList.add(stack.pop());
		}
		return arrayList;
	}
}
