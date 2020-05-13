package LeetCode.算法;

/**
 * @Author longtao
 * @Date 2020/5/11
 * @Describe 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
 * 如果不存在最后一个单词，请返回 0 。
 * 说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。
 * <p>
 * 示例:
 * 输入: "Hello World"
 * 输出: 5
 **/
public class 简单_0058_最后一个单词的长度 {
    public static void main(String[] args) {
        String s = "  b a  asd   ";
        System.out.println(getLastA(s));
        System.out.println(lengthOfLastWord(s));
    }

    //会报错？。。。。
    public static int lengthOfLastWord(String s) {
        //截取最后一个单词，计算最后一个单词的长度
        s = s.trim();
        int index = s.lastIndexOf(" ");
        return s.substring(++index).length();
    }

    public static int lengthOfLastWord1(String s) {
        //截取最后一个单词，计算最后一个单词的长度
        s = s.trim();
        if (null == s || s.isEmpty()) {
            return 0;
        }
        char[] ch = s.toCharArray();
        int length = 0;
        for (int i = 0; i < ch.length; i++) {
            if (' ' == ch[i]) {
                length = 0;
                continue;
            }
            length++;
        }
        return length;
    }

    public static String getLastA(String s){
        //去掉右边的空格
        return s.trim();
    }
}
