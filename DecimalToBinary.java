// WAP to convert Numeric number to binary codes 


import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        scanner.close();

        String binary = decimalToBinary(decimal);
        System.out.println("Binary representation: " + binary);
    }

    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();

        if (decimal == 0) {
            binary.append("0");
        } else {
            while (decimal > 0) {
                int remainder = decimal % 2;
                binary.insert(0, remainder);
                decimal /= 2;
            }
        }

        return binary.toString();
    }
}
