package LeetCode;
//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
public class 数组遍历 {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2,4,5};
        singleNumber(nums);
    }

    public static int singleNumber(int[] nums) {
        int ret_num = 0;
        for (int i = 0; i < nums.length; i++) {
            int a = 0;
            int b = nums[i];
            for (int k = 0; k < nums.length; k++) {
                if (b == nums[k]) {
                    a++;
                }
            }
            if (a == 1) {
                System.out.println("数组中元素"+b + "的数量为:" + a);
                ret_num = b;
            }
        }
        return ret_num;
    }
}
