class Student{
    int id ;
    String Name;

    Student(int id , String Name){
        this.Name = Name;
        this.id = id;
        getinfo1(this.id, this.Name);
        getinfo1(id, Name);
        getinfo();
    }

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
        Student std = new Student(1, "Mustaali");
    }
}
