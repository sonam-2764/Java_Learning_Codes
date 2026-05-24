// class Solution {

//     public static int maxProfit(int[] prices) {

//         int minPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;
//          for (int price : prices) {

//             if (price < minPrice) {
//                 minPrice = price;
//             } else {
//                 maxProfit = Math.max(maxProfit, price - minPrice);
//             }
//         }

//         return maxProfit;
//     }

//     public static void main(String[] args) {

//         int[] prices = {7,1,5,3,6,4};

//         int result = maxProfit(prices);

//         System.out.println("Maximum Profit = " + result);
//     }
// }












// class Solution {

//     public static void findMaxMin(int[] arr) {
//         int max = arr[0];
//         int min = arr[0];

//         for (int i = 1; i < arr.length; i++) {

//             if (arr[i] > max) {
//                 max = arr[i];
//             }

//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//         }

//         System.out.println("Maximum = " + max);
//         System.out.println("Minimum = " + min);
//     }

//     public static void main(String[] args) {

//         int[] arr = {3,5,1,9,2};

//         findMaxMin(arr);
//     }
// }
















// import java.util.Arrays;

// class Solution {
// public static void reverseArray(int[] arr) {

//         int left = 0;
//         int right = arr.length - 1;
//     while (left < right) {

//             int temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;

//             left++;
//             right--;
//         }
//     }
//     public static void main(String[] args) {

//         int[] arr = {1,2,3,4,5};

//         reverseArray(arr);

//         System.out.println(Arrays.toString(arr));
//     }
// }













// class Solution {

//     public static int secondLargest(int[] arr) {

//         int first = Integer.MIN_VALUE;
//         int second = Integer.MIN_VALUE;

//         for (int num : arr) {

//             if (num > first) {
//                 second = first;
//                 first = num;
//             }

//             else if (num > second && num != first) {
//                 second = num;
//             }
//         }

//         return second;
//     }

//     public static void main(String[] args) {

//         int[] arr = {12,35,1,10,34,1};

//         System.out.println("Second Largest = " + secondLargest(arr));
//     }
// }













// import java.util.Arrays;

// class Solution {

//     public static void moveZeroes(int[] nums) {

//         int j = 0;

//         for (int i = 0; i < nums.length; i++) {

//             if (nums[i] != 0) {

//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;

//                 j++;
//             }
//         }
//     }

//     public static void main(String[] args) {

//         int[] nums = {0,1,0,3,12};

//         moveZeroes(nums);

//         System.out.println(Arrays.toString(nums));
//     }
// }














// class Solution {

//     public static int maxSubArray(int[] nums) {

//         int currentSum = nums[0];
//         int maxSum = nums[0];

//         for (int i = 1; i < nums.length; i++) {

//             currentSum = Math.max(nums[i], currentSum + nums[i]);

//             maxSum = Math.max(maxSum, currentSum);
//         }

//         return maxSum;
//     }

//     public static void main(String[] args) {

//         int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

//         System.out.println("Maximum Sum = " + maxSubArray(nums));
//     }
// }














// import java.util.*;

// class Solution {

//     public static List<Integer> findDuplicates(int[] nums) {

//         List<Integer> result = new ArrayList<>();

//         for (int i = 0; i < nums.length; i++) {

//             int index = Math.abs(nums[i]) - 1;

//             if (nums[index] < 0) {
//                 result.add(index + 1);
//             } else {
//                 nums[index] = -nums[index];
//             }
//         }

//         return result;
//     }

//     public static void main(String[] args) {

//         int[] nums = {4,3,2,7,8,2,3,1};

//         System.out.println(findDuplicates(nums));
//     }
// }










// import java.util.Arrays;

// class Solution {

//     public static void reverse(int[] arr, int start, int end) {

//         while (start < end) {

//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;

//             start++;
//             end--;
//         }
//     }

//     public static void rotate(int[] nums, int k) {

//         int n = nums.length;

//         k = k % n;

