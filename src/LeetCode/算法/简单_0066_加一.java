package LeetCode.算法;

/**
 * @Author longtao
 * @Date 2020/5/11
 * @Describe 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 示例 1:
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 **/
public class 简单_0066_加一 {
    public static void main(String[] args) {
        int[] digits = {9,9};
        for (int i : plusOne1(digits)) {
            System.out.println(i);
        }
//        int[]  nums = new int[8];
//        for(int i=0;i<nums.length;i++){
//            System.out.println("nums["+i+"] = "+nums[i]);
//        }

    }

    public static int[] plusOne(int[] digits) {
        //解题思路：判断最后一位加加一后是否大于10
        int index = digits.length - 1;
        do {
            if (digits[index] < 9) {
                digits[index] += 1;
                return digits;
            }
            digits[index] = 0;
            index--;
        } while (index >= 0);

        //当前下标小于0，表示加十进位，数组长度不够
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        for (int i = 0; i < digits.length; i++) {
            newDigits[i + 1] = digits[i];
        }
        return newDigits;
    }

    public static int[] plusOne1(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

}
