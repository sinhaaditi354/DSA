class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                return true;
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {2, 6, 4, 1};
        int[] arr2 = {1, 2, 34, 3, 4, 5, 7, 23, 12};

        Solution solution = new Solution();
        System.out.println(solution.threeConsecutiveOdds(arr1)); // Output: false
        System.out.println(solution.threeConsecutiveOdds(arr2)); // Output: true
    }
}
