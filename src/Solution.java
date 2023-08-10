public class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        
        int left = 1, right = x;
        int result = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution solution1 = new Solution();
        System.out.println("Input: x = 4 ");
        System.out.println("Output: "+solution.mySqrt(4));
        System.out.println("Explanation: The square root of 4 is 2, so we return 2.");  // Output: 2

        System.out.println("Input: x = 8 ");
        System.out.println("Output: "+solution1.mySqrt(8));
        System.out.println("Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.");
    }
}

