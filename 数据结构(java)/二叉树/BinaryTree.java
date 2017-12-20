package 二叉树;

import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	
	/**
	 * 先序遍历 递归算法
	 * 
	 * @param root
	 */
	public void preOrder(TreeNode root) {
		if (root != null) {
			System.out.println(root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	/**
	 * 中序遍历 递归算法
	 * 
	 * @param root
	 */
	public void inOrder(TreeNode root) {
		if (root != null) {
			preOrder(root.left);
			System.out.println(root.data);
			preOrder(root.right);
		}
	}

	/**
	 * 后序遍历 递归算法
	 * 
	 * @param root
	 */
	public void postOrder(TreeNode root) {
		if (root != null) {
			preOrder(root.left);
			preOrder(root.right);
			System.out.println(root.data);
		}
	}

	/**
	 * 先序遍历 非递归算法
	 * 
	 * @param root
	 */
	public void preOrderTraversal(TreeNode root) {
		Stack<TreeNode> s = new Stack<>();
		while (root != null || !s.empty()) {
			while (root != null) {
				System.out.println(root.data);
				s.push(root);
				root = root.left;
			}
			if (!s.empty()) {
				root = s.pop();
				root = root.right;
			}
		}
	}

	/**
	 * 中序遍历 非递归算法
	 * 
	 * @param root
	 */
	public void inOrderTraversal(TreeNode root) {
		Stack<TreeNode> s = new Stack<>();
		while (root != null || !s.empty()) {
			while (root != null) {
				s.push(root);
				root = root.left;
			}
			if (!s.empty()) {
				root = s.pop();
				System.out.println(root.data);
				root = root.right;
			}
		}
	}

	/**
	 * 后序遍历 非递归算法
	 * 
	 * @param root
	 */
	public void postOrderTraversal(TreeNode root) {
		Stack<TreeNode> s = new Stack<>();
		int flag = 0;
		while (root != null || !s.empty()) {
			while (root != null) {
				flag = 1;
				s.push(root);
				root = root.left;
			}
			if (!s.empty()) {
				root = s.pop();
				if (flag == 1) {
					flag = 0;
					s.push(root);
					root = root.right;
				} else {
					System.out.println(root.data);
					root = null;
				}
			}
		}
	}

	/**
	 * 层序遍历 用队列实现
	 * 
	 * @param root
	 */
	@SuppressWarnings("null")
	public void levelOrderTraversal(TreeNode root) {
		Queue<TreeNode> queue = null;// 创建一个队列
		if (root == null)
			return;
		queue.add(root);// 添加根节点
		while (!queue.isEmpty())// 队列不为空
		{
			TreeNode t = queue.remove();// 删除并返回这个队列的头
			System.out.println(t);
			if (t.left != null)
				queue.add(t.left);
			if (t.right != null)
				queue.add(t.right);
		}
	}

	/**
	 * 输出二叉树中的叶子结点
	 * 
	 * @param root
	 */
	public void preOrderPrintLeaves(TreeNode root) {
		if (root != null) {
			if (root.left == null && root.right == null)// 如果左右子节点都为空，说明是叶子结点
				System.out.println(root.data);
			preOrderPrintLeaves(root.left);
			preOrderPrintLeaves(root.right);
		}
	}

	/**
	 * 二叉树的高度
	 * 
	 * @param root
	 * @return
	 */
	public int postOrderGetHeight(TreeNode root) {
		int HL, HR, MaxH;
		if (root != null) {
			HL = postOrderGetHeight(root.left);// 求左子树的深度
			HR = postOrderGetHeight(root.right);// 求右子树的深度
			MaxH = (HL > HR) ? HL : HR;// 取左右子树中较大的深度
			return MaxH + 1;// 返回树的深度
		} else
			return 0;// 空树的深度为0
	}
}
