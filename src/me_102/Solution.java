package me_102;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sun.javafx.sg.prism.web.NGWebView;
import com.sun.org.apache.regexp.internal.recompile;

import addOneRowtoTree.TreeNode;

public class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		if (root==null) {
			return new ArrayList<>();
		}
        ArrayList<TreeNode> arrayList=new ArrayList<>();
        ArrayList<TreeNode> temp=new ArrayList<>();
        ArrayList<List<Integer>> fin=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        arrayList.add(root);
        while (!arrayList.isEmpty()) {
        	res=new ArrayList<>();
			for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
				TreeNode treeNode = (TreeNode) iterator.next();
				res.add(treeNode.val);
				if(treeNode.left!=null){
					temp.add(treeNode.left);
				}
				if (treeNode.right!=null) {
					temp.add(treeNode.right);
				}
			}
			fin.add(res);
			arrayList=(ArrayList<TreeNode>) temp.clone();
			temp.clear();
		}
        return fin;
    }
}
