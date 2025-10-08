public class Test_35_Qns14 {
    public String printNumbers(int n) {
        if (n <= 0) {
            return "";
        }
        if (n == 1) {
            return "1";
        }

        String previousNumbers = printNumbers(n - 1);
        return previousNumbers + " " + n;
    }
}
