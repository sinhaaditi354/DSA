/*class solution
{
    public void case1(int a[],int target)
    {
        int b[]= a[6];
        z=target;
        int i,c=0;
        int p1=[6];
        int k=b.length;
        for(i=0;i<k;i++)
        {
            if(b[i]==z)
            {
                p1[i]=i+1;
            }

        }
        print(p1[i]);


    }
    public static void main(String args[])
    {
        int a[6]=[5,7,7,8,8,10];
        case1(a[],5);
    }
}*/
import java.util.ArrayList;
/*
class Solution {     
    public int searchRange(int a[], int target) { 
        int[] b = a; 
        int z = target; 
        int i;
        
        ArrayList<Integer> p1 = new ArrayList<>();
        int k = b.length; 
        
        for (i = 0; i < k; i++) { 
            if (b[i] == z) { 
                p1.add(i + 1); // Adding positions (1-based index) to p1
            } 
        } 
        
        // Printing all the positions where the target is found
        System.out.println(p1);
        return 0 ;
    }     
    
    public static void main(String args[]) { 
        int[] a = {5, 7, 7, 8, 8, 10}; 
        
        // Creating an instance of Solution to call the searchRange method
        Solution sol = new Solution(); 
        sol.searchRange(a, 5); 
    } 
}
*/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false);
        result[0] = left;
        result[1] = right;
        return result;        
    }

    private int binarySearch(int[] nums, int target, boolean isSearchingLeft) {
        int left = 0;
        int right = nums.length - 1;
        int idx = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                idx = mid;
                if (isSearchingLeft) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return idx;
    }

}
