
//WAP TO FIND NTH PROGRAM OF THE GIVEN SERIES: 0,0,2,1,4,2,6,3,8,4,10,5,5,12,6,1,4,7,16,8

import java.util.Scanner;

public class NthTermSeries {
    public static int findNthTerm(int n) {
        int m = n / 2;
        int p = n % 2;

        if (p == 0) {
            return 2 * m;
        } else {
            return m;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();


        int nthTerm = findNthTerm(n);
        System.out.println("The " + n + "th term of the series is: " + nthTerm);

        scanner.close();
    }
}