//         reverse(nums, 0, n - 1);
//         reverse(nums, 0, k - 1);
//         reverse(nums, k, n - 1);
//     }

//     public static void main(String[] args) {

//         int[] nums = {1,2,3,4,5,6,7};

//         rotate(nums, 3);

//         System.out.println(Arrays.toString(nums));
//     }
// }












// class Solution {

//     public static int trap(int[] height) {

//         int left = 0;
//         int right = height.length - 1;
//          int leftMax = 0;
//         int rightMax = 0;
//         int water = 0;

//         while (left < right) {
//         if (height[left] < height[right]) {

//                 if (height[left] >= leftMax) {
//                     leftMax = height[left];
//                 } else {
//                     water += leftMax - height[left];
//                 }

//                 left++;
//             } else {

//                 if (height[right] >= rightMax) {
//                     rightMax = height[right];
//                 } else {
//                     water += rightMax - height[right];
//                 }

//                 right--;
//             }
//         }
//         return water;
//     }

//     public static void main(String[] args) {

//         int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

//         System.out.println("Trapped Water = " + trap(height));
//     }
// }












// class Solution {

//     public static double findMedian(int[] nums1, int[] nums2) {

//         int[] merged = new int[nums1.length + nums2.length];

//         int i = 0, j = 0, k = 0;

//         while (i < nums1.length && j < nums2.length) {

//             if (nums1[i] < nums2[j]) {
//                 merged[k++] = nums1[i++];
//             } else {
//                 merged[k++] = nums2[j++];
//             }
//         }

//         while (i < nums1.length) {
//             merged[k++] = nums1[i++];
//         }

//         while (j < nums2.length) {
//             merged[k++] = nums2[j++];
//         }

//         int n = merged.length;

//         if (n % 2 == 0) {
//             return (merged[n/2] + merged[n/2 - 1]) / 2.0;
//         } else {
//             return merged[n/2];
//         }
//     }

//     public static void main(String[] args) {

//         int[] nums1 = {1,3};
//         int[] nums2 = {2};

//         System.out.println("Median = " + findMedian(nums1, nums2));
//     }
// }
















// import java.util.Arrays;

// class Solution {

//     public static int[] runningSum(int[] nums) {

//         for (int i = 1; i < nums.length; i++) {
//             nums[i] += nums[i - 1];
//         }

//         return nums;
//     }

//     public static void main(String[] args) {

//         int[] nums = {1,2,3,4};

//         System.out.println(Arrays.toString(runningSum(nums)));
//     }
// }













// import java.util.*;

// class Solution {

//     public static void frequencyCount(int[] arr) {

//         HashMap<Integer, Integer> map = new HashMap<>();

//         for (int num : arr) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

//             System.out.println(
//                 entry.getKey() + " : " + entry.getValue()
//             );
//         }
//     }

//     public static void main(String[] args) {

//         int[] arr = {4,3,2,4,1,3,4};

//         frequencyCount(arr);
//     }
// }















// import java.util.Arrays;

// class Solution {

//     public static int removeDuplicates(int[] nums) {

//         int k = 1;

//         for (int i = 1; i < nums.length; i++) {

//             if (nums[i] != nums[k - 1]) {
//                 nums[k] = nums[i];
//                 k++;
//             }
//         }

//         return k;
//     }

//     public static void main(String[] args) {

//         int[] nums = {0,0,1,1,1,2,2,3,3,4};

//         int k = removeDuplicates(nums);

//         System.out.println("New Length = " + k);

//         for (int i = 0; i < k; i++) {
//             System.out.print(nums[i] + " ");
//         }
//     }
// }















// class Solution {

//     public static boolean isSorted(int[] arr) {

//         for (int i = 1; i < arr.length; i++) {

//             if (arr[i] < arr[i - 1]) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void main(String[] args) {

//         int[] arr = {1,2,3,4,5};

//         System.out.println(isSorted(arr));
//     }
// }



















