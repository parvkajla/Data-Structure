import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int maxEnvelopes(int[][] env) {
        Arrays.sort(env, (a, b) -> {
        if (a[0] != b[0]) return a[0] - b[0];
        if (a[1] != b[1]) return b[1] - a[1];
        return 0; // Required for when both pairs are identical
    });

		int n= env.length;
		int[] h= new int[n];
		for(int i=0; i<n; i++){
			h[i]=env[i][1];
		}
        return lengthOfLIS(h);
    }
    // Standard LIS O(N log N) algorithm
    //LIS binary search sirf length pta krne ke liye use krte hai
    // Print LIS me Binary search nhi use kr skte hai
    private int lengthOfLIS(int[] nums) {
        ArrayList<Integer> tails = new ArrayList<>();

        for (int num : nums) {
            // Find the index where 'num' can be inserted to maintain sorted order
            // or if 'num' is already present.
            // If num is greater than all elements, 'idx' will be negative,
            // and the insertion point will be '-(idx + 1)', which is tails.size().
            int idx = Collections.binarySearch(tails, num);

            if (idx < 0) {
                // If num is not found, get the insertion point
                idx = -(idx + 1);
            }

            if (idx == tails.size()) {
                // If num is greater than all elements in 'tails', extend the LIS
                tails.add(num);
            } else {
                // Otherwise, replace the element at 'idx' with 'num'.
                // This means we found a smaller tail for an increasing subsequence
                // of the same length, which is beneficial.
                tails.set(idx, num);
            }
        }

        return tails.size();
    }
}