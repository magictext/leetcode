package ambiguousCoordinates;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> ambiguousCoordinates(String str) {
		String x, y;
		List<String> left = new ArrayList<String>();
		List<String> rigth = new ArrayList<String>();
		List<String> res = new ArrayList<String>();
		for (int i = 1; i < str.length() - 2; i++) {
			x = str.substring(1, i + 1);
			y = str.substring(i + 1, str.length() - 1);
			System.out.println(x + "\t" + y);
			left=doing(x);
			rigth=doing(y);
			for (int m = 0; m < left.size(); m++) {
				for (int n = 0; n < rigth.size(); n++) {
					res.add("(" + left.get(m) + "," + rigth.get(n) + ")");
				}
			}
			left.clear();
			rigth.clear();
		}
		return res;

	}
	public List<String> doing(String x) {
		List<String> left = new ArrayList<String>();
		if (x.length() == 1) {
			left.add(x);
		} else {
			StringBuilder xBuilder = new StringBuilder(x);
			if (xBuilder.charAt(xBuilder.length() - 1) == '0' && xBuilder.charAt(0) != '0') {
				left.add(xBuilder.toString());
			} else if (xBuilder.charAt(xBuilder.length() - 1) == '0' && xBuilder.charAt(0) == '0') {
				return left;
			} else {
				if (xBuilder.charAt(0) == '0') {
					xBuilder.insert(1, '.');
					left.add(xBuilder.toString());
					xBuilder = new StringBuilder(x);
				} else {
					for (int j = 1; j < xBuilder.length(); j++) {
						xBuilder.insert(j, '.');
						left.add(xBuilder.toString());
						xBuilder = new StringBuilder(x);
					}
					left.add(x);
				}

			}

		}
		return left;
	}
	public static void main(String[] args) {
		System.out.println(new Solution().ambiguousCoordinates("(00011)"));
	}
}
