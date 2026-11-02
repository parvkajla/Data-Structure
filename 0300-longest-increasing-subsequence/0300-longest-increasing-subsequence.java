class Solution {
    public int lengthOfLIS(int[] nums) {
        int n= nums.length;
        int[] dp= new int[n];
        int ans=0;
        for(int i=n-1; i>=0; i--){
            dp[i]=1;
            for(int j=i+1; j<n; j++){
                if(nums[i]<nums[j])
                    dp[i]=Math.max(dp[i], 1+dp[j]);
                    
            }
            ans= Math.max(dp[i], ans);
        }
        return ans;
    }
    // private int helper(int i, int[] nums){
    //     int ans=1;
    //     for(int j=i+1; j<nums.length; j++){
    //         if(nums[i]<nums[j]){
    //             ans= Math.max(ans, 1+helper(j, nums));
    //         }
    //     }
    //     return ans;
    // }
}