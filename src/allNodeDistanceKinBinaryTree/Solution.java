package allNodeDistanceKinBinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	static ArrayList<Integer>[] arr=new ArrayList[500];
	public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        createtable(root);
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<Integer> listtemp=new ArrayList<Integer>();
        ArrayList<Integer> rub=new ArrayList<Integer>();
        list.add(target.val);
        while (K>0) {
			for(int i=0;i<list.size();i++){
				if(arr[list.get(i)]!=null)
				listtemp.addAll(arr[list.get(i)]);
			}
			listtemp=new ArrayList<>(new HashSet<>(listtemp));
			System.out.println(listtemp);
			rub.addAll(list);
			list=(ArrayList<Integer>) listtemp.clone();
			listtemp.clear();
			K--;
		}
        list.removeAll(rub);
        list=new ArrayList<>(new HashSet<>(list));
        arr=new ArrayList[500];
        return list;
    }
public void createtable(TreeNode root) {
        if(root!=null){
        	if(root.left!=null){
        		if(arr[root.val]!=null){
        			arr[root.val].add(root.left.val);
        		}
        		else {
        			arr[root.val]=new ArrayList<Integer>();
        			arr[root.val].add(root.left.val);
				}
        		if(arr[root.left.val]!=null){
        			arr[root.left.val].add(root.val);
        		}
        		else {
        			arr[root.left.val]=new ArrayList<Integer>();
        			arr[root.left.val].add(root.val);
				}
        		createtable(root.left);
        	}
        	if (root.right!=null) {
        		if(arr[root.val]!=null){
        			arr[root.val].add(root.right.val);
        		}
        		else {
        			arr[root.val]=new ArrayList<Integer>();
        			arr[root.val].add(root.right.val);
				}
        		if(arr[root.right.val]!=null){
        			arr[root.right.val].add(root.val);
        		}
        		else {
        			arr[root.right.val]=new ArrayList<Integer>();
        			arr[root.right.val].add(root.val);
				}
        		createtable(root.right);
			}
        }
}

public static void main(String[] args) {
	TreeNode root = new TreeNode(3);
	TreeNode rNode = root;
	root.left = new TreeNode(5);
	root.right = new TreeNode(1);
	root.left.left = new TreeNode(6);
	root.left.right = new TreeNode(2);
	root.left.right.left = new TreeNode(7);
	root.left.right.right = new TreeNode(4);
	root.right.left=new TreeNode(0);
	root.right.right=new TreeNode(8);
	System.out.println(root);
	System.out.println(new Solution().distanceK(root, new TreeNode(5), 3));
}
}
