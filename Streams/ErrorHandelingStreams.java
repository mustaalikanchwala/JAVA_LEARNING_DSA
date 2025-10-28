import java.util.Arrays;
import java.util.List;

import javax.management.RuntimeErrorException;

class ErrorHandelingStreams {
    public static void main(String[] args) {
        List<String> langname = Arrays.asList("java","javaScript","python");
        langname.stream().forEach(b -> {
            try {
                if(b == "python")
                    throw new RuntimeException("We dont need python ");
            System.out.println(b);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e);
            }
        });
    }
    
}