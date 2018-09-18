package _4Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThirdSolution {
	public int nextnum(int nums[], int key) {
		while (key+1<nums.length&&nums[key] == nums[key + 1]) {
			key++;
		}
		return key+1;
	}

	public int next_num(int nums[], int key) {
		while (key-1>0&&nums[key] == nums[key - 1]) {
			key--;
		}
		return key - 1;
	}

	public List<List<Integer>> threeSum(int[] nums,int target) {
		List<List<Integer>> list = new ArrayList<>();
		if (nums.length < 3)
			return list;
		Arrays.sort(nums);
		if (nums[0] > 0 || nums[nums.length - 1] < 0)
			return list;
		int x, y,tar;
		for (int p= 0; p < nums.length - 2; p=nextnum(nums, p)) {
		for (int t = p+1; t < nums.length - 2; t=nextnum(nums, t)) {
			
			tar = target - nums[t]-nums[p];
			x = t + 1;
			y = nums.length - 1;
			while (x < y) {
				if (nums[x] + nums[y] > tar)
					y = next_num(nums, y);
				else if (nums[x] + nums[y] < tar)
					x = nextnum(nums, x);
				else {
					ArrayList<Integer> list2 = new ArrayList<>();
					list2.add(nums[p]);
					list2.add(nums[t]);
					list2.add(nums[x]);
					list2.add(nums[y]);
					list2.sort(null);
					list.add(list2);
					x = nextnum(nums, x);
					y=next_num(nums, y);
				}
				
			}}
		}
		return list;
	}

	public static void main(String[] args) {
		int nums[] = {2,-3,4,2,-1,3,5,-4,-2,1,7,-6};
		System.out.println(new ThirdSolution().threeSum(nums,4));
	}
}
