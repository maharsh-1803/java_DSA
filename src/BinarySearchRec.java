public class BinarySearchRec {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(binarySearch1(arr,4,0,arr.length-1));
    }
    public static int binarySearch1(int [] arr,int target, int start, int end)
    {
        if(start>end)
        {
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        if(arr[mid]>target)
        {
            return binarySearch1(arr,target,start,mid-1);
        }
        return binarySearch1(arr,target,mid+1,end);

    }
}
