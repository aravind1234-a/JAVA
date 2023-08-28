import java.util.ArrayList;
public class arraylist
{
    public static void main(String[] args)
    {
        /* ArrayList stores reference datatypes 
         * add() and get() are used to add and retrive elem
         * remove()
         * set()
         * clear()
        */
        
        ArrayList<Integer> a=new ArrayList<Integer>();
        /* add() */
        a.add(1);
        a.add(2);
        a.add(3);

        /* set() */
        a.set(0,0);

        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }
        System.out.println();

        /* remove() */
        a.remove(2);

        /* get() */
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }
        System.out.println();

        /* clear() */
        a.clear();
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }
    }
}