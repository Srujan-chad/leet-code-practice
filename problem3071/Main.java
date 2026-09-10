package problem3071;
class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        long[] testCases = { 999, 1000, 12345, 999999, 1000000, 123456789L };

        for (long tc : testCases) {
            System.out.println("countCommas(" + tc + ") = " + sol.countCommas(tc));
        }
    }
}