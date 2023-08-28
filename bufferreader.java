import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class bufferreader {
    public static void main(String []args) throws IOException 
    {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter a string");
        String s= io.readLine();
        System.out.println("s: "+s);

        System.out.println("enter an integer");
        int x= Integer.parseInt(io.readLine());
        System.out.println("x: "+x);

        System.out.println("enter a float");
        float y=Float.parseFloat(io.readLine());
        System.out.println("y: "+y);

        System.out.println("enter a character");
        char c=(char) io.read();
        System.out.println("c :"+c);

    }
}
