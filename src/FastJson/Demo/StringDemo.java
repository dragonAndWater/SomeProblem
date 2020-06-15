package FastJson.Demo;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "我们是祖国的花朵，我爱我的祖国";
        String str2 = "我爱我的祖国";
        String str3 = "AAAA";
        str1 = str1.replace(str2,str3);
        System.out.println("str1 = "+str1);
    }
}
