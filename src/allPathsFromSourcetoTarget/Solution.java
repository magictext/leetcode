package allPathsFromSourcetoTarget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import sun.launcher.resources.launcher;

public class Solution {
	List<List<Integer>> reslist = new ArrayList<>();

	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
		reslist = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(0);
		doing(linkedList, graph, 0);
		return reslist;
	}

	public void doing(List<Integer> res, int[][] graph, int x) {
		if (res.get(res.size() - 1) == graph.length - 1) {
			reslist.add(res);
		} else {
			ArrayList<Integer> list = new ArrayList<>(res);
			for (int i = 0; i < graph[x].length; i++) {
				res.add(graph[x][i]);
				doing(res, graph,graph[x][i]);
				res = new ArrayList<>(list);
			}
		}

	}

	public static void main(String[] args) {
		int arr[][] = new int[4][];
		arr[0] = new int[] { 1, 2 };
		arr[1] = new int[] { 3 };
		arr[2] = new int[] { 3 };
		arr[3] = new int[] {};
		for (int[] is : arr) {
			System.out.print(Arrays.toString(is));
		}
		System.out.println(new Solution().allPathsSourceTarget(arr));
	}

}
