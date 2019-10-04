package 分解让复杂问题简单;

public class 二叉搜索树与双向链表 {

	TreeNode head = null;//头节点
	TreeNode p = null;//指针
	
	//中序遍历
	public TreeNode convert(TreeNode root) {
		if (root==null)
			return null;
		convert(root.left);
		if(head == null){
			head = root;
			p = root;
		}else {
			p.right = root;
			root.left = p;
			p = root;
		}
		convert(root.right);
		return head;
    }
	
}
