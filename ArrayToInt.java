//WAP to accept an array and to convert an array into an integer

public class ArrayToInt {
    public static void main(String[] args) {

        //int[] arr = {1, 2, 3, 4, 5};

        int arr[] = {1,7,4,9};
        int result = arrayToInt(arr); 
        
        System.out.println("Integer value: " + result);
    }

    public static int arrayToInt(int[] arr) {
        int result = 0;
        int multiplier = 1;

        for (int i = arr.length - 1; i >= 0; i--) 
        {
            result += arr[i] * multiplier;
            multiplier *= 10;
        }

        return result;
    }
}





