import java.util.Scanner;

public class RotateMatrixClockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            int leftPointer = 0;
            int rightPointer = n - 1;

            while (leftPointer < rightPointer) {
                int temp = matrix[i][leftPointer];
                matrix[i][leftPointer] = matrix[i][rightPointer];
                matrix[i][rightPointer] = temp;

                leftPointer++;
                rightPointer--;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}