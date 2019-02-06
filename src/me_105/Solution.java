package me_105;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import addOneRowtoTree.TreeNode;

public class Solution {
	public TreeNode BuildTree2(int[] preorder, int l1, int r1, int[] inorder, int l2, int r2) {
		if (l1 > r1)
			return null;
		if (l1 == r1)
			return new TreeNode(preorder[l1]);

		int head = preorder[l1];
		TreeNode root = new TreeNode(head);
		int i;
		for (i = l2; i <= r2; i++) {
			if (inorder[i] == head)
				break;
		}
		root.left = BuildTree2(preorder,l1+1,l1+i-l2,inorder,l2,i-1);
		root.right = BuildTree2(preorder,l1+i-l2+1,r1,inorder,i+1,r2);
		return root;
	}

	public TreeNode BuildTree(int[] preorder, int[] inorder) {
		if (preorder.length == 0)
			return null;
		return BuildTree2(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
	}
}
