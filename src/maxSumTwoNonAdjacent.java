import java.util.Arrays;

public class maxSumTwoNonAdjacent {
    public static void main(String[] args) {
        int[] arr = {9, 9, 8, 2};
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1); // Initialize dp array with -1
        System.out.println(func(arr, arr.length - 1, dp));
    }

    public static int func(int[] nums, int n, int[] dp) {
        if (n < 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }

        // Compute maximum sum including the current element and excluding the previous one
        int incl = func(nums, n - 2, dp) + nums[n];
        // Compute maximum sum excluding the current element
        int excl = func(nums, n - 1, dp);

        // Store the maximum sum for the current position in dp array
        dp[n] = Math.max(incl, excl);

        return dp[n];
    }
}
