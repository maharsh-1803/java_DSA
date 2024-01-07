public class PeakMountainArray {
    public static void main(String[] args) {
        int [] arr = {0,1,4,6,4,2,0};
        System.out.println(Peak(arr));
    }
    public static int Peak(int [] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            int mid = start + (end - start)/2;
            if (arr[mid]<arr[mid+1])
            {
                start = mid + 1;
            }
            else
            {
                end = mid;
            }
        }
        return end;
    }
}
