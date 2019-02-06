package ea_104;

import java.util.List;

import addOneRowtoTree.TreeNode;

public class Solution {
	int deep=0;
	private void inOrder(TreeNode node,int count) {
        if (node == null) {
        	deep=Math.max(count-1, deep);
            return;
        }
        inOrder(node.left,++count);
        inOrder(node.right,++count);
    }
	public int maxDepth(TreeNode root) {
        inOrder(root, 1);
        return deep;
    }
	public static void main(String[] args) {
		int a=0;
		System.out.println(a++);
	}
}
