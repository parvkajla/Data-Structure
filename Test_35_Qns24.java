public class Test_35_Qns24 {
    public int findFloor(int[] arr, int target) {
        return searchRecursive(arr, target, 0, arr.length - 1, -1);
    }

    private int searchRecursive(int[] arr, int target, int left, int right, int potentialAnswer) {
        if (left > right) {
            return potentialAnswer;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] <= target) {
            potentialAnswer = arr[mid];
            return searchRecursive(arr, target, mid + 1, right, potentialAnswer);
        } else {
            return searchRecursive(arr, target, left, mid - 1, potentialAnswer);
        }
    }
}
