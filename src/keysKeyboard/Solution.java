package keysKeyboard;

public class Solution {
	public int minSteps(int n) {
		if(n==1) return 0;
		for(int i=2;i<Math.sqrt(n)+1;i++){
			if(n%i==0){
				return minSteps(n/i)+i;
			}
		
		}
		return n;
	}
	public static void main(String[] args) {
		System.out.println(new Solution().minSteps(3));
		
	}
}
