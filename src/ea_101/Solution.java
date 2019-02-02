package ea_101;

import java.util.ArrayList;
import java.util.List;

import addOneRowtoTree.TreeNode;

public class Solution {
	boolean flag=true;
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
					inOrder(node1.left, node2.right);
					inOrder(node1.right, node2.left);
				}
			}
		}
	}

	public boolean isSymmetric(TreeNode root) {
		flag=true;
		inOrder(root, root);
		return flag;
    }	
	public static void main(String[] args) {
		System.out.println(new ArrayList<>().equals(new ArrayList<>()));
	}
}
