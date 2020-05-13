package LeetCode.算法;

/**
 * @Author longtao
 * @Date 2020/5/11
 * @Describe 外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。前五项如下：
 * <p>
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * <p>
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出外观数列的第 n 项。
 **/
public class 简单_0038_外观数列 {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i <= num; i++) {
            System.out.println(countAndSay(i));
        }
    }

    public static String countAndSay(int n) {
        String str = "1";
        int flag = 1;
        if (n == flag) {
            return str;
        }
        do {
            str = getResult(str);
            flag++;
        } while (flag < n);
        return str;

    }

    public static String getResult(String str) {
        StringBuilder sb = new StringBuilder();
        char[] ch = str.toCharArray();
        int num = 1;
        if (ch.length == 1) {
            return sb.append(num).append(ch[0]).toString();
        }
        for (int i = 1; i < ch.length; i++) {
            if (ch[i - 1] != ch[i]) {
                sb.append(num).append(ch[i - 1]);
                num = 0;
            }
            num++;
            if (i == ch.length - 1) {
                sb.append(num).append(ch[i]);
            }
        }
        return sb.toString();
    }
}
