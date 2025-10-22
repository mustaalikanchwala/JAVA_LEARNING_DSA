// Feature      |  throw(Throw class)                               |  throws(Throws class)                 
// -------------+---------------------------------------------------+---------------------------------------
// Where used   |  Inside method body                               |  In method signature                  
// Purpose      |  Actually throws exception                        |  Warns caller about possible exception
// Who handles  |  Same method (try-catch inside)                   |  Caller method (try-catch in main)    
// Followed by  |  Exception object (new ArithmeticException(...))  |  Exception class name (Exception)    

// throw = I'm throwing it NOW (you handle it in same method)

// throws = I MIGHT throw it later (caller must handle it)​

class Throw{
    public void checkAge(int age ){
        try {
            if(age < 18){
                throw new ArithmeticException("Your age is below 18");
            }
        } catch (Exception e) {
            // e.getMessage(); // give exception message 
            System.out.println("Exception Occur : "+ e);
        }
    }
}

class Throws{
    int [] age = {1,3,4};
     public void Age( ) throws Exception{
        System.out.println(age[9]);
    }
}

public class throwVSthrows {
    public static void main(String[] args) {
        Throw t = new Throw();
        t.checkAge(0);
        Throws ts = new Throws();
        try {
        ts.Age();            
        } catch (Exception e) {
            System.out.println("Exception : " +e);
        }
    }
}

