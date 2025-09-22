

    class mobile{
        int price;// instance variabel
        String name;// instance variabel
       static String brand;  // static variabel is common variabel , it will refere by all onject created by that class of static variabel 
    //    static varaibel should alway call from their class name
    
        void print(){
            System.out.println(brand+" is called as "+name+" price is "+price);
            System.out.println(brand+" it is a static variabel which will call by its class name");
        }
    }

public class basic {
    public static void main(String[] args) {
        mobile m1 = new mobile();
        m1.brand = "apple";
        m1.name = "technologia";
        m1.price = 99999999;
        mobile m2 = new mobile();
        m2.brand = "samsung";
        m2.name = "oomagutruelove";
        m2.price = 99999998;
        // static variabel should always call from class name 
        mobile.brand = "zindabaad";

        m1.print();
        m2.print();
       }
}
