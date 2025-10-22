// A Functional Interface is an interface that has exactly one abstract method. 
// Think of it as a special type of interface that defines only one task or action 
// that needs to be implemented.
@FunctionalInterface
interface BookAction {
    void performance();
}

// Functional InterAfce with Parameter
@FunctionalInterface
interface Operation{
    int add(int a1,int a2);
}

    // Lambda Expression Format
    // parameters -> expression Body
    // () -> {}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        // Normal Way/anonymous class 
        BookAction a = new BookAction(){
            @Override
            public void performance(){
                System.out.println("Using anonymous class Body");
            }
        };
            a.performance();
        //  the Above syntax is longer =.
        // Wrirting the Above anonymous class Expression in Lambda Expression
        BookAction b = () -> {
            System.out.println("Using the Lambda Expression");
        };
        b.performance(); 

        // if code is of one line we can directly wi=rite in this way also
        BookAction c = () -> System.out.println("Using one line Lambda Expression");
        c.performance();

        // Functional InterFace With Parameters 
        // Using Anonymas Class
        Operation d = new Operation() {
           public int add(int n ,int  m ){
                return n+m;
            }
        };
        
        System.out.println(d.add(6,27));
        // Using Lambda expression
        Operation e = (int n1 , int m1) -> {  // if one parameter is there than direct mention parameter then arrow
            return n1+m1;
        };
        System.out.println(e.add(6,27));

        // Using Short Cut
        Operation f = (int n2,int m2) ->  n2+m2;
        System.out.println(f.add(6,27));

        // Thread InterFace
        new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println("Running");
            }
        }).start();
        // Usinf Lambda Expression
        new Thread(() -> System.out.println("Running using Lambda Expression")).start();

    }
}
