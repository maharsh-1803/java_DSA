public class linearSearchString {
    public static void main(String[] args) {
        String name = "maharsh";
        char c ='m';
        System.out.println(lineraString(name,c));
    }
    static char lineraString(String name,char c)
    {
        for (int i = 0; i <name.length() ; i++) {
            if(c==name.charAt(i))
            {
                return c;
            }
        }
        return 'n';
    }
}
