public class Recursion {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(sumOfDigit(123));
        System.out.println(productDigit(7));
        reverseNumber(2356);
        System.out.println(sum);
        System.out.println(reverse(1234));
        System.out.println(isPlindrome(12321));
        System.out.println(NumberOfZeros(1002));
    }
    static int fact(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        return n*fact(n-1);
    }
    static int sumOfDigit(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int rem = n % 10;
        return rem + sumOfDigit(n/10);
    }
    static int productDigit(int n)
    {
        if(n%10==n)
        {
            return n;
        }
        return (n%10) * productDigit(n/10);
    }
    static int sum=0;
    static void reverseNumber(int n)
    {
        if(n==0)
        {
            return;
        }
        int rem = n%10;
        sum = sum*10 +rem;
        reverseNumber(n/10);
    }
    static int reverse(int n)
    {
        int digit = (int)(Math.log10(n))+1;
        return helper(n,digit);
    }
    static int helper(int n, int digit)
    {
        if(n%10==n)
        {
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10,digit-1)) +  helper(n/10,digit-1);
    }
    static boolean isPlindrome(int n)
    {
        return (n==reverse(n));
    }
    static int NumberOfZeros(int n)
    {
        return helperCount(n,0);
    }
    static int helperCount(int n,int count)
    {
        if(n==0)
        {
            return count;
        }
        int rem = n%10;
        if(rem==0)
        {
            return helperCount(n/10,count+1);
        }
        return helperCount(n/10,count);
    }
}
