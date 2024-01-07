import java.util.HashMap;

public class HashMapBasic {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("maharsh",3);
        map.put("juhi",2);
        map.put("ram",1);
        map.put("ram",3);
        System.out.println(map);
        System.out.println("size of map:"+map.size());
        System.out.println(map.containsKey("maharsh"));;
        System.out.println(map.containsValue(1));
        System.out.println(map.containsValue(10));
        System.out.println(map.containsKey("sita"));
        System.out.println(map.get(3));
        String ans = map.toString();
        System.out.println(ans);
    }
}
