package LeetCode.算法;

/**
 * @Author longtao
 * @Date 2020/5/5
 * @Describe 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * <p>
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 **/
public class 简单_0026_删除排序数组中的重复项 {
    public static void main(String[] args) {
//        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] nums = {1,1,2};
        removeDuplicates(nums);


    }
    //指针法
    public static int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[index] != nums[i]){
                nums[++index] = nums[i];
            }
        }
        for(int i : nums){
            System.out.print("nums:"+i);
        }
        return ++index;
    }
}
