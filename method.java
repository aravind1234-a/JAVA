public class method {
    public static void main(String[] args) {
        hello("Aravind",21);
        System.out.println("Sum is: "+add(3,4));
        System.out.println("substraction: "+sub(3,2));
    }
    static void hello(String s,int a)
    {
        System.out.println("Hello "+s +" and ur age is "+a);
    }
    static int add(int x,int y)
    {
        return x+y;
    }
    static int sub(int a,int b)
    {
        return a-b;
    }
}
