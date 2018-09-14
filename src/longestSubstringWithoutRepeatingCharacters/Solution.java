package longestSubstringWithoutRepeatingCharacters;

public class Solution {
	public static int lengthOfLongestSubstring(String s) {
		int count = 0;
		char arr[] = s.toCharArray();
		int x = 0, y = 1;
		
		while (y < arr.length) {
			for (int i = x; i < y; i++) {
				if (arr[i] == arr[y]) {
					count = Math.max(count, (y - x));
					x = i + 1;
					break;
				}
			}
			y++;
		}
		count = Math.max(count, (y - x));
		if (arr.length==1||arr.length==0) {
			return arr.length;
		}
		return count;
	}

	public static int contains(char[] c, char a) {
		for (int i = 0; i < c.length; i++) {
			if (c[i] == a) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String string = "dertyud";
		int x = lengthOfLongestSubstring(string);
		System.out.println(x);
	}
}
