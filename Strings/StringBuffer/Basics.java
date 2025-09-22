package StringBuffer;


public class Basics {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Mustaali");
        System.out.println(sb.capacity()); // it will give the space of string buffer, for empty Stringbuffer by default it is 16
        System.out.println(sb.length());// print length of string
        System.out.println(sb.append(" Kanchwala")); // it will add Kanchwala after Mustaali.
        String s = sb.toString(); // .toString convert any value to string,independent of value
        // System.out.println(sb.deleteCharAt(6)); // it will delete the char at given index
        System.out.println(sb.insert(8," Mustanshir"));  //it will add string in exsisiting string  
        

    }
}
