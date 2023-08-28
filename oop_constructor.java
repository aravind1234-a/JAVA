public class oop_constructor
 {
    public static void main(String[] args) 
    {
        Human h1= new Human("Aravind",21,70.26);
        Human h2= new Human("Aravind A",21,70.26);
        System.out.println(h1.eating());
        System.out.println(h2.eating());
        //System.out.println("\n"+h1.toString());
        System.out.println("\n"+h1.toString());
    }
}
class Human{
    String name;
    int age;
    double weight;
    Human(String name,int age,double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    String eating(){
        return(this.name+" is eating");
    }
    String drinking(){
        return(this.name+" is drinking");
    }
    public String toString(){
        return name+"\n"+age+"\n"+weight;
    }
}
