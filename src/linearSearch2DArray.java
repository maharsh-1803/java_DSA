public class linearSearch2DArray {
    public static void main(String[] args) {
        int [][] arr = {{3,4},{45,67,86},{89,34,21,34}};
        System.out.println(linearSearch2d(arr,86));
    }
    static boolean linearSearch2d(int [][] arr,int target)
    {
        int target1=target;
        for (int i = 0; i <arr.length ; i++) {
            for (int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j] == target1)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
