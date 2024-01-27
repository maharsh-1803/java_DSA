public class recPrac {
    public static void main(String[] args) {
//        message();
//        print(1);
        System.out.println(fibo(45));
    }
//    static void message()
//    {
//        System.out.println("hello world");
//        message1();
//    }
//    static void message1()
//    {
//        System.out.println("hello world");
//        message2();
//    }
//    static void message2()
//    {
//        System.out.println("hello world");
//    }
//    static void print(int n)
//    {
//        if(n>5)
//        {
//            return;
//        }
//        System.out.println(n);
//        print(n+1);
//    }
    public static int fibo(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
