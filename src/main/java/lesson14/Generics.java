package lesson14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        // remove duplicates
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 1, 1, 1, 2));
        System.out.println("Remove duplicate"+removeDuplicates(list));
        //swap 2 elements
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        swap(arr, 0, 1);
        System.out.println("\nSwap: " + Arrays.toString(arr));

        // count occurrences
        List<String> strList = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h","a","b","c");
        System.out.println("\nCount of occurrences of a= " + countOccurrences(strList, "a"));
        // sumNumbers
        List<Double> numList = Arrays.asList(1.5,6.5,7.2,2.4);
        System.out.println("\nSum= "+ sumNumbers(numList));


    }

    // generics method remove duplicate
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    // swap 2 elements in an array
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // count numbers of elements in List<T>
    public static <T> int countOccurrences(List<T> list, T element) {
        int count = 0;
        for (T t : list) {
            if (t.equals(element)) {
                count++;
            }
        }
        return count;
    }

    // calculate numbers in List<? extends Number>
    public static <T> double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;

    }
}
