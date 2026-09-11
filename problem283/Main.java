package problem283;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};

        new Solution().moveZeroes(nums);

        System.out.println("Result:   " + Arrays.toString(nums));
        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println("Passed:   " + Arrays.equals(nums, expected));
    }
}
