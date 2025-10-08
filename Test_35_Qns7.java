import java.util.ArrayList;
import java.util.List;

public class Test_35_Qns7 {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> spiralResult = spiralOrder(matrix);
        System.out.println(spiralResult);
    }


    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        printSpiral(matrix, 0, rows - 1, 0, cols - 1, result);
        return result;
    }

    private static void printSpiral(int[][] matrix, int top, int bottom, int left, int right, List<Integer> result) {
        if (left > right || top > bottom) {
            return;
        }

        for (int i = left; i <= right; i++) {
            result.add(matrix[top][i]);
        }

        for (int i = top + 1; i <= bottom; i++) {
            result.add(matrix[i][right]);
        }

        if (top < bottom && left < right) {
            for (int i = right - 1; i > left; i--) {
                result.add(matrix[bottom][i]);
            }
            for (int i = bottom; i > top; i--) {
                result.add(matrix[i][left]);
            }
        }

        printSpiral(matrix, top + 1, bottom - 1, left + 1, right - 1, result);
    }

}
