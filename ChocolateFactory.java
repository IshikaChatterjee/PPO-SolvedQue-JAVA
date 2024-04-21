// A Chocolate factory is packing chocolates into the packet where the chocolate packets represent an array of n number of values,
// the task is to find empty packets and push it into the back of conveyor belt
//INPUT : [ 4,5,0,1,9,0,5,0]
//OUTPUT : [4,5,1,9,5,0,0,0]


import java.util.Arrays;

public class ChocolateFactory {
    public static void main(String[] args) {
        int[] chocolates = {4, 5, 0, 1, 9, 0, 5, 0};
        packChocolates(chocolates);
        System.out.println(Arrays.toString(chocolates));
    }

    public static void packChocolates(int[] chocolates) {
        int nonZeroCount = 0;

        for (int i = 0; i < chocolates.length; i++) {
            if (chocolates[i] != 0) {
                chocolates[nonZeroCount++] = chocolates[i];
            }
        }
        for (int i = nonZeroCount; i < chocolates.length; i++) {
            chocolates[i] = 0;
        }
    }
        
    }


