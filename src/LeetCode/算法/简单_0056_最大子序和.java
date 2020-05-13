package LeetCode.算法;

/**
 * @Author longtao
 * @Date 2020/5/11
 * @Describe 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 **/
public class 简单_0056_最大子序和 {
    public static void main(String[] args) {
        int[] nums = {-1,1,2,1};
        System.out.println(maxSubArray(nums));
    }


    public static int maxSubArray(int[] nums) {
        int max = 0;
        int flag = getNumMax(nums);
        for (int i = 0; i < nums.length; i++) {
            //i之前的元素相加为负数的，丢弃
            if (max + nums[i] <= 0) {
                max = 0;
                continue;
            }
            max += nums[i];
            //记录最大值
            if (flag < max) {
                flag = max;
            }
        }
        return flag;
    }

    //获取数组中的最大值（单个值）
    public static int getNumMax(int[] nums){
        int max = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        return max;
    }

}
