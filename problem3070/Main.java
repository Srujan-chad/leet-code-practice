package problem3070;
class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] testCases = { 500, 999, 1000, 1001, 5000, 12345, 999999, 1000000 };
        int[] expected  = { 0,   0,   1,    2,    4001, 11346, 999000, 1000000 };

        for (int i = 0; i < testCases.length; i++) {
            int actual = sol.countCommas(testCases[i]);
            String status = (actual == expected[i]) ? "PASS" : "FAIL";
            System.out.println("countCommas(" + testCases[i] + ") = " + actual
                    + " | expected = " + expected[i] + " | " + status);
        }
    }
}
