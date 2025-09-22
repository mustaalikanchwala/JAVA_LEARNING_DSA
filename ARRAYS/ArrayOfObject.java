

class Students{
    int rolno;
    String name;
    int marks;
}

public class ArrayOfObject {
    public static void main(String[] args) {
        // These are objects created from class Students
        Students s1 = new Students();
        s1.marks = 90;
        s1.name = "Ali";
        s1.rolno = 1;
        Students s2 = new Students();
        s2.marks = 98;
        s2.name = "Alu";
        s2.rolno = 2;
        Students s3 = new Students();
        s3.marks = 100;
        s3.name = "Mustaali";
        s3.rolno = 3;
        Students stdInfo[] = new Students[3];  // this store refrences of above object.
        stdInfo[0]=s1;
        stdInfo[1]=s2;
        stdInfo[2]=s3;
        // now by refereing object to array , we can use for loop and handel many data or print;

        // printing student data

        // for(int i = 0 ; i<stdInfo.length;i++){
        //     System.out.println(stdInfo[i].name + " : "+stdInfo[i].rolno + " => " + stdInfo[i].marks);
        // }

        for (Students eachstd : stdInfo){ // here stdinfo if of Students types therefore we have to mention same type for eachstd.
            System.out.println(eachstd.name + " : "+eachstd.rolno + " => " + eachstd.marks);
        }



    }
}
