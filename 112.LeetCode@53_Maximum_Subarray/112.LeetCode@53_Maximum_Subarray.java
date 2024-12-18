class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0], currSum = 0;

        for (int i : nums) {
            currSum += i;
            maxSum = currSum > maxSum ? currSum : maxSum;
            if (currSum < 0) currSum = 0;
        }

        return maxSum;
    }
}