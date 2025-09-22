public class JaggedArray {
    public static void main(String[] args) {
          // Jagged Array 
        // it has diffrent no. of colomuns in a multi dimension array 
        // eg we have 3 rows of array and diffrent colomun for each arrays of row
        int jagged[][] = new int[3][]; 
        // here we have to specify the no. of rows but for colomuns we have to mention specificaly
         jagged[0] = new int[3]; // for row 0 has 3 colomun
         jagged[1] = new int[2];
         jagged[2] = new int[4];

         for (int i = 0 ;i<jagged.length;i++){
            for(int j = 0;j<jagged[i].length;j++){
                jagged[i][j] = (int)(Math.random()*100);
            }
         }
            System.out.println("jagged Array");
         for(int eachArray[] : jagged){
                for(int eachelement : eachArray){
                    System.out.print(eachelement+" ");
                }
                System.out.println();
         }
         
    }
}
