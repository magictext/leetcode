package me_94;

import java.util.ArrayList;
import java.util.List;

import addOneRowtoTree.TreeNode;

//·µ»ØÖÐÐò
public class Solution {
	List<Integer> list;
	public void inorder(TreeNode node) {
		if (node != null) {
			inorder(node.left);
			list.add(node.val);
			inorder(node.right);
		}

	}
	public List<Integer> inorderTraversal(TreeNode root) {
		list = new ArrayList<Integer>();
		inorder(root);
		return list;
	}
}
