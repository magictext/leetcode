package longestPalindromicSubstring;

import java.util.Arrays;

public class Soluction {
	public String longestPalindrome(String s) {
		String string = "";
		int length = 0;
		int foot = 0;
		char arr[] = s.toCharArray();
        int flag=0;
		for (int i = 0; i < arr.length; i++) {
			if (i + 1 < arr.length) {
				if (arr[i + 1] == arr[i]) {
                    flag=1;
					while (true) {
						if (i - foot >= 0 && i + foot + 1 < arr.length) {
							if (arr[i - foot] == arr[i + foot + 1]) {
								foot++;
							} else {
								foot--;
								if (2 * foot + 2 > length) {
									length = 2 * foot+2;
									string = new String(Arrays.copyOfRange(arr, i - foot, i + foot + 2));
								}
								foot = 0;
								break;
							}
						} else {
							foot--;
							if (2 * foot + 2 > length) {
								length = 2 * foot + 2;
								string = new String(Arrays.copyOfRange(arr, i - foot, i + foot + 2));
							}
							foot = 0;
							break;
						}

					}
				}
			}
			if (i >= 1 && i + 1 < arr.length) {
                
				if (arr[i - 1] == arr[i + 1]) {
                    flag=1;
					while (true) {
						if (i - foot >= 0 && i + foot < arr.length) {
							if (arr[i - foot] == arr[i + foot]) {
								foot++;
							} else {
								foot--;
								if (2 * foot + 1 > length) {
									length = 2 * foot+1;
									string = new String(Arrays.copyOfRange(arr, i - foot, i + foot + 1));
								}
								foot = 0;
								break;
							}
						} else {
							foot--;
							if (2 * foot + 1 > length) {
								length = 2 * foot+1;
								string = new String(Arrays.copyOfRange(arr, i - foot, i + foot + 1));
							}
							foot = 0;
							break;
						}
					}
				}
			}
		}
        if(flag==0&&(!s.equals(""))) return String.valueOf(s.charAt(0));

		return string;
	}

	public static void main(String[] args) {
		String string = "iptmykvjanwiihepqhzupneckpzomgvzmyoybzfynybpfybngttozprjbupciuinpzryritfmyxyppxigitnemanreexcpwscvcwddnfjswgprabdggbgcillisyoskdodzlpbltefiz";
		String str = new Soluction().longestPalindrome(string);
		System.out.println(str);
	}
}
