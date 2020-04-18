package LeetCode.算法;

/**
 * @Author longtao
 * @Date 2020/4/18
 * @Describe 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数
 * 你能不将整数转为字符串来解决这个问题吗？
 * <p>
 * 示例 1:
 * 输入: 121
 * 输出: true
 * <p>
 * 示例 2:
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * <p>
 * 示例 3:
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 **/
public class 简单_0009_回文数 {

    public static void main(String[] args) {
        int num = 9;
        System.out.println("判断整数：" + num + "是否为回文：" + isPalindrome(num));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int ret = 0, num = x;
        while (x >= 10) {
            ret = ret * 10 + x % 10;//获取最后一位
            x /= 10;//
        }
        ret = ret * 10 + x;
        return (ret == num ? true : false);
    }

    //官方答案，考虑到整数反转之后，可能存在溢出的问题，所以只比较前半部分。
    //如果牵绊部分和后半部分是相同的，那么及时回文。
    public static boolean IsPalindrome1(int x) {
        // 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return x == revertedNumber || x == revertedNumber/10;
    }


}
