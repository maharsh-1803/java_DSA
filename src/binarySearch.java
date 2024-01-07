public class binarySearch {
    public static void main(String[] args) {
        int [] arr ={8,7,6,5,4,3,2,1};
        System.out.println(binarySearch1(arr,6));
    }
    static int binarySearch1(int []arr,int target)
    {
        int start=0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]>target)
            {
                start=mid+1;
            }
            else if (arr[mid]<target) {
                end = mid -1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
