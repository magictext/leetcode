package me_103;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import addOneRowtoTree.TreeNode;

public class Solution {
	// public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	// if (root == null) {
	// return new ArrayList<>();
	// }
	// ArrayList<List<Integer>> fin = new ArrayList<>();
	// ArrayList<Integer> res = new ArrayList<>();
	// Stack<TreeNode> stack = new Stack<>();
	// Stack<TreeNode> temp = new Stack<>();
	// stack.push(root);
	// do {
	// while (!stack.isEmpty()) {
	// TreeNode treeNode = stack.pop();
	// res.add(treeNode.val);
	// if (treeNode.left != null) {
	// temp.push(treeNode.left);
	// }
	// if (treeNode.right != null) {
	// temp.push(treeNode.right);
	// }
	// }
	// fin.add(res);
	// res = new ArrayList<>();
	// stack=(Stack<TreeNode>) temp.clone();
	// temp.clear();
	// } while (stack!=null);
	//
	// return fin;
	// }

	public List<List<Integer>> levelOrder(TreeNode root) {
		boolean flag = true;
		List<List<Integer>> res = new ArrayList<>();
		if (root == null) {
			return res;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			ArrayList<Integer> temp = new ArrayList<>();
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode head = queue.poll();
				temp.add(head.val);
				if (head.left != null) {
					queue.add(head.left);
				}
				if (head.right != null) {
					queue.add(head.right);
				}
			}
			if (flag == false) {
				ArrayList<Integer> arrayList = (ArrayList<Integer>) temp.clone();
				temp.clear();
				for (int i = arrayList.size() - 1; i >= 0; i--) {
					temp.add(arrayList.get(i));
				}
			}
			res.add(temp);
			flag = !flag;
		}
		return res;
	}

}
