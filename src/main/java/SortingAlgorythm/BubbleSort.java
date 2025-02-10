package SortingAlgorythm;

public class bubbleSort {

}
    public static void main(String[] args) {

        /*for (int i = numbers.length - 1; i >= 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }*/
        int[] numbers = {5, 3, 6, 2, 10};
        int lenght = numbers.length;
        boolean isSwapped;

        isSwapped = false;
        for (int j = 0; j < lenght - 1 - 1; j++) {
            if (numbers[j] > numbers[j + 1]) {
                int temp = numbers[j];
                numbers[j] = numbers[j + 1];
                numbers[j + 1] = temp;
                isSwapped = true;
            }
        }
        if (isSwapped) {
            isSwapped = false;
            for (int j = 0; j < lenght - 1 - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (isSwapped) {
                isSwapped = false;
                for (int j = 0; j < lenght - 1 - 1; j++) {
                    if (numbers[j] > numbers[j + 1]) {
                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                        isSwapped = true;
                    }
                }
                if (isSwapped) {
                    isSwapped = false;
                    for (int j = 0; j < lenght - 1 - 1; j++) {
                        if (numbers[j] > numbers[j + 1]) {
                            int temp = numbers[j];
                            numbers[j] = numbers[j + 1];
                            numbers[j + 1] = temp;
                            isSwapped = true;
                        }
                    }
                    if (isSwapped) {
                    }
                }
            }
        }
        System.out.println(numbers);

}
