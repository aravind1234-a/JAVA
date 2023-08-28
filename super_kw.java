public class super_kw {
    public static void main(String[] args) {
        hero h1=new hero("prick",34,"$$");
        System.out.println(h1);
    }
}
class person{
    String name;
    int age;
    person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return this.name+"\n"+this.age+"\n";
    }
}
class hero extends person{
    String power;
    hero(String name,int age,String power){
        super(name,age);
        this.power=power;
    }
    public String toString(){
        return super.toString()+this.power;
    }
}
