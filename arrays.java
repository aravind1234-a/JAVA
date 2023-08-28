import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class arrays {
    public static void main(String[] args) throws IOException
    {
        BufferedReader ip=new BufferedReader(new InputStreamReader(System.in));

        int[] a= new int[4];
        System.out.println("Enter array elements");
        for(int i=0;i<4;i++)
        {
            a[i]=Integer.parseInt(ip.readLine());
        }

        System.out.println("array elements are: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
