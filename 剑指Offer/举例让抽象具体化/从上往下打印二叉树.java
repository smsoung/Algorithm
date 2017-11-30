package 举例让抽象具体化;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 从上往下打印二叉树
{
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root)
	{
		ArrayList<Integer> list = new ArrayList<>();
		if (root == null)
			return list;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty())
		{
			TreeNode treeNode = queue.poll();
			if (treeNode.left != null)
				queue.offer(treeNode.left);
			if (treeNode.right != null)
				queue.offer(treeNode.right);
			list.add(treeNode.val);
		}
		return list;
	}
}
