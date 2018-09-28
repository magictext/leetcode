package ≈≈–Ú;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		myUtil util=new myUtil();
		int num[]={2,4,2,6,3,7,3,9,4,2,7,1,6,3,8};
		//util.sort(num, 0, num.length-1);
		//System.out.println(Arrays.toString(num));
		util.select(num);
		System.out.println(Arrays.toString(num));
	}
}
