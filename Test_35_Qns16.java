public class Test_35_Qns16 {
    public int search(int[] arr, int key) {
        return searchRecursive(arr, key, 0);
    }

    private int searchRecursive(int[] arr, int key, int index) {
        if (index >= arr.length) {
            return -1;
        }
        if (arr[index] == key) {
            return index;
        }
        return searchRecursive(arr, key, index + 1);
    }
}
