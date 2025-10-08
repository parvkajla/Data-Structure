public class Test_35_Qns19 {
    public int findFirstOccurrence(int[] arr, int key) {
        return searchFirstRecursive(arr, key, 0, arr.length - 1);
    }

    private int searchFirstRecursive(int[] arr, int key, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] < key) {
            return searchFirstRecursive(arr, key, mid + 1, right);
        } else if (arr[mid] > key) {
            return searchFirstRecursive(arr, key, left, mid - 1);
        } else {
            if (mid == 0 || arr[mid - 1] < key) {
                return mid;
            } else {
                return searchFirstRecursive(arr, key, left, mid - 1);
            }
        }
    }

}
