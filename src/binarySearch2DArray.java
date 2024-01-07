import java.util.Arrays;

public class binarySearch2DArray {
    public static void main(String[] args) {
      int [][] martix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(search(martix,8)));
    }
    public static int [] search(int [][] martix , int target)
    {
        int r = 0;
        int c = martix[0].length-1;
        while(r<martix.length && c >= 0)
        {
            if(martix[r][c] == target)
            {
                return new int [] {r,c};
            }
            else if (martix[r][c]>target)
            {
                c--;
            }
            else
            {
                r++;
            }
        }
        return new int [] {-1,-1};
    }
}
