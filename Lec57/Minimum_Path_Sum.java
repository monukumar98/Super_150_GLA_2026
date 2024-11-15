package Lec57;

public class Minimum_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
	}

	public static int Path_Sum(int[][] grid, int cr, int cc) {
		if (cr == grid.length - 1 && cc == grid[0].length - 1) {
			return grid[cr][cc];
		}
		if (cr >= grid.length || cc >= grid[0].length) {
			return Integer.MAX_VALUE;
		}
		int right = Path_Sum(grid, cr, cc + 1);
		int down = Path_Sum(grid, cr + 1, cc);
		return Math.min(right, down) + grid[cr][cc];

	}
}