// import java.util.Arrays;

// class Solution {

//     public static void reverse(int[] arr, int start, int end) {

//         while (start < end) {

//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;

//             start++;
//             end--;
//         }
//     }

//     public static void leftRotate(int[] arr, int d) {

//         int n = arr.length;

//         d = d % n;

//         reverse(arr, 0, d - 1);
//         reverse(arr, d, n - 1);
//         reverse(arr, 0, n - 1);
//     }

//     public static void main(String[] args) {

//         int[] arr = {1,2,3,4,5};

//         leftRotate(arr, 2);

//         System.out.println(Arrays.toString(arr));
//     }
// }










// import java.util.*;

// class Solution {

//     public static int subarraySum(int[] nums, int k) {

//         HashMap<Integer, Integer> map = new HashMap<>();

//         map.put(0, 1);

//         int prefixSum = 0;
//         int count = 0;

//         for (int num : nums) {

//             prefixSum += num;

//             if (map.containsKey(prefixSum - k)) {
//                 count += map.get(prefixSum - k);
//             }

//             map.put(prefixSum,
//                     map.getOrDefault(prefixSum, 0) + 1);
//         }

//         return count;
//     }

//     public static void main(String[] args) {

//         int[] nums = {1,1,1};

//         System.out.println(subarraySum(nums, 2));
//     }
// }















// class Solution {

//     public static int majorityElement(int[] nums) {

//         int candidate = 0;
//         int count = 0;

//         for (int num : nums) {
//          if (count == 0) {
//                 candidate = num;
//             }

//             if (num == candidate) {
//                 count++;
//             } else {
//                 count--;
//             }
//         }
//         return candidate;
//     }

//     public static void main(String[] args) {

//         int[] nums = {2,2,1,1,1,2,2};

//         System.out.println(majorityElement(nums));
//     }
// }
















// class Solution {

//     public static int findDuplicate(int[] nums) {

//         int slow = nums[0];
//         int fast = nums[0];

//         // Detect cycle
//         do {
//             slow = nums[slow];
//             fast = nums[nums[fast]];
//         } while (slow != fast);

//         // Find entry point
//         slow = nums[0];

//         while (slow != fast) {
//             slow = nums[slow];
//             fast = nums[fast];
//         }

//         return slow;
//     }

//     public static void main(String[] args) {

//         int[] nums = {1,3,4,2,2};

//         System.out.println(findDuplicate(nums));
//     }
// }















// class Solution {

//     public static int lengthOfLIS(int[] nums) {

//         int[] tails = new int[nums.length];
//         int size = 0;

//         for (int num : nums) {

//             int left = 0;
//             int right = size;

//             while (left < right) {

//                 int mid = (left + right) / 2;

//                 if (tails[mid] < num) {
//                     left = mid + 1;
//                 } else {
//                     right = mid;
//                 }
//             }

//             tails[left] = num;

//             if (left == size) {
//                 size++;
//             }
//         }

//         return size;
//     }

//     public static void main(String[] args) {

//         int[] nums = {10,9,2,5,3,7,101,18};

//         System.out.println(lengthOfLIS(nums));
//     }
// }












// import java.util.*;

// class Solution {

//     public static int[] maxSlidingWindow(int[] nums, int k) {

//         Deque<Integer> deque = new ArrayDeque<>();
//         int[] result = new int[nums.length - k + 1];

//         int index = 0;

//         for (int i = 0; i < nums.length; i++) {

//             // Remove out-of-window indices
//             while (!deque.isEmpty() &&
//                    deque.peekFirst() <= i - k) {

//                 deque.pollFirst();
//             }

//             // Remove smaller elements
//             while (!deque.isEmpty() &&
//                    nums[deque.peekLast()] < nums[i]) {

//                 deque.pollLast();
//             }

//             deque.offerLast(i);

//             // Window complete
//             if (i >= k - 1) {
//                 result[index++] = nums[deque.peekFirst()];
//             }
//         }

