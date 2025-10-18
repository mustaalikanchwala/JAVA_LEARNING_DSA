// Wraping of variabel and methods in singel unit is called Enclupsion
class human{
    int age = 11;; 
    String name = "mustaali";
    // above both variabel are accseibel by any other class also
    private int age1 = 11;
    private String name1 = "Mustaali"; 
    // above both variabel are privat and can use or acces in this class only 
    // to accses the private variabel or set private variabel we have to use method
    void getPrivate(){
        System.out.println("Printing The Private Variabel");
        System.out.println("Age : "+age1+ " Name : "+name1);
      System.out.println("===========================");
    }
    void setPrivate(String n , int a){
        System.out.println("assing value to private variabel");
        age1 = a;
        name1 = n;
        getPrivate();
    }
    
}


public class Enclupsion{
    public static void main(String[] args) {
        human obj1 = new human();
      System.out.println("Age : "+obj1.age+" Name : "+obj1.name);
      System.out.println("===========================");
    // above the age and name variabel is open (by default) in human class so it can easyly accesibel.
    // to accses private variabel call method to get or set it.
        obj1.getPrivate();
        obj1.setPrivate("Mustaali Kanchwala", 19);
}
}