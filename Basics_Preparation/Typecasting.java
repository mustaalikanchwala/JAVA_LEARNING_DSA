
import java.util.*;
public class Typecasting {
    public static void main(String abs[]){
        int a = 3337;
        byte b = 12;
        b = (byte)a; // byte has range between -128 to 127 then if number bigger than this will typecast it will % by 256 and stores value
        System.out.println(b);
        System.out.println(256%256);
    }
}
