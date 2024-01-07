import java.util.HashMap;

public class HashMapLearn {
    public static void main(String[] args) {
        int [] arr = {1,2,3,1};
        HashMap<Integer,Integer> ans = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer prev =ans.put(arr[i],i);
            System.out.println(prev);
        }
    }
}
