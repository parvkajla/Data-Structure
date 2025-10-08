public class Test_35_Qns30 {
    public String activatePortal(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return "Failed";
        }

        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0;
        int col = m - 1;

        while (row < n && col >= 0) {
            int current = matrix[row][col];

            if (current == target) {
                return "Activated";
            } else if (current > target) {
                col--;
            } else {
                row++;
            }
        }

        return "Failed";
    }
}
