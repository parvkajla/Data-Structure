public class Test_35_Qns17 {
    public int findFruit(int[] arr, int key) {
        return findRecursive(arr, key, 0);
    }

    private int findRecursive(int[] arr, int key, int index) {
        if (index >= arr.length) {
            return -1;
        }
        if (arr[index] == key) {
            return index;
        }
        return findRecursive(arr, key, index + 1);
    }
}
