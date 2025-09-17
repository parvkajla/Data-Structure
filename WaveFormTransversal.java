import java.util.Scanner;
import java.util.ArrayList;

public class WaveFormTransversal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        ArrayList<Integer> resultList = new ArrayList<>();

        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < m; i++) {
                    resultList.add(matrix[i][j]);
                }
            } else {
                for (int i = m - 1; i >= 0; i--) {
                    resultList.add(matrix[i][j]);
                }
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