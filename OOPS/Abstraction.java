// Abstract means incomplete or partial. An abstract class is a blueprint that cannot be directly instantiated (you cannot create 
// objects from it), and it may contain abstract methods that must be implemented by child classes.

abstract class Animal{
    void sleep(){
        System.out.println("Sleeping....");
    }
    abstract public void display();
}
class dog extends Animal{
    public void display(){
        System.out.print("Dog is barking and ");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        dog d = new dog();
        d.display();
        d.sleep();
    }
}
