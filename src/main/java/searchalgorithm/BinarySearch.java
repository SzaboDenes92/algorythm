package searchalgorithm;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int key = 5;
        int resIndex = Arrays.binarySearch(nums, key);
        System.out.println(resIndex);

        int[] numbers = {5, 3, 6, 2, 10, 12, 16, 18};
        int[] sortedNums = sort(numbers);
        System.out.println(Arrays.toString(sortedNums));
        int adamTargetNum = 8;
        int indexbyAdam = binarySearch2(numbers, adamTargetNum);
        int target = 8;
        int index = binarySearch (numbers, target);
        System.out.println(indexbyAdam);
        System.out.println(index);
    }

    private static int[] sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int swap = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = swap;
                }
            }
        }
        return nums;
    }

    private static int  binarySearch(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            if (nums[middleIndex] == target) {
                return middleIndex;
            } else if  (nums[middleIndex] < target) {
                leftIndex = middleIndex + 1;
            }
        }
        return -1;
    }

    private static int  binarySearch2(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            if (nums[middleIndex] == target) {
                return middleIndex;
            }
            if (nums[middleIndex] < target) {
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}
