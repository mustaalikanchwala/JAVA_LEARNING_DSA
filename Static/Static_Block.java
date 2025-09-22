// watch static block video again to revise
class mobile{
    int price ;
    static String name;
    String brand;
     
    public mobile(){
        price = 99999;
        brand="appel";
        // name = "smartphone";  if we declare here it we call every time when an object created ,but name is here static variabel so it should called onces , so we have static block. 
        System.out.println("in costructor block");       
    }

    static{
        // it is a block when class loads its also loads once , its only load one time.
        name = "smartphone";
        System.out.println("in static block"); 
    }
}

public class Static_Block {
    public static void main(String[] args) {
        mobile m1 = new mobile();
        m1.brand = "apple";
        mobile.name = "technologia";
        m1.price = 99999999;
        mobile m2 = new mobile();
    }
    }
