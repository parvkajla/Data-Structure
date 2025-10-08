public class Test_35_Qns20 {
    public int findLastOccurrence(int[] arr, int key) {
        return searchLastRecursive(arr, key, 0, arr.length - 1);
    }

    private int searchLastRecursive(int[] arr, int key, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] < key) {
            return searchLastRecursive(arr, key, mid + 1, right);
        } else if (arr[mid] > key) {
            return searchLastRecursive(arr, key, left, mid - 1);
        } else {
            if (mid == arr.length - 1 || arr[mid + 1] > key) {
                return mid;
            } else {
                return searchLastRecursive(arr, key, mid + 1, right);
            }
        }
    }
}
