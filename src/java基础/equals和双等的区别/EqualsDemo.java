package java基础.equals和双等的区别;
/**
 * @Author longtao
 * @Date   2020/1/16
 * @Describe equals 和 == 的区别
 **/
public class EqualsDemo {
    public static void main(String[] args) {
        int a = 100;
        int b = 99;
        int c = 99;
        String s1 = "1234";
        String s2 = "1234";
        String s3 = new String("1234");
        String s4 = null;
//        if(a == b){
//            System.out.println("== 针对基本数据类型：比较值");
//        }else if(b == c){
//            System.out.println("== 针对基本数据类型：比较值");
//        }

        if (s1 == s2){
            System.out.println("== 比较引用类型的地址值：s1 == s2");
        }

        if (s1 == s3){
            System.out.println("== 比较引用类型的地址值:s1 == s2");
        }

        if (s1.equals(s3)){
            System.out.println("equals 比较引用类型的的值:s1.equals(s3)");
        }

        if(s1.equals(s2)){
            System.out.println("equals 比较引用类型的的值:s1.equals(s2)");
        }

        try{
            if(s4.equals(s1)){
                System.out.println("不可能走到这");
            }
        }catch (Exception e){
            System.out.println("会产生空指针异常：因为s4为null，equals不允许左边的值为null");
            e.printStackTrace();
        }
    }

}
