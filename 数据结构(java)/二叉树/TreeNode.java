package 二叉树;

import java.util.Stack;

public class TreeNode
{
	int data;
	TreeNode left, right;

	public TreeNode()
	{
	}

	public TreeNode(int var)
	{
		this.data = var;
		this.left = null;
		this.right = null;
	}

	public TreeNode(int val, TreeNode left, TreeNode right)
	{
		this.data = val;
		this.left = left;
		this.right = right;
	}

	/**
	 * 先序遍历 递归算法
	 * 
	 * @param root
	 */
	public void preOrder(TreeNode root)
	{
		if (root != null)
		{
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
	public void inOrder(TreeNode root)
	{
		if (root != null)
		{
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
	public void postOrder(TreeNode root)
	{
		if (root != null)
		{
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
	public void preOrderTraversal(TreeNode root)
	{
		Stack<TreeNode> s = new Stack<>();
		while (root != null || !s.empty())
		{
			while (root != null)
			{
				System.out.println(root.data);
				s.push(root);
				root = root.left;
			}
			if (!s.empty())
			{
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
	public void inOrderTraversal(TreeNode root)
	{
		Stack<TreeNode> s = new Stack<>();
		while (root != null || !s.empty())
		{
			while (root != null)
			{
				s.push(root);
				root = root.left;
			}
			if (!s.empty())
			{
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
	public void postOrderTraversal(TreeNode root)
	{
		Stack<TreeNode> s = new Stack<>();
		int flag = 0;
		while (root != null || !s.empty())
		{
			while (root != null)
			{
				flag = 1;
				s.push(root);
				root = root.left;
			}
			if (!s.empty())
			{
				root = s.pop();
				if (flag == 1)
				{
					flag = 0;
					s.push(root);
					root = root.right;
				} else
				{
					System.out.println(root.data);
					root = null;
				}
			}
		}
	}
}
