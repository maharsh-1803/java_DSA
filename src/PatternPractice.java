import java.security.spec.RSAOtherPrimeInfo;

public class PatternPractice {
    public static void main(String[] args) {
        Pattern8(4);
    }
    public static void Pattern1(int n)
    {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void Pattern2(int n)
    {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void Pattern3(int n)
    {
        for (int i = 1; i <=n ; i++) {
            for (int j = n-i+1; j >0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void Pattern4(int n)
    {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void Pattern5(int n)
    {
        for (int i = 0; i <2*n ; i++) {
            int numOfColumn = i > n ? 2 * n - i : i;
            for (int j = 0; j <numOfColumn ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pattern6(int n)
    {
        for (int i = 0; i <2*n ; i++) {
            int numOfColumn = i > n ? 2 * n - i : i;
            int noOfSpace = n-numOfColumn;
            for(int s=0 ; s<noOfSpace ; s++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <numOfColumn ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void Pattern7(int n)
    {
        for (int i = 1; i <=n ; i++) {
            for(int s = 0 ; s <n-i ; s++)
            {
                System.out.print("  ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void Pattern8(int n)
    {
        n = 2*n;
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=n ; j++) {
                int indexAt = Math.min(Math.min(i,n-i),Math.min(j,n-j));
                System.out.print(indexAt+" ");
            }
            System.out.println();

        }
    }

}

