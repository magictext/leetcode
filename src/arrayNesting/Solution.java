package arrayNesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Solution {
	public int arrayNesting(int[] nums) {
		HashSet<Integer> hashSet = new HashSet<>();
		ArrayList<HashSet<Integer>> count = new ArrayList<>();
		int max=0;
		for (int i = 0; i < nums.length; i++) {
			int j = i;
			int sum = 1;
			count.add(new HashSet<>());
			count.get(i).add(i);
			while (nums[j] >= 0 && nums[j] < nums.length) {
				System.out.println(hashSet.toString() + "\t" + nums[j]);
				if (count.get(i).contains(nums[j])) {
					break;
				} else {
					// count.get(i).add(nums[j]);
					if (count.size() > nums[j] && count.get(nums[j]) != null) {
						sum += count.get(nums[j]).size();
						count.get(i).addAll(count.get(nums[j]));
						break;
					} else {
						count.get(i).add(nums[j]);
						sum++;
						j = nums[j];
					}

				}

			}
			// hashSet.clear();
			// count[i] = sum;
			max=max>count.get(i).size()?max:count.get(i).size();
		}
		return max;
		// System.out.println(Arrays.toString(count));
//		int max = 0;
//		for (HashSet i : count) {
//			max = max > i.size() ? max : i.size();
		}
//		return max;
//	}

	public static void main(String[] args) {
		int a[] = {5,4,0,3,1,6,2};
		System.out.println(new Solution().arrayNesting(a));
	}
}
