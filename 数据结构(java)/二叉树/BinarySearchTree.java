package 二叉树;

/**
 * 二叉搜索树
 * 
 * @author ssm
 *
 */
public class BinarySearchTree
{
	/**
	 * 查找操作 递归算法
	 * 
	 * @param x
	 * @param root
	 * @return
	 */
	TreeNode find(int x, TreeNode root)
	{
		if (root == null)// 树为空，返回NULL
			return null;

		if (x < root.data)// X小于根结点键值，只需在左子树中继续搜索
			return find(x, root.left);
		else if (x > root.data)// X大于根结点的键值， 在右子树中进行继续搜索
			return find(x, root.right);
		else
			return root;// 查找成功， 返回结点的找到结点的地址
	}

	/**
	 * 查找操作 非递归算法
	 * 
	 * @param x
	 * @param root
	 * @return
	 */
	TreeNode find2(int x, TreeNode root)
	{
		while (root != null)
		{
			if (x < root.data)
				root = root.left;// 向左子树中移动， 继续查找
			else if (x > root.data)
				root = root.right;// 向右子树中移动， 继续查找
			else
				return root;// 查找成功， 返回结点的找到结点的地址
		}
		return null;// 查找失败
	}

	/**
	 * 查找最小元素 递归函数
	 * 
	 * @param root
	 * @return
	 */
	TreeNode findMin(TreeNode root)
	{
		if (root == null)// 空的二叉搜索树，返回NULL
			return null;
		else if (root.left == null)
			return root;// 找到最左叶结点并返回
		else
			return findMin(root.left);// 沿左分支继续查找
	}

	/**
	 * 查找最大元素 非递归函数
	 * 
	 * @param root
	 * @return
	 */
	TreeNode findMax(TreeNode root)
	{
		if (root != null)
		{
			while (root.right != null)
				root = root.right;
		}
		return root;
	}

	/**
	 * 插入元素 递归算法
	 * 
	 * @param x
	 * @param root
	 * @return
	 */
	TreeNode insert(int x, TreeNode root)
	{
		if (root == null)
		{
			root = new TreeNode();
			root.data = x;
			root.left = root.right = null;
		} else
		{
			if (x < root.data)
			{
				return insert(x, root.left);
			} else if (x > root.data)
			{
				return insert(x, root.right);
			}
		}
		return root;
	}

	
}
