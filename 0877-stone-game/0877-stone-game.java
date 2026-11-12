class Solution {
    public boolean stoneGame(int[] nums) {
        int n=  nums.length;
        int[][] dp= new int[n][n];
        for(int[] a: dp) Arrays.fill(a, -1);
        return helper(nums, 0, n-1, dp) >=0;
    }
    private int helper(int[] nums, int i,  int j, int[][] dp){
        if(i==j) return nums[i];
        if(dp[i][j]!=-1) return dp[i][j];
        int left= nums[i]-helper(nums, i+1, j, dp);
        int right= nums[j]-helper(nums, i, j-1, dp);

        return dp[i][j]=Math.max(left, right);
    }
}