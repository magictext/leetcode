package matrix;

import java.util.Arrays;
import java.util.Vector;

 class EasySolution {
	class Point{
		int x,y;
		public Point(int x,int y) {
			this.x=x;
			this.y=y;
			// TODO Auto-generated constructor stub
		}
	}
	public int[][] updateMatrix(int[][] matrix) {

import java.util.Arrays;
import java.util.Vector;class Solution {
    class Point{
		int x,y;
		public Point(int x,int y) {
			this.x=x;
			this.y=y;
			// TODO Auto-generated constructor stub
		}
	}
    	public int[][] updateMatrix(int[][] matrix) {
        int x = matrix.length;
		int y = matrix[0].length;
		Vector<Point> vector=new Vector<Point>();
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if(matrix[i][j]==0) vector.add(new Point(i, j));
			}
		}
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
			if(matrix[i][j]==1){
                matrix[i][j]=2147483647;
				for(int p=0;p<vector.size();p++){
					
					matrix[i][j]=Math.min(matrix[i][j],Math.abs(vector.get(p).x-i)+Math.abs(vector.get(p).y-j));
				}
			}
		}
		}
		return matrix;
        }
}
	}
	
	public static void main(String[] args) {
		int a[][] = {{1, 0, 1, 0, 0, 0, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 1, 0, 1}, {1, 0, 1, 1, 1, 1, 0, 1, 0, 0}, {1, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 1, 1, 1, 1, 0, 0, 0}, {1, 1, 0, 0, 1, 0, 1, 1, 0, 1}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 0, 1, 1, 1, 0, 0}, {0, 1, 1, 1, 0, 0, 1, 0, 1, 1}, {1, 1, 0, 0, 0, 1, 0, 1, 1, 0}};
		a = new Solution().updateMatrix(a);
		System.out.println(Arrays.toString(a[0]) + Arrays.toString(a[1]) + Arrays.toString(a[2]) + Arrays.toString(a[2]) + Arrays.toString(a[3]) + Arrays.toString(a[4]) + Arrays.toString(a[5]) + Arrays.toString(a[6]) + Arrays.toString(a[7]) + Arrays.toString(a[8]) + Arrays.toString(a[9]));
	}
}
