import java.util.Arrays;

public class inversionCount {
    public static void main(String[] args) {
        int [] arr = {1,20,6,4,5};
        System.out.println(inversionCount(arr));
//        System.out.println(Arrays.toString(arr));
    }
    public static int inversionCount(int [] arr)
    {
        int count=0;
        for (int i = 0; i <arr.length-1 ; i++) {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
//                    int temp  =arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
                    count++;
                }
            }
            
        }
        return count;
    }
}
