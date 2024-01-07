import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        path("",3,3);
        System.out.println(pathRet("",3,3));
        boolean [][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        pathRestrications("",maze,0,0);
    }
    public static int count(int r,int c)
    {
        if(r==1||c==1)
        {
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        int diagonal = count(r-1,c-1);
        return left+right+diagonal;
    }
    public static void path(String p, int r, int c)
    {
        if(r==1 && c==1)
        {
            System.out.println(p);
            return;
        }
        if(r>1)
        {
            path(p+'V',r-1,c);
        }
        if(c>1)
        {
            path(p+'H',r,c-1);
        }
        if(c>1&&r>1)
        {
            path(p+'D',r-1,c-1);
        }
    }
    public static ArrayList<String> pathRet(String p, int c, int r)
    {
        if(r==1&&c==1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r>1&&c>1)
        {
            ans.addAll(pathRet(p+'D',r-1,c-1));
        }
        if(r>1)
        {
           ans.addAll(pathRet(p+'V',r-1,c));
        }
        if(c>1)
        {
            ans.addAll(pathRet(p+'H',r,c-1));
        }
        return ans;
    }
    public static void pathRestrications(String p,boolean[][] maze,int r,int c)
    {
        if(r==maze.length-1&&c==maze[0].length-1)
        {
            System.out.println(p);
            return ;
        }
        if(maze[r][c]==false)
        {
            return;
        }
        if(r<maze.length-1)
        {
            pathRestrications(p+'D',maze,r+1,c);;
        }
        if(c<maze[0].length-1)
        {
            pathRestrications(p+"R",maze,r,c+1);
        }
    }
}
