import java.util.Scanner;

public class printNumRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n= sc.nextInt();
        print(n);
    }
    private static void print(int n)
    {
        if(n==0)
        {
            return;
        }
        print(n-1);
        System.out.println(n);
    }
}
