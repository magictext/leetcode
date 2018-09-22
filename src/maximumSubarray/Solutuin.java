package maximumSubarray;

import java.util.Arrays;

public class Solutuin {
	public int maxSubArray(int[] nums) {
		int b[] = new int[nums.length];
		b = nums;
        if(nums.length==0) return 0;
		int max =nums[0];
		for(int i=0;i<nums.length;i++){
			max=Math.max(max,nums[i]);
		}
		int c[] = new int[nums.length];
		//System.out.println(Arrays.toString(nums));
		for (int j = 1; j < nums.length; j++) {
			for (int i = j; i < nums.length; i++) {
				c[i] = nums[i] + b[i - 1];
				max = Math.max(max, c[i]);
				
			}b = Arrays.copyOf(c,c.length);
			//System.out.println(Arrays.toString(b));
		}
		return max;
	}

	public static void main(String[] args) {
		int nums[]={-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(new Solutuin().maxSubArray(nums));
	}	
}
