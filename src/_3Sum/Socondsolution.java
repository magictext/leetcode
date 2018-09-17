package _3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
//time limit out
public class Socondsolution {
	 public List<List<Integer>> threeSum(int[] nums) {
	Arrays.sort(nums);
	List<List<Integer>> list = new ArrayList<>();
     if(nums.length<3) return list;
    if(nums[0]==nums[nums.length-1]){
        if(nums[0]==0){
            ArrayList<Integer> list2 = new ArrayList<>();
						list2.add(0);
						list2.add(0);
						list2.add(0);
						list2.sort(null);
						list.add(list2);
            return list;
        }else{
            return list;
        }
    }
	for (int i = 0; i < nums.length; i++) {
		for (int j = i + 1; j < nums.length; j++) {
			int x = Arrays.binarySearch(nums, (0 - nums[i] - nums[j]));
			if (!(x < 0 || x == nums.length)) {
				if (nums[i] == nums[j] && nums[i] == 0) {
					if (getcount(nums, 0) >= 3) {
						ArrayList<Integer> list2 = new ArrayList<>();
						list2.add(0);
						list2.add(0);
						list2.add(0);
						list2.sort(null);
						list.add(list2);
					}else {
					continue;
				}
				} 
				if (x == i) {
					if (getcount(nums, nums[i]) >= 2) {
						ArrayList<Integer> list2 = new ArrayList<>();
						list2.add(nums[i]);
						list2.add(nums[j]);
						list2.add(nums[x]);
						list2.sort(null);
						list.add(list2);
					} else {
						continue;
					}
				}
				if (x == j) {
					if (getcount(nums, nums[j]) >= 2) {
						ArrayList<Integer> list2 = new ArrayList<>();
						list2.add(nums[i]);
						list2.add(nums[j]);
						list2.add(nums[x]);
						list2.sort(null);
						list.add(list2);
					} else {
						continue;
					}

				}
				// System.out.println("\t??");
				// System.out.println(i+"?"+j+"?"+x);
				ArrayList<Integer> list2 = new ArrayList<>();
				list2.add(nums[i]);
				list2.add(nums[j]);
				list2.add(nums[x]);
				list2.sort(null);
				list.add(list2);
			}
		}

	}
	return new ArrayList<>(new HashSet<>(list));
}

	public int getcount(int[] num, int key) {
	int x = 1, y = 1;
	int temp = Arrays.binarySearch(num, key);
	while (temp - x >= 0 && num[temp - x] == key) {
		x++;
	}
	while (temp + y < num.length && num[temp + y] == key) {
		y++;
	}
	return x + y -1;

}
	public static void main(String[] args) {
		int nums[] = {-1, 0, 1, 2, -1, -4 };
		System.out.println(new Socondsolution().threeSum(nums));
	}
}
