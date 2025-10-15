package Telusko;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class teluskoTask {
    public static void main(String abs []){
        Comparator<String> com = new Comparator<String>() {
            public int compare(String i , String j){
                if(i.length()> j.length()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        List<String> str = new ArrayList();
        str.add("keek");
        str.add("kee");
        str.add("ke");
        str.add("k");
        System.out.println(str);
        Collections.sort(str,com);
        System.out.println(str);
    }
}
