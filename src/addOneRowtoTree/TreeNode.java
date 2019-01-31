package addOneRowtoTree;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int x) {
		val = x;
	}

	@Override
	public String toString() {
		if (left == null && right == null)
			return "[val=" + val + "]";
		else if (left == null && right != null)
			return "TreeNode [val=" + val + ", left=null"  + ", right="+ right.toString() + "]";
		else if (right == null && left != null)
			return "TreeNode [val=" + val + ", left="+ left.toString() + ", right=null"  + "]";
		else if(right!=null&&left!=null)
			return "TreeNode [val=" + val + ", left=" + left.toString() + ", right=" + right.toString() + "]";
		else {
			return null;
		}
	}

}
