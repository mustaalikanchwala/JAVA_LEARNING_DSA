// Polymorphism => Run time => Method OverRiding
// same Method name , Diffrent Implementation in child class
    // Co-Varient return type are allowed
    class A{

    }
    class B extends A{

    }

class Parent{
    public A eat(){ // method OverRidden
        System.out.println("Parent Method");
        System.out.println("eating desi food");
        return new A();
    }
}
class Child extends Parent{
    public B eat(){ // Method OverRiding
        System.out.println("overRide the method from parent class");
        System.out.println("eating healthy food ");
        // System.out.println("eating healthy food "+str);
        return new B();
        }


}
public class MethodOverRiding {

    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        p.eat();
        c.eat();
        // if we call a method , which child does not have , then it will ask to parent for that method.
        
        // condition for Method OverRiding
        // 1. only parent method we can override
        // 2. both method should have same arguments , if in parent we are passing string then in child also we have to pass String while overridig.
        // 3. name of both method shoul same 
        // 4. return type should also same 
        // 5. only Co-Varient return type of method are allowed.
        // 6. if changing the modifier it shoul alway increasing 
        // if it is defaul in parent and u do it public in child then it is ok but cannot do vice versa.
        // public > protected > default > private  

    }
    
}