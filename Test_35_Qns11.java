public class Test_35_Qns11 {
    public int calculateTotalMoves(int n) {
        if (n <= 0) {
            return 0;
        }
        return solve(n, 'A', 'C', 'B');
    }

    private int solve(int disks, char source, char destination, char helper) {
        if (disks == 1) {
            return 1;
        }

        int moves1 = solve(disks - 1, source, helper, destination);

        int currentMove = 1;

        int moves2 = solve(disks - 1, helper, destination, source);

        return moves1 + currentMove + moves2;
    }

}
