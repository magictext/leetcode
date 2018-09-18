package _4sum2;

import java.util.Arrays;


public class ThirdSolution {
public int  getcount(int arr[],int key) {
	int x=1,y=1;
	while(key-x>=0&&arr[key-x]==arr[key]){
		x++;
	}
	while (key+y<arr.length&&arr[key+y]==arr[key]) {
		y++;
	}
	return x+y-1;
}
public int fourSumCount(int[] a, int[] b, int[] c, int[] d) {
		int length=a.length;
		if(length==0) return 0;
		int arr1[]=new int[length*length];
		int arr2[]=new int[length*length];
		int x=0,sum=0;
		
		for (int i : a) {
			for (int j : b) {
				arr1[x]=i+j;
				x++;
			}
		}
		x=0;
		for (int i : c) {
			for (int j : d) {
				arr2[x]=i+j;
				x++;
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i :arr1){
			int key=Arrays.binarySearch(arr2, 0-i);
			if(key>=0&&key<arr1.length)
				//System.out.println(getcount(arr2,key));
				sum=sum+getcount(arr2,key);
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
        return sum;
    }
public static void main(String[] args) {
	int a[]={0,-1,1};
	int b[]={-1,1,0};
	int c[]={0,0,1};
	int d[]={1,-1,1};
	System.out.println(new ThirdSolution().fourSumCount(a, b, c, d));
}
}
