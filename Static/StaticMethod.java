class mobile{
    static String name;
    String brand;
    int price;

      void print(){  // it is insctance method;
            System.out.println(brand+" is called as "+name+" price is "+price);
            System.out.println(name+" it is a static variabel which will call by its class name");
        }
        public static void print1(mobile obj){ // taking obj as arguments
            System.out.println(obj.brand+" is called as "+name+" price is "+obj.price); // we cannot use insctance variabel in static method becaues
            // we dont know from which obj value is coming,to use it we have  to take rguments
        }
}

public class StaticMethod {
    public static void main(String[] args) {   // here if we dont use static here, then we have to reate obj of staticmethod class but without main excution of code will not occur so we use static.
        mobile m1 = new mobile();
        m1.brand = "apple";
        mobile.name = "technologia";
        m1.price = 99999999;
        mobile m2 = new mobile();
        m2.brand = "samsung";
        mobile.name = "oomagutruelove";
        m2.price = 99999998;

        // mobile.print(); we cannot call  non static method using class name.
        mobile.print1(m1);

}
    }
