class Solution {
    public int findComplement(int num) {
        int complement = 0;
        int factor = 1;

        while (num > 0) {
            if ((num & 1) == 0) {
                complement += factor;
            }

            factor *= 2;
            num >>= 1;
        }

        return complement;
    }
}