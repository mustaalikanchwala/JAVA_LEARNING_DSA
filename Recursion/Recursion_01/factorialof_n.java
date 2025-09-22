public class factorialof_n {
    public static void fact_n(int n,int fact){
         if(n==0) {
            System.out.println(fact);
            return;
         }
        fact=fact*n;
        fact_n(n-1, fact);
        System.out.println(n+" => "+fact);
    }
    public static int calfact(int n){
        if(n==1 || n==0) return 1;
        int fact_nm1 = calfact(n-1);
        int Fact = n*fact_nm1;
        return Fact;
    }
    public static void main(String s[]){
        fact_n(12, 1);
        System.out.println(calfact(4));
    }
}
