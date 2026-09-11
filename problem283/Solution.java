package problem283;

class Solution {
    public void moveZeroes(int[] nums) {
        int[] nonZeros = new int[nums.length];
        int count = 0; 
        for (int i : nums) {
            if (i != 0) {
                nonZeros[count++] = i;
            }
        }
        for (int idx = 0; idx < nums.length; idx++) {
            nums[idx] = (idx < count) ? nonZeros[idx] : 0;
        }
    }
}
