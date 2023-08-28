public class inheritance {
    public static void main(String[] args) {
        car c=new car();
        bicycle b=new bicycle();
        c.go();
        b.go();
        System.out.println(c.wheels);
        System.out.println(b.wheels);
    }
}
class vehicle{
    double speed;
    void go(){
        System.out.println("this vehicle is moving");
    }
    void stop(){
        System.out.println("this vehicle is stopped");
    }
}
class car extends vehicle{
    int wheels=4;
}
class bicycle extends vehicle{
    int wheels=2;
}
