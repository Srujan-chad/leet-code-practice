package problem3071;
class Solution {
    public long countCommas(long n) {
        long lower = 1000;
        long result = 0;
        long comma = 1;
        while (lower <= n) {
            long upper = (lower * 1000) - 1;
            if (upper > n) upper = n;
            long count_no = (upper - lower) + 1;
            result += (count_no * comma);
            lower = lower * 1000;
            comma++;
        }
        return result;
    }
}

