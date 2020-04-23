package LeetCode.算法;

/**
 * @Author longtao
 * @Date 2020/4/23
 * @Describe 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 **/
public class 简单_0020_有效括号 {
    //解题思路：
    //一定会存在两个相邻的同类型左右括号（不存在就flase）
    //删去一组左右括号后，在剩余的字符串里找
    //最后字符串是空串的，结果为true
    //一定是偶数

    public static void main(String[] args) {

        String s = new String("()[]{}(){()}{}");

        System.out.println("结果：" + isValid1(s));
    }


    public static boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        StringBuilder sb = new StringBuilder(s);
        int index = -1;
        do {
            if (sb.toString().isEmpty()) {
                return true;
            }
            //获取下标
            index = getIndex(sb.toString());
            //有则截取，无则false
            if (index != -1) {
                sb.delete(index, index + 2);
            }
//            System.out.println("index :"+index);
//            System.out.println("sb :"+sb);
        } while (index != -1);
        return false;//当index = -1，且字符串不为空串。此时一定为false
    }

    //在串中查找配对的括号 下标
    public static int getIndex(String s) {
        int index = -1;
        if (s.indexOf("[]") != -1) {
            index = s.indexOf("[]");
        }
        if (s.indexOf("{}") != -1) {
            index = s.indexOf("{}");
        }
        if (s.indexOf("()") != -1) {
            index = s.indexOf("()");
        }
        return index;
    }


    //极简法
    public static boolean isValid1(String s) {
        if (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            return isValid(s.replace("()", "").replace("[]", "").replace("{}", ""));
        } else {
            return "".equals(s);
        }
    }
}

