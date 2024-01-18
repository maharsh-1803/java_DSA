public class sortedRec {
    public static void main(String[] args) {

    }
    public boolean isSorted(int [] arr, int size)
    {
        if(size==1 || size==0)
        {
            return true;
        }
        if(arr[0]>arr[1])
        {
            return false;
        }
        return isSorted(arr,size-1);

    }
}
