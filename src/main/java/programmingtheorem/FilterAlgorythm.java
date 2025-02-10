package programmingtheorem;

public class FilterAlgorythm {
    // visszanéz múlt óra :)
        // egy tömb filterezni belöle a páros számokat
        // 1. lépés,hogy megszámláljuk a párosokat
        // 2. új tömb a megszámolt mérettel
        // 3. elhelyezzük benne az elemeket, amik megfelelnek a feltételeknek
        public static void main(String[] args) {

        }

        private static int countEvenNums(int[] numbers) {
            int counter = 0;
            for (int num: numbers ) {
                if (num % 2 == 0) {
                    counter++;
                }
            }
            return counter;
        }

        private static int[] createFilteredNumbers(int[] numbers) {
           /* int lenght = countEvenNums(numbers);
            return new int[lenght];*/
            return new int[countEvenNums(numbers)];
        }

        public static int[] filter(int[] numbers) {
            int[] resNums = null;
            if (numbers == null) {
                resNums = createFilteredNumbers(numbers);
                int[] nums = resNums;
                return nums;
            }
            int[] resNums = createFilteredNumbers(numbers);
            int index = 0; // új tömb indexe!
            for (int num: numbers) {
                if (num % 2 == 0) {
                    resNums[index] = num;
                    index++;
                }
            }
            return resNums;
        }
}
