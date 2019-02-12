package ea_7;

public class Solution {
	public int reverse(int x) {
		long res=0;
		while (x/10!=0) {
			int t=x%10;
			System.out.println(t);
			x=x/10;
			res=res*10+t;
			//System.out.println(res);
		}
		res=res*10+x;
		if (res<Integer.MAX_VALUE&&res>Integer.MIN_VALUE) {
			return (int) res;
		}else {
			return 0;
		}
    }
	public static void main(String[] args) {
		System.out.println(new Solution().reverse(-120));
	}
}
