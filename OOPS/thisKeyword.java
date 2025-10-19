// In Java, this is a reserved keyword that represents the current instance of a class. When a method or constructor is invoked 
// on an object, this holds the reference to that specific object. The Java compiler automatically adds this reference, though 
// programmers can explicitly use it for clarity and to resolve naming conflicts.z
class Student{
    int i;
    String Name;
    Student(){
        System.out.println("calling the constructor using this keywords");
    }
    Student(int i, String Name){
        this();
        this.i = i;
        this.Name = Name;
        getinfo();
        getinfo(i,Name);
        // this(); call to this must be first statement in constructor
    }
    public void getinfo(){
        System.out.println("Printig name and roll using instace variabel");
        System.out.println("id : "+i+" Name : "+Name);
    }
     public void getinfo(int i , String Name){
        System.out.println("using the local constructor variabel");
        System.out.println("id : "+i+" Name : "+Name);
    }
}
public class thisKeyword {
    public static void main(String[] args) {
        Student s;
        s = new Student(1, "Mstaali");
    }
}
