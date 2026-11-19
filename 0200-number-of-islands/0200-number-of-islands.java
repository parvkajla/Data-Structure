class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int c = 0;
        boolean[][] visited = new boolean[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]&&grid[i][j]=='1') {
                    c++;
                    visited[i][j] = true;
                    bfs(i, j, visited, grid);

                }
            }
        }
        return c;
    }
    private void bfs(int row, int col, boolean[][] visited, char[][] matrix) {
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
                        && matrix[newRow][newCol] == '1' && !visited[newRow][newCol]) {
                    queue.offer(new int[] { newRow, newCol });
                    visited[newRow][newCol] = true;
                }
            }
        }
    }
}