package ea_100;

import java.util.List;

import addOneRowtoTree.TreeNode;

public class Solution {
	boolean flag = true;
	private void inOrder(TreeNode node1, TreeNode node2) {
		if (!flag) {
			return;
		} else {
			if (node1 == null) {
				if (node2 == null) {
					return;
				} else {
					flag = false;
				}
			} else {
				if (node2 == null) {
					flag = false;
				} else {
					if (node1.val != node2.val) {
						flag = false;
					}
					inOrder(node1.left, node2.left);
					inOrder(node1.right, node2.right);
				}
			}

		}

	}

	public boolean isSameTree(TreeNode p, TreeNode q) {
		inOrder(p, q);
		return flag;
	}
}
