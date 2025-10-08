public class Test_35_Qns12 {
    public int countWays(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }

        return countWays(n - 1) + countWays(n - 2);
    }
}
