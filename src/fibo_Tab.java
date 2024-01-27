import java.util.Scanner;

public class fibo_Tab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n= sc.nextInt();
        System.out.println(fibo(n));
    }
    public static int fibo(int n){
        int [] dp = new int [n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

}
