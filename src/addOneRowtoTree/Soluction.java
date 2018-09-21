package addOneRowtoTree;

public class Soluction {
	public TreeNode addOneRow(TreeNode root, int v, int d) {
		TreeNode r = root;
		if (d <= 1) {
			TreeNode r1 = new TreeNode(v);
			r1.left = root;
			return r1;
		}
		if (d != 2) {
			if (root.left != null) {
				addOneRow(root.left, v, d - 1);
			}
			if (root.right != null) {
				addOneRow(root.right, v, d - 1);
			}

		} else {
			TreeNode lNode = new TreeNode(v);
			TreeNode rNode = new TreeNode(v);
			if (root.left != null) {
				lNode.left = root.left;
			}
			if (root.right != null) {
				rNode.right = root.right;
			}
			root.left = lNode;
			root.right = rNode;
		}
		return r;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode rNode = root;
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
//		root.left.right = new TreeNode(1);
//		root.right.left = new TreeNode(5);
		System.out.println(root);
		System.out.println(new Soluction().addOneRow(root, 5, 4));
	}
}