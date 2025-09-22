import java.util.*;

public class CountType {
    public static void main(String abs[]) {
        Scanner sc = new Scanner(System.in);

        int pn = 0;
        int nn = 0;
        int zn = 0;
        do {
            System.out.println("Enter a number or x to stop : ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("X")) {
                break;
            }
            if (input.matches("-?\\d+")) {
                int n = Integer.parseInt(input);

                if (n > 0) {
                    pn++;
                } else if (n < 0) {
                    nn++;
                } else {
                    zn++;
                }
            } else {
                System.out.println("Plz enter valid number or X to stop programm");
            }
        } while (true);
        System.out.println("No. of positive numbers: " + pn);
        System.out.println("No. of negative numbers: " + nn);
        System.out.println("No. of Zero : " + zn);
    }
}
