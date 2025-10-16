class human{
    // int age = 11;; this both variabel are accseibel by any other class also
    // String name = "mustaali";
    private int age1 = 11;
    private String name1 = "Mustaali"; // this both variabel are privat and can use or acces in this class only 
    // to accses the private variabel or set private variabel we have to use method
    void getPrivate(){
        System.out.println(age1);
        System.out.println(name1);
    }
    void setPrivate(String n , int a){
        System.out.println("assing value to private variabel");
        age1 = a;
        name1 = n;
    }
    
}


public class Enclupsion{
    public static void main(String[] args) {
        human obj1 = new human();
    //   System.out.println(obj1.age);
    // System.out.println(obj.name);
    // System.out.println(obj1.age1); // here the age variabel is privat in human class so it is not visibel here.and it is not accsesibel directly but we can accses it in directly.
        // to accsesprivate variabel call method to get or set it.
        obj1.getPrivate();
        obj1.setPrivate("Mustaali Kanchwala", 19);
        obj1.getPrivate();
}
}