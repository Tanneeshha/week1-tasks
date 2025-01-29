import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {
    public static void main(String[] args) {
        
        int[] unsortedNumbers = {45, 12, 89, 33, 67, 24, 78, 56, 90, 15};
        System.out.println("Unsorted Array: " + Arrays.toString(unsortedNumbers));
        Arrays.sort(unsortedNumbers);
        System.out.println("Sorted Array:   " + Arrays.toString(unsortedNumbers));
        System.out.println(); 

        int[] sortedNumbers = {5, 12, 19, 26, 33, 45, 58, 63, 77, 84};
        System.out.println("Unsorted Array: " + Arrays.toString(sortedNumbers));
        Arrays.sort(sortedNumbers);
        System.out.println("Sorted Array:   " + Arrays.toString(sortedNumbers));
        System.out.println();

        Integer[] reverseSortedNumbers = {90, 80, 70, 60, 50, 40, 30, 20, 10, 0};
        System.out.println("Unsorted Array: " + Arrays.toString(reverseSortedNumbers));
        Arrays.sort(reverseSortedNumbers);
        System.out.println("Sorted Array:   " + Arrays.toString(reverseSortedNumbers));
        System.out.println();

        int[] mixedNumbers = {-12, 56, -34, 23, 45, -67, 78, -89, 90, -15};
        System.out.println("Unsorted Array: " + Arrays.toString(mixedNumbers));
        Arrays.sort(mixedNumbers);
        System.out.println("Sorted Array:   " + Arrays.toString(mixedNumbers));
        System.out.println();

        String[] tasks = {"Buy Groceries", "Read a Book", "Attend Java Workshop", "Complete Assignment", "Prepare Presentation"};
        System.out.println("Unsorted Array: " + Arrays.toString(tasks));
        Arrays.sort(tasks);
        System.out.println("Sorted Array:   " + Arrays.toString(tasks));
        System.out.println();

        int[] largeNumbers = {987, 123, 564, 776, 234, 879, 345, 112, 678, 901};
        System.out.println("Unsorted Array: " + Arrays.toString(largeNumbers));
        Arrays.sort(largeNumbers);
        System.out.println("Sorted Array:   " + Arrays.toString(largeNumbers));
        System.out.println();

        System.out.println("Unsorted Array: " + Arrays.toString(reverseSortedNumbers));
        Arrays.sort(reverseSortedNumbers, Collections.reverseOrder());
        System.out.println("Sorted Array (Descending): " + Arrays.toString(reverseSortedNumbers));
        System.out.println();

        System.out.println("Unsorted Array: " + Arrays.toString(tasks));
        Arrays.sort(tasks, Collections.reverseOrder());
        System.out.println("Sorted Array (Descending): " + Arrays.toString(tasks));
    }
}
