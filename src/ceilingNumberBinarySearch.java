public class ceilingNumberBinarySearch {
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10,12,14,16,18,20};
        System.out.println(binarySearchCeilingNumber(arr,15));
    }

    static int binarySearchCeilingNumber(int []arr,int target)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return arr[start];
    }
}
