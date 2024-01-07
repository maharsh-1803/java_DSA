public class binarySearchRecursion {
    public static void main(String[] args) {
        int [] arr = {12,23,34,45,56,67,78};
        System.out.println(binarySearch(arr,34,0,arr.length));
    }
    public static int binarySearch(int [] arr , int target , int start , int end)
    {
        if(start > end)
        {
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        if(arr[mid] > target)
        {
            return binarySearch(arr,target,start,mid-1);
        }
        return binarySearch(arr,target,mid+1,end);
    }
}
