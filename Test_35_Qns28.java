public class Test_35_Qns28 {
    public int[] findFirstOccurrence(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{-1, -1};
        }

        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0;
        int high = (n * m) - 1;
        int[] result = new int[]{-1, -1};

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / m;
            int col = mid % m;
            int value = matrix[row][col];

            if (value == target) {
                result[0] = row;
                result[1] = col;
                high = mid - 1;
            } else if (value < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
}
