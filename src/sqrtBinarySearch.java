public class sqrtBinarySearch {
    public static void main(String[] args) {
        System.out.println(mySqrt(25));
    }
    public static int mySqrt(int x) {
        if(x<2)
        {
            return x;
        }
        int start=1;
        int end = x;
        while(start<=end)
        {
            int mid = start +(end-start)/2;
            if(mid*mid==x)
            {
                return mid;
            }
            if(mid*mid>x)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return end;
    }
}
