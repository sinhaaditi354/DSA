/*class Solution {
    public int search(int[] nums, int target) 
    {
        int [] a;
        int i;
        for (i=0;i<a.length();i++)
        {
            if(target==a[i])
            {
                int l = i;
            }
        }
        return l;
    }
    public static void main(String [] args)
    {
        int d = search ( nums[4,5,6,7,0,1,2] , 0);
        d();

    }
        
    }
}*/
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] >= nums[left]) {
                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;        
    }
}
