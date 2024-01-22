import java.util.Arrays;

public class MergeSort_2 {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergesort(int [] arr , int start,int end)
    {
        if(start>=end)
        {
            return ;
        }
        int mid = start + (end - start)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid+1,end);
        merge(arr,start,end);
    }
    public static void merge(int [] arr, int start,int end)
    {
        int mid = start+(end-start)/2;
        int l1 = mid-start+1;
        int l2 = end-mid;

        int [] first = new int[l1];
        int []  second = new int [l2];

        int finalLength = start;

        for(int i=0;i<l1;i++)
        {
            first[i] = arr[finalLength++];
        }
        finalLength = mid+1;
        for (int i = 0; i <l2 ; i++) {
            second[i] = arr[finalLength++];
        }

        int i=0;
        int j=0;
        finalLength=start;

        while(i<l1 && j<l2)
        {
            if(first[i]<second[j])
            {
                arr[finalLength++] = first[i++];
            }
            else {
                arr[finalLength++] = second[j++];
            }
        }
        while(i<l1)
        {
            arr[finalLength++]=first[i++];
        }
        while(j<l2)
        {
            arr[finalLength++] = second[j++];
        }

    }
}
