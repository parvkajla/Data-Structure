public class Test_35_Qns9 {
    public boolean canReach(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return false;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];

        return findPath(grid, 0, 0, visited);
    }

    private boolean findPath(int[][] grid, int row, int col, boolean[][] visited) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (row < 0 || row >= rows || col < 0 || col >= cols ||
                grid[row][col] == 1 || visited[row][col]) {
            return false;
        }

        if (row == rows - 1 && col == cols - 1) {
            return true;
        }

        visited[row][col] = true;

        if (findPath(grid, row + 1, col, visited)) {
            return true;
        }
        if (findPath(grid, row, col + 1, visited)) {
            return true;
        }
        if (findPath(grid, row - 1, col, visited)) {
            return true;
        }
        if (findPath(grid, row, col - 1, visited)) {
            return true;
        }

        return false;
    }
}
