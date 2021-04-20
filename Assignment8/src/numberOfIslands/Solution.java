package numberOfIslands;

public class Solution {
    public static void main(String[] args){
    	char[][] list= {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
    	
    	System.out.println("Output: "+numIslands(list));
    	
    	}
    
	public static int numIslands(char[][] grid) {
        if (grid.length == 0) {
        	return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        boolean[][] checked = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int c = 0; c < n; c++) {
                ans += dfs(grid, m, n, checked, i, c);
            }
        }
        return ans;
    }
    public static int[] dic = new int[]{0, 1, 0, -1, 0};
    public static int dfs(char[][] grid, int m, int n, boolean[][] checked, int r, int k) {
        if (r < 0 || r == m || k < 0 || k == n || checked[r][k] || grid[r][k] == '0') {
        	return 0;
        }
        checked[r][k] = true;
        for (int i = 0; i < 4; i++) {
            dfs(grid, m, n, checked, r + dic[i], k + dic[i+1]);
        }
        return 1;
    }
}
