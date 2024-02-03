import java.util.Arrays;

public class CutIntoSegment {
    public static void main(String[] args) {
        System.out.println(CutSegment(7,5,2,2));
    }
    public static int CutSegment(int n, int x,int y,int z)
    {
//        int ans = solve(n,x,y,z);
//        if(ans < 0)
//        {
//            return 0;
//        }
//        else{
//            return ans;
//        }


//        int [] dp = new int[n+1];
//        Arrays.fill(dp,-1);
//        int ans = solveMem(n,x,y,z,dp);
//        if (ans<0)
//        {
//            return 0;
//        }
//        else {
//            return ans;
//        }

        return solveTab(n,x,y,z);
    }
    public static int solve(int n,int x, int y, int z)
    {
        if(n==0)
        {
            return 0;
        }
        if(n<0)
        {
            return Integer.MIN_VALUE;
        }
        int a = solve(n-x,x,y,z) + 1;
        int b = solve(n-y,x,y,z) + 1;
        int c = solve(n-z,x,y,z) + 1;
        int ans = Math.max(a,Math.max(b,c));
        return ans;
    }
    public static int solveMem(int n,int x, int y, int z , int [] dp)
    {
        if(n==0)
        {
            return 0;
        }
        if(n<0)
        {
            return Integer.MIN_VALUE;
        }

        if(dp[n]!=-1)
        {
            return dp[n];
        }
        int a = solveMem(n-x,x,y,z,dp) + 1;
        int b = solveMem(n-y,x,y,z,dp) + 1;
        int c = solveMem(n-z,x,y,z,dp) + 1;
        dp[n] = Math.max(a,Math.max(b,c));
        return dp[n];
    }
    public static int solveTab(int n, int x, int y, int z)
    {
        int [] dp = new int [n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        for (int i = 1; i <=n ; i++) {
            if(i-x>=0 && dp[i-x]!=-1)
            {
                dp[i] = Math.max(dp[i],dp[i-x]+1);
            }
            if(i-y>=0 && dp[i-y]!=-1)
            {
                dp[i] = Math.max(dp[i],dp[i-y]+1);
            }
            if(i-z>=0 && dp[i-z]!=-1)
            {
                dp[i] = Math.max(dp[i],dp[i-z]+1);
            }
        }
        if(dp[n]<0)
        {
            return 0;
        }
        else {
            return dp[n];
        }
    }
}
