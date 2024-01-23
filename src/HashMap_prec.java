import java.util.Hashtable;

public class HashMap_prec {
    public static void main(String[] args) {
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        ht.put(1,10);
        ht.put(2,20);
        ht.put(3,30);
        ht.put(4,40);
        System.out.println(ht.get(2));
        System.out.println(ht.clone());
        System.out.println(ht.contains(20));
        System.out.println(ht.containsKey(3));
        System.out.println(ht.containsValue(40));
        System.out.println(ht.elements());
        System.out.println(ht.entrySet());
        System.out.println(ht.get(2));
        System.out.println(ht.getOrDefault(6,80));
        System.out.println(ht.hashCode());
        System.out.println(ht.isEmpty());
        System.out.println(ht.keys());
        System.out.println(ht.remove(2));
        System.out.println(ht.entrySet());
        System.out.println(ht.putIfAbsent(3,30));
        System.out.println(ht.replace(3,60));
        System.out.println(ht.entrySet());
        System.out.println(ht.size());

    }
}
