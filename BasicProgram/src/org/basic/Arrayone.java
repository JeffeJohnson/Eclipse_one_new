package org.basic;
//TO REMOVE DUPLICATES

import java.util.HashMap;
import java.util.Map;

public class Arrayone {
    public static void main(String[] args) {
        // Example array with duplicates
        int[] array = {2, 3, 5, 7, 3, 5, 8, 9, 1, 2, 7, 8, 0, 0};

        // Call the method to remove all duplicates
        int[] filteredArray = removeAllDuplicates(array);

        // Print the resulting array
        System.out.print("Array after removing all duplicates: ");
        for (int num : filteredArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeAllDuplicates(int[] array) {
        // Step 1: Count occurrences of each element
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : array) {
            // Use an if-else statement to update the count
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1); // Increment the count
            } else {
                countMap.put(num, 1); // Initialize the count
            }
        }

        // Step 2: Calculate the size of the new array for unique elements
        int uniqueCount = 0;
        for (int num : array) {
            if (countMap.get(num) == 1) {
                uniqueCount++;
            }
        }

        // Step 3: Create and populate the new array with unique elements
        int[] result = new int[uniqueCount];
        int index = 0;
        for (int num : array) {
            if (countMap.get(num) == 1) {
                result[index++] = num;
            }
        }

        // Return the array of unique elements
        return result;
    }
}


	

		