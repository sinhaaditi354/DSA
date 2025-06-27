class Solution {
    public String firstPalindrome(String[] words) {
        for (String e : words) {
            String rev = new StringBuilder(e).reverse().toString();

            if (e.equals(rev)) {
                return e;
            }
        }
        return "";
    }
}
