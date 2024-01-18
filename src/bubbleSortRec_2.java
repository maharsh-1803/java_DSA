import java.util.Arrays;

public class bubbleSortRec_2 {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        bubbleSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int [] arr , int n)
    {
        if(n==0 || n==1)
        {
            return;
        }
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubbleSort(arr,n-1);
    }
}
