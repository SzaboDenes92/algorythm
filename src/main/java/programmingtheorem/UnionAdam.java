package programmingtheorem;

public class UnionAdam {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] nums = {3, 4, 5, 6, 7};
        int unionLength =  countLength(numbers, nums);
        int[] union = new int [unionLength];
        for (int i = 0; i < numbers.length; i++) {
            union[i] = numbers[i];
        }
        int index = union.length - 1; // 4. indexen álló elem
        for (int i = 0; i < nums.length; i++) {
            if (!searchElementMatching (nums[i], numbers)) {
                index++; // behelyés elött növelem
                union[index] = nums[i];
            }
        }
        System.out.println (Arrays.toString(union));
    }

    private static boolean searchElementMatching(int num, int[] numbers) {
        boolean isMatching = false;
        for (int num : numbers) {
            if ( num == element){
                isMatching = true;
                break;
            }
        }
        return isMatching;
    }

    private static int countLength(int[] numbers, int[] nums) {
        int unionLength = numbers.length;
        for (int num : nums) {
            if (!searchElementMatching (num, numbers)) {
                unionLength++;
            }
        }
        return unionLength;
    }

    private static int [] createUnion(int[] union, int[] numbers, int[] nums) {
        for (int i = 0; i < numbers.length; i++) {
            union[i] = numbers[i];
        }
        int index = numbers.length -1;
        for (int num : nums) {
            if (!searchElementMatching (num, numbers)) {
                union[index] = num;
            }
        }
        return union;
    }
}
