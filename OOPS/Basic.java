class student{

    // Instance Variabel
    int stdID;
    String stdName;
    int stdRollNo;
    String stdCity;

    // Methods
    public void getStdInfo(){
        System.out.println("Student ID : "+stdID);
        System.out.println("Student Name : "+stdName);
        System.out.println("Student RollNo : "+stdRollNo);
        System.out.println("Student City : "+stdCity);
    }
    public void setStdInfo(int id , String name , int Roll , String City){
        stdCity = City;
    }
}
public class Basic {
    public static void main(String[] args) {
        student std1 = new student();
        std1.setStdInfo(1,"Aryan",1,"Mumbai");
        System.out.println(std1.stdCity);
    }
    
}
