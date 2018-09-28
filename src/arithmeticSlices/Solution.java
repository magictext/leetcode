package arithmeticSlices;

import java.util.Arrays;

public class Solution {
	public int numberOfArithmeticSlices(int[] num) {
		if(num.length<=2) return 0;
        int count=0;
        for(int i=num.length-1;i>0;i--){
        	num[i]=num[i]-num[i-1];
        }
        System.out.println(Arrays.toString(num));
        int temp=2;
        for(int i=1;i<num.length-1;i++){
        	if(num[i]==num[i+1]){
        		temp++;
        	}
        	else {
				count=count+(temp-2)*(temp-1)/2;
				temp=2;
			}
        }
        if(temp!=2) count=count+(temp-2)*(temp-1)/2;
        return count;
    }
	public static void main(String[] args) {
		int[] num={1,2,3,4,5};
		System.out.println(new Solution().numberOfArithmeticSlices(num));
	}
}
