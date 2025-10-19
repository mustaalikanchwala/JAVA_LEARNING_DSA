// One Method, Many Behaviors: All classes have the same method makeSound(), but each animal produces its own sound

// Runtime Decision: Java decides which version of makeSound() to call based on the actual object type, not the reference type

// Parent Reference: You can use a parent class reference (Animal) to point to child class objects (Dog, Cat, Cow)

// This is runtime polymorphism (method overriding) - the most common type you'll encounter in Java.
// there is a complie time polymorphism also.
// this method also called dynamic method dispatch

// Method OverRiding(Run Time Polymorphism)
class Animal{
    public void makeSound(){
        System.out.println("Animals Make sounds ");
    }
}
class Dog extends Animal{ // child of animal class
    public void makeSound(){
        System.out.println("Dogs says bhav bhav");
    }
}
class Cat extends Animal{ // child of animal class
    public void makeSound(){
        System.out.println("Cat says meaov meav");
    }
}

// Method OverLoading(Compile Time Polymorphism)
class Calc{
    public void add(int n , int m){
        System.out.println("Integer "+(n+m));
    }
    public void add(double n , double m){
        System.out.println("Double "+(n+m));
    }
}

// Types of Polymorphism 
// 1. compile time => Method Overloading
// 2. Run Time => Method OverRiding

public class Polymorphism{
    public static void main(String[] args) {
        // Method OverRiding(Run Time Polymorphism)
        Animal myanimal;
        // here refering superclass
        myanimal = new Animal(); // create object of animal class
        myanimal.makeSound();
        // refrence of Dog
        myanimal = new Dog();
        myanimal.makeSound();
        // refrence of Cat
        myanimal = new Cat();
        myanimal.makeSound();

        // Method OverLoading(Compile Time Polymorphism)
        Calc cal = new Calc();
        cal.add(11, 12);
        cal.add(11.6, 11.4);
    }
}