package closest3sum;

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

	public int threeSumClosest(int[] nums, int target) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		int x, y,tar;
		int closest=999999,sum=0;
		for (int t = 0; t < nums.length - 2; t=nextnum(nums, t)) {
			tar = target - nums[t];
			x = t + 1;
			y = nums.length - 1;
			while (x < y) {
				int res=nums[x] + nums[y] - tar;
				if (Math.abs(res)<closest){
					closest=Math.abs(res);
					sum=res+target;
					//y = next_num(nums, y);
				}
				if (res>0)
					y = next_num(nums, y);
				else if (res<0)
					x = nextnum(nums, x);
				else {
					return target;
				}
				
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int nums[] = {1,1,1,0};
		System.out.println(new ThirdSolution().threeSumClosest(nums, -100));
	}
}
