class Solution {
    public int closedIsland(int[][] grid) {
        int n= grid .length;
        int m= grid[0].length;
        boolean[][] visited = new boolean[n+1][m+1];
        for(int row=0; row<n; row++){
            // First col
            if(grid[row][0]==0) bfs(grid, row, 0, visited);
            // Last col
            if(grid[row][m-1]==0) bfs(grid, row, m-1, visited);
        }
        for(int col=0; col<m; col++){
            // First row
            if(grid[0][col]==0) bfs(grid, 0, col, visited);
            // Last row
            if(grid[n-1][col]==0) bfs(grid, n-1, col, visited);
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j]&&grid[i][j]==0) {
                    c++;
                    visited[i][j] = true;
                    bfs(grid, i, j, visited);

                }
            }
        }
        return c;
    }
    private void bfs(int[][] matrix, int row, int col, boolean[][] visited) {
        int[] rowDir = { -1, 0, 1, 0 };
        int[] colDir = { 0, 1, 0, -1 };
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { row, col });
        visited[row][col] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currRow = current[0];
            int currCol = current[1];

            for (int i = 0; i < 4; i++) {
                int newRow = currRow + rowDir[i];
                int newCol = currCol + colDir[i];

                if (newRow >= 0 && newRow < matrix.length && newCol >= 0 && newCol < matrix[0].length
                        && matrix[newRow][newCol] == 0 && !visited[newRow][newCol]) {
                    queue.offer(new int[] { newRow, newCol });
                    visited[newRow][newCol] = true;
                }
            }
        }
    }
    // private void dfs(int[][] grid, int i, int j) {
    //     if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != 1) {
    //         return;
    //     }
    //     grid[i][j] = 1; // mark as visited
    //     dfs(grid, i+1, j);
    //     dfs(grid, i-1, j);
    //     dfs(grid, i, j+1);
    //     dfs(grid, i, j-1);
    // }
}