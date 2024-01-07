public class linear_search {
    public static void main(String[] args) {
        int [] arr = {2,43,53,23,756,45,34};
        System.out.println("searchIndex:"+linearSearch(arr,34));
        System.out.println("max element in array:"+linearSearchMax(arr));
    }
    static int linearSearch(int [] arr,int target)
    {
        for (int i = 0; i <arr.length ; i++) {
            int element = arr[i];
            if(element==target)
            {
                return i;
            }
        }
        return -1;
    }
    static int linearSearchMax(int []arr)
    {
        int element = arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if(element<arr[i])
            {
                element = arr[i];
            }
        }
        return element;
    }
}
