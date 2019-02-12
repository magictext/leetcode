package me_199;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import addOneRowtoTree.TreeNode;

public class Solution {
	public List<Integer> rightSideView(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		Queue<TreeNode> temp = new LinkedList<>();
		ArrayList<Integer> arrayList = new ArrayList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode treeNode = queue.poll();
			arrayList.add(treeNode.val);
			if (treeNode.left != null) {
				queue.add(treeNode.left);
			}

			if (treeNode.right != null) {
				queue.add(treeNode.right);
			}
		}
		

	}
}
