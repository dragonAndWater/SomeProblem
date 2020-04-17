package LeetCode.算法;

/**
 * @Author longtao
 * @Date 2020/4/17
 * @Describe 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 * 示例 1:
 * 输入: 123
 * 输出: 321
 * <p>
 * 示例 2:
 * 输入: -123
 * 输出: -321
 * <p>
 * 示例 3:
 * 输入: 120
 * 输出: 21
 **/
public class 简单_0007_整数翻转 {

    public static void main(String[] args) {
        int x = Integer.MAX_VALUE + 1;
//        long start_time = System.currentTimeMillis();
        System.out.println("反转之后的结果是：" + reverse1(x));
//        long end_time = System.currentTimeMillis();
//        System.out.println("共计时间："+(end_time-start_time));
    }

    //不知道咋想的呢，那么复杂的算法。
    public static int reverse(int x) {
        try {
            int flag = 1;
            if (x < 0) {
                x *= -1;
                flag = -1;
            }
            //将int转化为char[]
            char[] chr1 = String.valueOf(x).toCharArray();
            StringBuilder sb = new StringBuilder();//避免无用字符串
            for (int i = chr1.length - 1; i >= 0; i--) {
                sb.append(chr1[i]);
            }
            //给结果*符号
            return flag * Integer.valueOf(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    //超级解题法--超越100%用户
    public static int reverse1(int x) {
        int ans = 0;
        while (x != 0) {
            if ((ans * 10) / 10 != ans) {//溢出之后，不满足该条件
                ans = 0;
                break;
            }
            ans = ans * 10 + x % 10;
            x = x / 10;
        }
        return ans;
    }


}
