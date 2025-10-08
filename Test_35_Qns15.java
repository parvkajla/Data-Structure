public class Test_35_Qns15 {
    public int sumArray(int[] arr) {
        return sumRecursive(arr, 0);
    }

    private int sumRecursive(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        }
        return arr[index] + sumRecursive(arr, index + 1);
    }
}
