package me_105;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import addOneRowtoTree.TreeNode;

public class Solution2 {
	int[] preorder;
	int[] inorder;
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if (inorder.length==1) {
			return new TreeNode(inorder[0]);
		}
		if (inorder.length==0) {
			return null;
		}
        this.preorder=preorder;
        this.inorder=inorder;
        TreeNode root=new TreeNode(inorder[0]);
        int mid=Arrays.binarySearch(preorder, inorder[0]);
        int mid2=Arrays.binarySearch(inorder, preorder[mid-1]);
        build(root,0,mid-1, 1, mid2);
        build(root,mid, preorder.length-1,mid2+1, preorder.length-1);
        return root;
    }
	public void build(TreeNode tree,int preleft,int preright,int inleft,int inright) {
		if (preright-preleft==0) {
			tree=new TreeNode(preorder[preleft]);
		}else if (preright<preleft) {
			return;
		}else {
			tree=new TreeNode(inorder[inleft]);
			int mid=Arrays.binarySearch(preorder, inorder[inleft]);
			int mid2=Arrays.binarySearch(inorder, preorder[mid-1]);
			if (mid==preleft) {
				if(mid!=preright){
					build(tree.left,preleft, mid-1,inleft, mid2);
				}
			}else {
				if(mid==preright){
					build(tree, mid, preright, mid2,inright);
				}else {
					build(tree.left,preleft, mid-1,inleft, mid2);
					build(tree, mid, preright, mid2,inright);
				}
			}
		}	
	}
}
