import java.util.Scanner;
class user_inputs
{
    public static void main(String args[])
    {
        Scanner z=new Scanner(System.in);
        System.out.println("enter a string");
        String str=z.nextLine();
        System.out.println("str: "+str);

        System.out.println("enter an integer");
        int x=z.nextInt();
        System.out.println("x: "+x);

        System.out.println("enter a float number");
        float y=z.nextFloat();
        System.out.println("y: "+y);

        System.out.println("enter a character");
        char c=z.next().charAt(0);
        System.out.println("c: "+c);
    }
}