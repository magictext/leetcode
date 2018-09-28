package ≈≈–Ú;

import java.util.Arrays;

public class myUtil {
	public void insert(int[] num) {
		int res[]=new int[num.length];
		res[0]=num[0];
		for(int i=1;i<num.length;i++){//—°‘Ò ˝Œ™num[i]
			for(int j=0;j<i;j++){
				if(num[i]>res[j]){
					System.arraycopy(res, j, res, j+1, i-j);
					System.out.println(Arrays.toString(res));
					res[j]=num[i];
					break;
				}
			}
		}
		System.out.println(Arrays.toString(res)+"hahah");
		System.arraycopy(res, 0, num, 0, num.length);
	}
	public void select(int num[]) {
		for(int i=0;i<num.length;i++){
			int mini=i;
			for(int j=i;j<num.length;j++){
				mini=num[mini]<num[j]?mini:j;
			}
			int t=num[i];
			num[i]=num[mini];
			num[mini]=t;
		}

	}
	
	public void sort(int arr[], int low, int high) {
		int l = low;
		int h = high;
		int goal = arr[low];
		while (l < h) {
			while (l < h && arr[h] >= goal)
				h--;
			if (l < h) {
				int temp = arr[h];
				arr[h] = arr[l];
				arr[l] = temp;
				l++;
			}

			while (l < h && arr[l] <= goal)
				l++;

			if (l < h) {
				int temp = arr[h];
				arr[h] = arr[l];
				arr[l] = temp;
				h--;
			}
		}
		//System.out.println(Arrays.toString(arr));
		//System.out.print("l=" + (l + 1) + "h=" + (h + 1) + "goal=" + goal + "\n");
		if (l > low)
			sort(arr, low, l - 1);
		if (h < high)
			sort(arr, l + 1, high);
	}
	public void maopao(int[] num) {
		for(int i=0;i<num.length;i++){
			for(int j=0;j<num.length-i-1;j++)
				if(num[j]>num[j+1]){
					int t=num[j];
					num[j]=num[j+1];
					num[j+1]=t;
				}
		}
	}
}
