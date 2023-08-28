import java.util.ArrayList;
public class arraylist11
{
    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<String>();

        s.add("name");
        s.add("lol");
        System.out.println(s);
        for(int i=0;i<s.size();i++)
        {
            System.out.println(s.get(i));
        }
    }
}
