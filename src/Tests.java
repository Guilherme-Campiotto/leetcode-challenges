package src;
public class Tests {

    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.

        Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        Example 2:

        Input: nums = [3,2,4], target = 6
        Output: [1,2]
        Example 3:

        Input: nums = [3,3], target = 6
        Output: [0,1]

        Problem from LeetCode
        https://leetcode.com/problems/two-sum/description/
     */
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        twoSum(nums, target);
    }


    public static int[] twoSum(int[] nums, int target) {
        int numberOneTarget = 0;
        int numberTwoTarget = 0;
        outerloop:
        for (int numberOne = 0; numberOne < nums.length; numberOne++) {
            for (int numberTwo = 1; numberTwo < nums.length; numberTwo++) {
                if (nums[numberOne] + nums[numberTwo] == target && numberOne != numberTwo) {
                    numberOneTarget = numberOne;
                    numberTwoTarget = numberTwo;  
                    break outerloop;
                }
            }
        }

        int[] result = {numberOneTarget, numberTwoTarget};
        System.out.println(result[0]);
        System.out.println(result[1]);
        return result;
    }
}
