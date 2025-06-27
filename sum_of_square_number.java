class Solution {
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b) {
                return true;
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        int param_1 = 5;
        boolean ret = new Solution().judgeSquareSum(param_1);
        System.out.println(ret);
    }
}
