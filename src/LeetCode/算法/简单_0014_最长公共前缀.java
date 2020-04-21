package LeetCode.算法;

/**
 * @Author longtao
 * @Date 2020/4/21
 * @Describe 编写一个函数来查找字符串数组中的最长公共前缀。
 * 所有输入只包含小写字母 a-z 。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>:["abc","okc","iic"]
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 **/
public class 简单_0014_最长公共前缀 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String str = longestCommonPrefix1(strs);
        if (str.isEmpty()) {
            System.out.println("不存在公共前缀" + str);
        } else {
            System.out.println("存在公共前缀" + str);
        }
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String str = new String();
        //找出最短的字符串
        int min_legth = strs[0].length();
        int index = 0;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < min_legth) {
                index = i;
                min_legth = strs[i].length();
            }
        }
        System.out.println("最短字符串：" + strs[index] + ",最短长度：" + min_legth + ",其下标：" + index);

        //用最短的字符串进行比较
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs[index].length(); i++) {
            boolean flag = true;
            for (int k = 0; k < strs.length; k++) {
                if (k != index && strs[k].charAt(i) != (strs[index].charAt(i))) {
                    flag = false;
                    break;//跳出当前循环
                }
            }
            if (flag) {
                sb.append(strs[index].charAt(i));
                System.out.println("公共前缀：" + strs[index].charAt(i));
            }else{
                break;
            }
        }
        return sb.toString();
    }


    //官方解答
    public static String longestCommonPrefix1(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;


    }














}
