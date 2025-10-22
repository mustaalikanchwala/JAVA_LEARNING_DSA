class UnderAgeException extends Exception{
    public UnderAgeException(String message){
        super(message);
    }
}
class Age{
    public void checkAge(int age){
        try {
              if(age< 18){
            throw new UnderAgeException("U are under Age ");
        }
        } catch (UnderAgeException e) {
            System.out.println("Excpetion: "+e);
        }
      
    }
}

public class CustomException {
    public static void main(String[] args) {
        Age a  = new Age();
        a.checkAge(0);
    }    
}
