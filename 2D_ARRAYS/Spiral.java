import java.util.*;

public class Spiral {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int n = sc.nextInt();
        System.out.println("Enter colm");
        int m = sc.nextInt();
        int spiral[][] = new int[n][m];
        System.out.println("Enter Spiral elements ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                spiral[i][j] = sc.nextInt();
            }
        }
        int rowStart = 0;
        int rowEnd = n - 1;
        int colmStart = 0;
        int colmEnd = m - 1;

        while (rowStart <= rowEnd && colmStart <= colmEnd) {
            for (int col = colmStart; col <= colmEnd; col++) {
                System.out.print(spiral[rowStart][col] + " "); // it will print first row that is 0,0 0,1 0,2 for n = 3
            }
            rowStart++;// incrementing the row start because it is aleready printed. now it is
                       // rowStart=1
            for (int row = rowStart; row <= rowEnd; row++) {
                System.out.print(spiral[row][colmEnd] + " "); // now it will print the last colmn that is 1,2 2,2. (0,2)
                                                              // is printed above.
            }
            colmEnd--; // decrementing the colmEnd because the last colmun is printed. colmend = 1
            for (int col = colmEnd; col >= colmStart; col--) {
                System.out.print(spiral[rowEnd][col] + " "); // now it will print 2,1 and 2,0
            }
            rowEnd--; // now Decrementing rowEnd because it is printed. rowend = 1
            for (int row = rowEnd; row >= rowStart; row--) {
                System.out.print(spiral[row][colmStart] + " "); // now it will print 1,0
            }
            colmStart++; // Incrementing the colmStart because it is printed. colmstart = 1.

        }

    }
}
