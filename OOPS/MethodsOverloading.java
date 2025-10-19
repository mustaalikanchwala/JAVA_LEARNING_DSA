// Polymorphism => compile time => Method Overloading
// same Method name ,Diffrent Parametrs
public class MethodsOverloading {

   // Method Overloading
    
    public static void study(){
        System.out.println("Studying....");
    }
    public static void study(String Name){
        System.out.println(Name + " is Studying.....");
    }
    public static void study(String Name,int i ){
        System.out.println(Name + " is Studying for "+i+" hours");
    }
     public static int study(int i){
        return i+3;
    }

    public static void main(String[] args) {
        // if we dont use the static keyword in method ,then  we cannot use the methods directly
        // first make object of class from which method is belong and then use.
        // by using static keyword we can directly access the variabel ,method without creating object. 
        // MethodsOverloading m = new MethodsOverloading();
        // m.study("");
        study();
        study("Mustaali");
        study("Mustaali",9);
        System.out.println(study(9));
    }
}
