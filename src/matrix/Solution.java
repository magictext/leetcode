package matrix;

import java.time.Year;
import java.util.Arrays;

import javax.swing.table.TableModel;

import com.sun.accessibility.internal.resources.accessibility;

public class Solution {
	public int[][] updateMatrix(int[][] matrix) {
		int x = matrix.length;
		int y = matrix[0].length;
		int temp[][] = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (matrix[i][j] == 0) {
					temp[i][j] = 1;
					// init(temp, i, j);
				}
			}
		}
		int flag=1;
		while(flag==1){
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				flag=virus(temp);
			}
		}
		}
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				temp[i][j]--;
			}
		}
		
		return temp;
	}
//	public boolean isequal(int temp[][]) {
//		int a[][]=new int[temp.length][];
//		for(int x=0;x<temp.length;x++){
//			a[x]=temp[x].clone();
//		}
//		for (int i = 0; i < temp.length; i++) {
//			for (int j = 0; j < temp[0].length; j++) {
//				virus(temp, i, j);
//			}
//		}
//		return !(a.equals(temp));
//		}
		
		
	
public boolean haszero(int temp[][]) {
	for (int i = 0; i < temp.length; i++) {
		for (int j = 0; j < temp[0].length; j++) {
			if(temp[i][j]==0) return true;
		}
	}
	return false;
}
	public int virus(int temp[][]) {
		int flag=0;
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[0].length; j++) {
				try {
					if (temp[i - 1][j] != 0) {
						if (temp[i][j] == 0) {
							temp[i][j] = temp[i - 1][j]+1;
							flag=1;
						} else {
							int t=temp[i][j];
							temp[i][j] = Math.min(temp[i][j], temp[i - 1][j] + 1);
							if(t!=temp[i][j]) flag=1;
						}
					}
				} catch (Exception e) {
					// TODO: handle exception
				}

				try {
					if (temp[i + 1][j] != 0) {
						if (temp[i][j] == 0) {
							temp[i][j] = temp[i + 1][j]+1;
							flag=1;
						} else {
							int t=temp[i][j];
							temp[i][j] = Math.min(temp[i][j], temp[i + 1][j] + 1);
							if(t!=temp[i][j]) flag=1;

						}
					}
				} catch (Exception e) {
					// TODO: handle exception
				}

				try {
					if (temp[i][j - 1] != 0) {
						if (temp[i][j] == 0) {
							temp[i][j] = temp[i][j - 1]+1;
							flag=1;
						} else {
							int t=temp[i][j];
							temp[i][j] = Math.min(temp[i][j], temp[i][j - 1] + 1);
							if(t!=temp[i][j]) flag=1;
						}
					}
				} catch (Exception e) {
					// TODO: handle exception
				}

				try {
					if (temp[i][j + 1] != 0) {
						if (temp[i][j] == 0) {
							temp[i][j] = temp[i][j + 1]+1;
							flag=1;
						} else {
							int t=temp[i][j];
							temp[i][j] = Math.min(temp[i][j], temp[i][j + 1] + 1);
							if(t!=temp[i][j]) flag=1;
						}
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
		
		return flag;
	}

	public void init(int temp[][], int i, int j) {
		try {
			if (temp[i - 1][j] == 0 || temp[i - 1][j] > temp[i][j] + 1) {
				temp[i - 1][j] = temp[i][j] + 1;
				init(temp, i - 1, j);
			}
		} catch (Exception e) {
		}

		try {
			if (temp[i + 1][j] == 0 || temp[i + 1][j] > temp[i][j] + 1) {
				temp[i + 1][j] = temp[i][j] + 1;
				init(temp, i + 1, j);
			}
		} catch (Exception e) {
		}

		try {
			if (temp[i][j - 1] == 0 || temp[i][j - 1] > temp[i][j] + 1) {
				temp[i][j - 1] = temp[i][j] + 1;
				init(temp, i, j - 1);
			}
		} catch (Exception e) {
		}

		try {
			if (temp[i][j + 1] == 0 || temp[i][j + 1] > temp[i][j] + 1) {
				temp[i][j + 1] = temp[i][j] + 1;
				init(temp, i, j + 1);
			}
		} catch (Exception e) {
		}

	}

	public static void main(String[] args) {
		int a[][] = {{1, 0, 1, 0, 0, 0, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 1, 0, 1}, {1, 0, 1, 1, 1, 1, 0, 1, 0, 0}, {1, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 1, 1, 1, 1, 0, 0, 0}, {1, 1, 0, 0, 1, 0, 1, 1, 0, 1}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 0, 1, 1, 1, 0, 0}, {0, 1, 1, 1, 0, 0, 1, 0, 1, 1}, {1, 1, 0, 0, 0, 1, 0, 1, 1, 0}};
		a = new Solution().updateMatrix(a);
		System.out.println(Arrays.toString(a[0]) + Arrays.toString(a[1]) + Arrays.toString(a[2]) + Arrays.toString(a[2]) + Arrays.toString(a[3]) + Arrays.toString(a[4]) + Arrays.toString(a[5]) + Arrays.toString(a[6]) + Arrays.toString(a[7]) + Arrays.toString(a[8]) + Arrays.toString(a[9]));
	}
}
