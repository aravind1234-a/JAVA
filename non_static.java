class c2{
    public int sum(int a,int b){
        return a+b;
    }
}
public class non_static {
    public static void main(String[] args) {
        c2 p=new c2();
        System.out.println(p.sum(2,3));
    }
}

