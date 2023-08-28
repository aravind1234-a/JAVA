import java.util.ArrayList;
import java.util.Collections;
public class odj_array {
    public static void main(String[] args) {
        food f0=new food("pizza",199);
        food f1=new food("pasta",220);
        food f2=new food("pastry",180);
        ArrayList<food> flist=new ArrayList<food>();
        Collections.addAll(flist,f0,f1,f2);
        System.out.println(flist.get(0).name);
        for(food i:flist)
        {
            System.out.println(i);
        }
    }
}
class food{
    String name;
    int price;
    food(String name,int price){
        this.name=name;
        this.price=price;
    }
    public String toString(){
        return name+" "+price;
    }
}
