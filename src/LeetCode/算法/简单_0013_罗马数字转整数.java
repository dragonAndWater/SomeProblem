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

public class 简单_0013_罗马数字转整数 {
    public static void main(String[] args) {
        String s = "MCMXCVI";//1996
        System.out.println(s+"对应的整数位："+romanToInt(s));
    }

    public static int romanToInt(String s) {
        int size = s.length();
        char[] chr = new char[size];//创建字符串长度的字节数组
        //s --> char[]
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            chr[i] = s.charAt(i);
            total = getTotal(total, chr[i]);
        }
        System.out.println("获取到的总值为：" + total);
        System.out.println("要减去的值："+subString(s));
        return total-subString(s);

    }

    public static int getTotal(int num, char chr) {
//         * I = 1,V = 5,X = 10,L = 50,C = 100,D = 500,M = 1000;
        switch (chr) {
            case 'M':
                num += 1000;
                break;
            case 'D':
                num += 500;
                break;
            case 'C':
                num += 100;
                break;
            case 'L':
                num += 50;
                break;
            case 'X':
                num += 10;
                break;
            case 'V':
                num += 5;
                break;
            case 'I':
                num += 1;
            default:
                break;
        }
        return num;

    }


    public static int subString(String s) {
        int num = 0;
        while (!s.isEmpty()) {
            int plus = 0;
            String str = new String();
            if (s.contains("IV")) {
                plus = 1;
                str = "IV";
            }
            if (s.contains("IX")) {
                plus = 1;
                str = "IX";
            }
            if (s.contains("XL")) {
                plus = 10;
                str = "XL";
            }
            if (s.contains("XC")) {
                plus = 10;
                str = "XC";
            }
            if (s.contains("CD")) {
                plus = 100;
                str = "CD";
            }
            if (s.contains("CM")) {
                plus = 100;
                str = "CM";
            }
            if (str.isEmpty()) {
                break;
            }
            num = num + 2 * plus;
            System.out.println("num = "+num);
            s = s.substring(s.indexOf(str) + 2);
            System.out.println("s = "+s);
        }
        return num;
    }

}
