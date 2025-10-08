public class Test_35_Qns18 {
    public int findDoor(int[] arr, int key) {
        return binarySearchRecur(arr, key, 0, arr.length - 1);
    }

    private int binarySearchRecur(int[] arr, int key, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == key) {
            return mid;
        }

        if (arr[mid] < key) {
            return binarySearchRecur(arr, key, mid + 1, right);
        } else {
            return binarySearchRecur(arr, key, left, mid - 1);
        }
    }
}
