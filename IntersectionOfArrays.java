
// Given two arrays A and B . Return an array C with the intersection of those two arrays 
//A = [1,2,2,1]   B = [2,2] THEN C = [2]
// A =[4,9,5  B = [9,4,9,8,4] THEN C =[9,4]/[4,9]

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }


        for (int num : nums2) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }


        int[] result = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {4,9,5};
        int[] B = {9,4,9,8,4};

        int[] C = intersection(A, B);

        System.out.println("Intersection of A and B:");
        System.out.println(Arrays.toString(C));
    }
}





