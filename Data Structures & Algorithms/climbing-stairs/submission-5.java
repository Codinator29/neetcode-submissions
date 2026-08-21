// class Solution {
//     public int climbStairs(int n) {
//         return fibo(n);
//     }

//     public int fibo(int n){
//         if(n <= 2){
//             return n;
//         }

//         return fibo(n - 1) + fibo(n - 2);
//     }
// }
// public class Solution {
//     public int climbStairs(int n) {
//         return dfs(n, 0);
//     }

//     public int dfs(int n, int i) {
//         if (i >= n) return i == n ? 1 : 0;
//         return dfs(n, i + 1) + dfs(n, i + 2);
//     }
// }

public class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}