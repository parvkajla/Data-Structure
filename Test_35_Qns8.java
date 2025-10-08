
public class Test_35_Qns8 {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        calcDiagonalSums(matrix);
    }

    public static void calcDiagonalSums(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix.length != matrix[0].length) {
            System.out.println("The given matrix is not a square.");
            return;
        }

        int n = matrix.length;
        int priSum = 0;
        int secSum = 0;

        StringBuilder primaryExpression = new StringBuilder();
        StringBuilder secondaryExpression = new StringBuilder();

        for (int i = 0; i < n; i++) {
            priSum += matrix[i][i];
            primaryExpression.append(matrix[i][i]);

            secSum += matrix[i][n - 1 - i];
            secondaryExpression.append(matrix[i][n - 1 - i]);

            if (i < n - 1) {
                primaryExpression.append("+");
                secondaryExpression.append("+");
            }
        }

        System.out.println(primaryExpression + " =" + priSum + ", " + secondaryExpression + " =" + secSum);
    }


}
