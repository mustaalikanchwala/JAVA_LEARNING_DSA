package Functions;

class calc{
    public static int add(int n1,int n2){
        return n1+n2;
    } 
}
class AdvaCalc extends calc{
    public static int add(int n1,int n2){ // here it is called method overriding ,there are two method 
        // if user create object from calc which is parent of AdvaCalc , and use add method it will get normal result 
        // but if it create obj from advaCalc and use add method then it prefer to use there instance method
        // similar to farther and children phone 
        return n1+n2+1;
    } 
}
public class MethodOverRiding {
    public static void main(String[] args) {
        AdvaCalc obj = new AdvaCalc();
        obj.add(9, 2);
    }
}
