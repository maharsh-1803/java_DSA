public class inversionCount {
    public static void main(String[] args) {
        int [] arr = {1,20,6,4,5};
        System.out.println(inversionCount(arr));
    }
    public static int inversionCount(int [] arr)
    {
        int count=0;
        for (int i = 0; i <arr.length-1 ; i++) {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    count++;
                }
            }
            
        }
        return count;
    }
}
