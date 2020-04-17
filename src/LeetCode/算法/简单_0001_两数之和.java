package LeetCode.算法;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author longtao
 * @Date   2020/4/15
 * @Describe
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 **/
public class 简单_0001_两数之和 {

    public static void main(String[] args) {
        简单_0001_两数之和 c = new 简单_0001_两数之和();
        int[] nums = {2,2,11,15};
        int target = 13;
        int[] ret = c.twoSum2(nums,target);
        for (int i:ret){
            System.out.println("下表是："+i);
        }
    }
    //自己的答案
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        for (int i = 0; i < nums.length-1; i++){
            for (int k = i+1;k < nums.length; k++){
                if(nums[i]+nums[k] == target){
                    ret[0] = i;
                    ret[1] = k;
                    return ret;
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
}

    //官方解答--暴力法
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    //官方解答--一遍哈希表
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
