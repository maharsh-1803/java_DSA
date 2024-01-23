public class validAnagram {
    public static void main(String[] args) {
        String s = "mann";
        String t = "amnn";
        int arr[] = new int [25];
        System.out.println(arr[12]--);
        System.out.println(arr[13]);
        for(char x:s.toCharArray())
        {
            System.out.println(arr[x-'a']++);
        }

    }
//    public static boolean isValidAnagram(String s,String t)
//    {
//        if(s.length()!=t.length())
//        {
//            return false;
//        }
//        int [] map = new int[26];
//        for(char x:s.toCharArray())
//        {
//            map[x-'a']++;
//        }
//        for (char x:t.toCharArray()) {
//            System.out.println(map[x-'a']);
//        }
//        return true;
//    }
}
