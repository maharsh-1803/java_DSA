import java.util.ArrayList;

public class subSequenceRec {
    public static void main(String[] args) {
        String str = "abc";
        subSeq("",str);
        System.out.println(subSeq1("",str));
    }
    static void subSeq(String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p+ch,up.substring(1));
        subSeq(p,up.substring(1));

    }
    static ArrayList<String> subSeq1(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left  = subSeq1(p+ch,up.substring(1));
        ArrayList<String> right = subSeq1(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
