package searchalgorithm;

public class LinearSearch {

    public static void main(String[] args) {
        int[] numbers = {5, 3, 6, 2, 10};
        int target = 6;

    }

    private static int linearSearch(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++ ) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static void print (int index) {
        System.out.println(index == -1 ? " the target element is " : " the target element is  not in the array: The target element is at index" + index);
    }
}
