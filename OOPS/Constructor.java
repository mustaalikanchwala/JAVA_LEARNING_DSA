class Student{
    int id ;
    String Name;

    // constructor overloading
    // when we make constructor more than on of same name but diffrent behaviour , it will call constructor overloading

    // non paramatized constructor
    // when we make a new object through this constructor ,then this constructor will run.
    Student(){
        System.out.println("when we make a new object through this constructor ,then this constructor will run ");
        System.out.print("In Non Paramatized Constructor");
    }

    // paramatized constructor
    Student(int id , String Name){
        this.Name = Name;
        this.id = id;
        getinfo1(this.id, this.Name);
        getinfo1(id, Name);
        getinfo();
    }

    // Methods
    public void getinfo1(int id , String Name){
        System.out.println("using the local constructor variabel");
        System.out.println("id : "+id+" Name : "+Name);
    }
    // here we use the value of instance variabel that we assing in constructor;
    public void getinfo(){
        System.out.println("Using instance Variabel");
        System.out.println("id : "+id+" Name : "+Name);
    }

}
public class Constructor {
    public static void main(String[] args) {
        Student std1 = new Student(1, "Mustaali");
        Student std2 = new Student(); 
    }
}
