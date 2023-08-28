public class encap {
    public static void main(String[] args) {
        std s=new std("aravind",12,"A");
        std s1=new std("sham",13,"b");
        std s2=new std("and",18,"j");
        s2.copy(s1);
        //System.out.println(s.getname());  //getter
        //s.setname("ram");            //settter
        //System.out.println(s.getname());
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s2.getname());
        System.out.println(s2.getclass_1());
        System.out.println(s2.getsection());
    }
}
class std{
    private String name;
    private int class_1;
    private String section;
    std(String name,int class_1,String section){
        this.setname(name);
        this.setclass_1(class_1);
        this.setsection(section);
    }

    /* the private variables cannot be accessed so we write getters to access private variable */
    public String getname(){
        return name;
    }
    public String getsection(){
        return section;
    }
    public int getclass_1(){
        return class_1;
    }

    /* the values of the private variables cannot be changed so we write setters to change private variable */
    public void setname(String name){
        this.name=name;
    }
    public void setclass_1(int class_1){
        this.class_1=class_1;
    }
    public void setsection(String section){
        this.section=section;
    }
    public void copy(std st){
        this.setname(st.getname());
        this.setclass_1(st.getclass_1());
        this.setsection(st.getsection());
    }
}