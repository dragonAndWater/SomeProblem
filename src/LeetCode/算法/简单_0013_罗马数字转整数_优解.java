package LeetCode.算法;

/**
 * @Author longtao
 * @Date 2020/4/20
 * @Describe 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * I = 1,V = 5,X = 10,L = 50,C = 100,D = 500,M = 1000;
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 * <p>
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * <p>
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 * <p>
 * 输入: "MCMXCIV"
 * 输出: 1994
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 **/

public class 简单_0013_罗马数字转整数_优解 {
    public static void main(String[] args) {
        String s = "MCMXCVI";//1996
        System.out.println(s+"对应的整数位："+romanToInt(s));
    }


    //解题思路：前一位比后一位小，则记减法，反之则记加法。
    public static int romanToInt(String s) {
//        char[] chr = new char[s.length()];//创建字符串长度的字节数组
        int judgeNum = getValue(s.charAt(0));

        int total = 0;
        for (int i = 1; i <  s.length(); i++) {
            int num = getValue(s.charAt(i));
            if(judgeNum >= num){
                total += judgeNum;
            }else{
                total -= judgeNum;
            }
            judgeNum = num;
        }
        total += judgeNum;
        return total;
    }

    public static int getValue(char s) {
//         * I = 1,V = 5,X = 10,L = 50,C = 100,D = 500,M = 1000;
        switch (s) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                return 0;
        }
    }

}
