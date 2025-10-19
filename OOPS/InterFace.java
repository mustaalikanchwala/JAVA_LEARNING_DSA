// Use Abstract Class when: You have related classes (Dog, Cat are both Animals) 
// that share common code and state (like the name field and sleep method).​

// Use Interface when: You want to define capabilities that unrelated classes can have - 
// Bird, Duck, and Fish are different creatures, but some can fly and some can swim. 
// Interfaces let you mix and match these abilities without forcing a parent-child relationship

interface CarControls{
    // declaring the method 
    void turnRight();
    void turnLeft();
    void applyBrakes();

    // in latest version of java we can also define the method using "default" keyword.
    // genraly we should not define methods in interface.
    // default void speedUp(){
    //     System.out.println("Increasing the speed of Car ");
    // }
}
// Multipel interface can implements to single class. its support multipel inheritance(in Interface)
class ElectricCar implements CarControls{
    // if we implement interface we have to define all methods declare in interface ,if we cannot then make that class abstrcact 

    @Override
    public void applyBrakes() {
    System.out.println("Applying Brake...");        
    }

    @Override
    public void turnLeft() {
    System.out.println("Turning Left....");        
    }

    @Override
    public void turnRight() {
    System.out.println("Turning Right....");        
    }
    
}

public class InterFace {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        ec.applyBrakes();
        ec.turnLeft();
        ec.turnRight();
    }
}
