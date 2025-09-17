import java.util.Scanner;
import java.util.ArrayList;

public class SpiralTransversalOfMatrix {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            ArrayList<Integer> resultList = new ArrayList<>();

            int top = 0;
            int bottom = n - 1;
            int left = 0;
            int right = m - 1;

            while (top <= bottom && left <= right) {

                for (int i = left; i <= right; i++) {
                    resultList.add(matrix[top][i]);
                }
                top++;


                for (int i = top; i <= bottom; i++) {
                    resultList.add(matrix[i][right]);
                }
                right--;

                if (top <= bottom) {
                    for (int i = right; i >= left; i--) {
                        resultList.add(matrix[bottom][i]);
                    }
                    bottom--;
                }

                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        resultList.add(matrix[i][left]);
                    }
                    left++;
                }
            }

            for (int i = 0; i < resultList.size(); i++) {
                System.out.print(resultList.get(i));
                if (i < resultList.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
}
