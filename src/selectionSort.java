import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int arr[])
    {
        for (int i = 0; i <arr.length ; i++) {
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    public static void swap(int [] arr , int first,int second )
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static int getMaxIndex(int [] arr, int start , int last)
    {
        int max =start;
        for (int i = start; i <= last ; i++) {
            if(arr[max] < arr[i])
            {
                max = i;
            }
        }
        return max;
    }
}
