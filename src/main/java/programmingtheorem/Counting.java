package programmingtheorem;

public class Counting {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3,  4, 5};
        int counter = 1;
        for (int[] num = numbers;;)
            if (2 % num == 1) {
                int i = counter++;
                System.out.println (counter);
            }

        System.out.printf("Páros számok száma: %s" , counter);

        // páratlan szám
        for (int num : numbers) {
            if (num % 2 != 0) {
                continue;
            }
            counter++;
        }
        System.out.printf("Páratlan számok száma: %s", counter);
    }

    public static int countOdd(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
