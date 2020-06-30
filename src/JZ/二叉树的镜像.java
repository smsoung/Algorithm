package JZ;

public class 二叉树的镜像 {
	
	public void Mirror(TreeNode root) {
		if (root == null)
			return;
		if (root.left == null && root.right == null)
			return;

		TreeNode pTemp = root.left;
		root.left = root.right;
		root.right = pTemp;

		Mirror(root.left);
		Mirror(root.right);
	}
}
