// super keyword refer to immediate parent class
class vehicel{
    int maxSpeed = 120;

    vehicel(){
        System.out.println("Vehicel class constructor is called using super keyword");
    }
    void display(){
        System.out.println("max speed of vehicel : "+maxSpeed);
    }
}
class car extends vehicel{
    int maxSpeed = 180;
    car(){
        super(); // calling the vehicel constructor
        System.out.println("car constructor called");
    }
    void display(){
        super.display();// calling display method of vehicel class (parent class ) using super keyword 
        System.out.println("car speed : "+this.maxSpeed);// taking maxspeed variabel of this class 
    }
    void vehicelSpeed(){
        System.out.println("vehicel speed : "+super.maxSpeed); // taking parent class variabel using super
    }
}

public class superKeyword {

    public static void main(String[] args) {
        car c = new car();
        c.display();
        c.vehicelSpeed();
    }
}