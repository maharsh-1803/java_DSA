import java.sql.SQLOutput;
import java.util.concurrent.RecursiveAction;

public class fibonacciRec {
    public static void main(String[] args) {
        System.out.println(Recusiorfibo(7));
    }
    static int Recusiorfibo(int n)
    {
        if(n<2)
        {
            return n;
        }


        return Recusiorfibo(n-1) + Recusiorfibo(n-2);
    }
}
