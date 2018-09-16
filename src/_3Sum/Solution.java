package _3Sum;
//time limit out
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Solution {
public List<List<Integer>> threeSum(int[] nums) {
	 int length=nums.length;
		int res[][]=new int[length][length];
     List<List<Integer>> list=new ArrayList<>();
     if(nums.length<3) return list;
		for(int i=1;i<length;i++){
			for(int j=0;j<i;j++){
				res[i][j]=nums[i]+nums[j];
			}
		}
		 for (int[]  is : res) {
		 	System.out.println(Arrays.toString(is));
		 }
		
		
		//if(nums.length<3) return list;
		for(int p=0;p<length;p++){
			for(int i=1;i<length&&i!=p;i++){
				for(int j=0;j<i&&j!=p;j++){
					if (nums[p]+res[i][j]==0) {
						System.out.println(nums[p]+"\t"+res[i][j]);
						ArrayList<Integer> list2=new ArrayList<>();
						list2.add(nums[i]);
						list2.add(nums[j]);
						list2.add(nums[p]);
						list2.sort(null);
						list.add(list2);
					}
				}
			}
		}
		list=new ArrayList<>(new HashSet<>(list));
		return list;
        		
    }
public static void main(String[] args) {
		int nums[] = {1,2,-2,-1};
		System.out.println(new Solution().threeSum(nums));
		}	
}
