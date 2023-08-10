public class Solution1 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            }
            
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println("Input: nums = [4,5,6,7,0,1,2] " );
        System.out.println("target = 0");
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println("Output: " + solution.search(nums, target));  

        Solution1 solution1 = new Solution1();
        System.out.println("Input: nums = [4,5,6,7,0,1,2] " );
        System.out.println("target = 3");
        int[] nums1 = {4,5,6,7,0,1,2};
        int target1 = 3;
        System.out.println("Output: " + solution1.search(nums1, target1)); 

        Solution1 solution2 = new Solution1();
        System.out.println("Input: nums = [1] " );
        System.out.println("target = 0");
        int[] nums2 = {1};
        int target2 = 0;
        System.out.println("Output: " + solution2.search(nums2, target2)); 
    }
}
