class Calc{
    public int add(int n1,int n2){
        return n1 + n2;
    }
    public int sub(int n1,int n2){
        return n1 - n2;
    }
}
class AdvCalc extends Calc{ // here by extending Calc class,it will become superclass and AdvCalc is subclass ,it have all method & variabel of superclass.
    public int multi(int a,int h){
        return a*h;
    }
    public int div(int a,int h){
        return a/h;
    }
}

// in java multipel inheritance does not work

public class inheritance{
    public static void main(String[] args) {
        AdvCalc a = new AdvCalc();
        System.out.println(a.add(9,6 ));
        System.out.println(a.multi(9,6 ));
        System.out.println(a.div(9,6 ));
        System.out.println(a.sub(9,6 ));

        
    }
}