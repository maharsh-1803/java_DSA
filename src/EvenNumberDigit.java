public class EvenNumberDigit {
    public static void main(String[] args) {
        int []arr= {12,324,2124,876,2341,21};
        System.out.println(NoOfElement(arr));
    }
    static int NoOfElement(int [] arr)
    {
        int count=0;
        for (int num:arr)
        {
            if(isEven(num))
            {
                count++;
            }
        }
        return count;
    }
    static boolean isEven(int num)
    {
        int noOfDigita = noOfDigit(num);
        if(noOfDigita%2==0)
        {
            return true;
        }
        return false;
    }
    static int noOfDigit(int num)
    {
        int count=0;
        while(num>0)
        {
            count++;
            num=num/10;
        }
        return count;

    }
}