//         return result;
//     }

//     public static void main(String[] args) {

//         int[] nums = {1,3,-1,-3,5,3,6,7};

//         System.out.println(
//             Arrays.toString(maxSlidingWindow(nums, 3))
//         );
//     }
// }
















// import java.util.Arrays;

// class Solution {

//     public static int[][] transpose(int[][] matrix) {

//         int m = matrix.length;
//         int n = matrix[0].length;

//         int[][] result = new int[n][m];

//         for (int i = 0; i < m; i++) {

//             for (int j = 0; j < n; j++) {

//                 result[j][i] = matrix[i][j];
//             }
//         }

//         return result;
//     }

//     public static void main(String[] args) {

//         int[][] matrix = {
//             {1,2,3},
//             {4,5,6},
//             {7,8,9}
//         };

//         int[][] ans = transpose(matrix);

//         for (int[] row : ans) {
//             System.out.println(Arrays.toString(row));
//         }
//     }
// }













// import java.util.*;

// class Solution {

//     public static List<Integer> spiralOrder(int[][] matrix) {

//         List<Integer> result = new ArrayList<>();

//         int top = 0;
//         int bottom = matrix.length - 1;

//         int left = 0;
//         int right = matrix[0].length - 1;

//         while (top <= bottom && left <= right) {

//             // left -> right
//             for (int i = left; i <= right; i++) {
//                 result.add(matrix[top][i]);
//             }
//             top++;

//             // top -> bottom
//             for (int i = top; i <= bottom; i++) {
//                 result.add(matrix[i][right]);
//             }
//             right--;

//             if (top <= bottom) {

//                 // right -> left
//                 for (int i = right; i >= left; i--) {
//                     result.add(matrix[bottom][i]);
//                 }
//                 bottom--;
//             }

//             if (left <= right) {

//                 // bottom -> top
//                 for (int i = bottom; i >= top; i--) {
//                     result.add(matrix[i][left]);
//                 }
//                 left++;
//             }
//         }

//         return result;
//     }

//     public static void main(String[] args) {

//         int[][] matrix = {
//             {1,2,3},
//             {4,5,6},
//             {7,8,9}
//         };

//         System.out.println(spiralOrder(matrix));
//     }
// }












// class Solution {

//     public static boolean searchMatrix(int[][] matrix,
//                                        int target) {

//         int m = matrix.length;
//         int n = matrix[0].length;

//         int left = 0;
//         int right = m * n - 1;

//         while (left <= right) {

//             int mid = (left + right) / 2;

//             int row = mid / n;
//             int col = mid % n;

//             if (matrix[row][col] == target) {
//                 return true;
//             }

//             else if (matrix[row][col] < target) {
//                 left = mid + 1;
//             }

//             else {
//                 right = mid - 1;
//             }
//         }

//         return false;
//     }

//     public static void main(String[] args) {

//         int[][] matrix = {
//             {1,3,5,7},
//             {10,11,16,20},
//             {23,30,34,60}
//         };

//         System.out.println(searchMatrix(matrix, 3));
//     }
// }















// class Solution {
//  public static int diagonalSum(int[][] mat) {
//     int n = mat.length;
//         int sum = 0;
//         for (int i = 0; i < n; i++) {

//             sum += mat[i][i];
//             sum += mat[i][n - 1 - i];
//         }
//         // Remove duplicate center element
//         if (n % 2 == 1) {
//             sum -= mat[n / 2][n / 2];
//         }
//         return sum;
//     }
//      public static void main(String[] args) {
//          int[][] mat = {
//             {1,2,3},
//             {4,5,6},
//             {7,8,9}
//         };

//         System.out.println(diagonalSum(mat));
//     }
// }












import java.util.Arrays;

class Solution {

    public static void rotate(int[][] matrix) {

        int n = matrix.length;

        // Transpose
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {

            int left = 0;
            int right = n - 1;

            while (left < right) {

                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        rotate(matrix);

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}