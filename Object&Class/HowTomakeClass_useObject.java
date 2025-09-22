class makingblueprint {
//     A class in Java is like a blueprint or template to create objects. It defines properties (variables) and behaviors (methods) that the objects created from the class will have. A class itself is not a real entity but a plan for making objects.

// An object is an instance of a class. Using a class, you can create many objects that share the structure and behavior defined by the class but hold different data.


;// this is property of class
    int a ;
    String colour;
    int speed;

    // Behaviors 

   public void info(){
    System.out.println("the car no. is "+a+",colour is "+colour+" ,speed: "+speed);
    }

    // constructor 
//   when a new object made it should pass arguments.
    makingblueprint(int a,String colour,int speed){
        this.a=a;
        this.colour=colour;
        this.speed=speed;
    }

    public void info2(int a , String colour,int speed){
        System.out.println("the car no. is "+a+",colour is "+colour+" ,speed: "+speed);
    }
}

public class HowTomakeClass_useObject{
    // this is a class which is made as per name of file ,without this class code will not excute
    public static void main(String[] args) {
        
        makingblueprint make = new makingblueprint(2, "blue", 220);
        make.info();// its with constructor
        make.info2(1, "red", 221);
// info() uses the object's own data initialized by the constructor.

// info2(int a, String colour, int speed) uses the new data passed to it as arguments independently of the object's properties.

// So, calling make.info() shows the state(Data) of the object, while calling make.info2() just prints whatever values you give directly in the method call.
    }

}


