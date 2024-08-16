package org.basic;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class Arraytwo {
    public static void main(String[] args) {
        int[] a = {2, 1, 3, 3, 4};
        int[] result = removeOneDuplicate(a);
        System.out.print("Array after removing one duplicate: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] removeOneDuplicate(int[] a) {
        HashSet<Integer> seen = new HashSet<>(); // To keep track of seen numbers
        List<Integer> resultList = new ArrayList<>();

        for (int num : a) {
            // Add number to result list only if it hasn't been seen before
            if (!seen.contains(num)) {
                resultList.add(num);
                seen.add(num); // Mark as seen
            }
        }

        // Convert the result list back to an array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}

