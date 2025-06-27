class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for (int i = 1; i < s.length(); i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }
        return score;
    }
}

public class Main {
    public static void main(String[] args) {
        String input1 = "hello";
        String input2 = "zaz";

        Solution solution = new Solution();
        int output1 = solution.scoreOfString(input1);
        int output2 = solution.scoreOfString(input2);

        System.out.println("Output for input '" + input1 + "': " + output1);
        System.out.println("Output for input '" + input2 + "': " + output2);
    }
}
