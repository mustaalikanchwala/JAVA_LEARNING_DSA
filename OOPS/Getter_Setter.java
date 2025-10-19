class Car{
    int speed;
    String Brand;
    String colour;

    Car(String Brand , String colour , int speed){
        System.out.println("Constructor is called");
        this.Brand = Brand;
        this.colour = colour;
        this.speed = speed;
        System.out.println("detail for car is set by constructor");
    }

    public void getCarDetail(){
        System.out.println("Brand : "+this.Brand);
        System.out.println("Colour : "+this.colour);
        System.out.println("MaxSpeed : "+this.speed);
    } 
    public void setCarDetail(String Brand , String colour , int speed){
        System.out.println("Setter Method is called");
        this.Brand = Brand;
        this.colour = colour;
        this.speed = speed;
        System.out.println("Car detail is set , by calling setter");
    }
}

public class Getter_Setter {
    public static void main(String[] args) {
        Car BMW = new Car("BMW", "Black", 360);
        BMW.getCarDetail();
        BMW.setCarDetail("BMW","WHITE", 400);
        BMW.getCarDetail();
    }
}
