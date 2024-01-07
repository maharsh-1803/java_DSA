public class isSortedRec {
    public static void main(String[] args) {
        int [] arr = {1,3,6,8,12,15};
        System.out.println(isSorted(arr,0));
        System.out.println(LinearSearchRec(arr,6,0));
        System.out.println(LSindex(arr,12,0));
    }
    public static boolean isSorted(int [] arr, int index)
    {
        if(index==arr.length-1)
        {
            return true;
        }
        return arr[index] < arr[index+1] && isSorted(arr,index+1);
    }

    public static boolean LinearSearchRec(int [] arr,int target , int index)
    {
        if(index==arr.length)
        {
            return false;
        }
        return arr[index]==target || LinearSearchRec(arr,target,index+1);
    }
    public static int LSindex(int [] arr, int target,int index)
    {
        if(index==arr.length)
        {
            return -1;
        }
        if(arr[index]==target)
        {
            return index;
        }
        else
        {
            return LSindex(arr,target,index+1);
        }
    }
}
