class Solution {
    public int numEnclaves(int[][] grid) {
        int n= grid .length;
        int m= grid[0].length;
        for(int row=0; row<n; row++){
            // First col
            if(grid[row][0]==1) dfs(grid, row, 0);
            // Last col
            if(grid[row][m-1]==1) dfs(grid, row, m-1);
        }
        for(int col=0; col<m; col++){
            // First row
            if(grid[0][col]==1) dfs(grid, 0, col);
            // Last row
            if(grid[n-1][col]==1) dfs(grid, n-1, col);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != 1) {
            return;
        }
        grid[i][j] = 0; // mark as visited
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
}