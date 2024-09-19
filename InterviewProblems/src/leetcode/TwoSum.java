import java.util.HashMap;
import java.util.Map;
/**
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Constraints:
    2 <= nums.length <= 104
    -109 <= nums[i] <= 109
    -109 <= target <= 109
Only one valid answer exists.
**/

public class TwoSum {
    int[] numbers = {3,3};
    int sum = 6;

    /**
     * Brute force: Time Complexity: O(n square 2), Space Complexity: O(1)
     */
    public int[] twoSumBruteForce(int[] nums, int target) {
        for(int i=0; i < nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                return new int[] {i, j};
            }
        }
        return new int[] {};
    }

    /**
     * Optimized Solution 1: Time Complexity: O(n), Space Complexity: O(n)
     * In this approach the Map is filled initially with all the elements of an array in a separate loop which is a time-consuming step.
     * ------------
     * Approach:
     * ------------
     * Step 1. Store the contents of array in map - put elements as keys and index as values
     * Step 2. Iterate over an array, check if map contains key (delta) and value at key delta is not equal to the index of an array then return indexes
     *  -- delta = target - nums[i]
     */
    public int[] twoSumOptimizedSolution1(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i=0; i < nums.length; i++){
            int x = nums[i];
            int delta = target - x;
            if(map.containsKey(delta) && map.get(delta) != i){
                return new int[]{i, map.get(delta)};
            }
        }
        return new int[]{};
    }

    /**
     * Optimized Solution 2: Time Complexity: O(n), Space Complexity: O(n)
     * This solution will add data in Map iff object is not present. It will perform check and insertion inside a single loop.
     * -------------
     * Approach:
     * -------------
     * Step 1. Iterate over an array, check if map contains key (delta), if yes then return indexes else refer 'Step 2' below.
     * -- delta = target - nums[i]
     * Step 2. Store the content of an array in map - put elements as keys and index as values
     */
    public int[] twoSumOptimizedSolution2(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            int x = nums[i];
            int delta = target - x;
            if(map.containsKey(delta)) return new int[] {map.get(delta), i};
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
