package JZ;

public class 二叉搜索树与双向链表 {

	TreeNode head = null;// 头结点
	TreeNode p = null;// 指针

	// 中序遍历
	public TreeNode convert(TreeNode root) {
		if (root == null)
			return null;
		// 递归遍历左子树
		convert(root.left);
		// 第一次走到左下的叶子结点(root)
		if (head == null) {
			head = root;// 指向叶子结点(root),找到双向链表的头结点
			p = root;// p指针指向叶子结点
			// 以后每遇到一个root结点，让p指向这个结点，让这个结点指向p
		} else {
			p.right = root;
			root.left = p;
			p = root;// p后移一位，指向root结点
		}
		// 递归遍历右子树
		convert(root.right);
		// 返回双向链表的头结点
		return head;
	}

}
