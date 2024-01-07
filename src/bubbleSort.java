import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int [] arr = {77,55,44,33,22,11};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubblesort(int [] arr)
    {
        boolean isSort;
        for (int i = 0; i <arr.length ; i++) {
            isSort = false;
            for (int j = 1; j <arr.length-i ; j++) {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                isSort = true;
            }
            if(isSort == false)
            {
                break;
            }
        }
    }
}
