package LeetCode.算法;
/**
 * @Author longtao
 * @Date   2020/5/7
 * @Describe
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 * 给定 nums = [0,1,2,2,3,0,4,2], val = 2,
 *
 * 函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
 *
 * 注意这五个元素可为任意顺序。
 **/
public class 算法_0027_移除元素 {
    public static void main(String[] args) {
        int[] nums = {0,1,3,2,3,0,4,2};
        int val = 2;
        System.out.println("长度为："+removeElement1(nums,val));
    }

    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i= 0;i< nums.length;i++){
            if(nums[i] != val){
                nums[index++] = nums[i];
            }
        }
        for(int i : nums){
            System.out.print(i+" ");
        }
        return index;
    }

    /**
     * 双指针法，重复值少时，效率更快
     **/
    public static int removeElement1(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while(i<n){
            if(nums[i] == val){
                nums[i] = nums[n-1];
                n--;
            }else{
                i++;
            }
        }
        for(int k : nums){
            System.out.print(k+" ");
        }
        return i;
    }
}
