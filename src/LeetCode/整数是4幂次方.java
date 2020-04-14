package LeetCode;

//给定一个整数 (32 位有符号整数)，请编写一个函数来判断它是否是 4 的幂次方。
//你能不使用循环或者递归来完成本题吗？
public class 整数是4幂次方 {

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(1));
    }


    //    PUBLIC STATIC BOOLEAN ISPOWEROFFOUR(INT NUM) {
//        IF(NUM %4 == 0 && NUM != 0){
//            SYSTEM.OUT.PRINTLN(NUM+"能被4整除");
//            IF( NUM / 4 == 1){
//                SYSTEM.OUT.PRINTLN(NUM+"能被4除尽");
//                RETURN TRUE;
//            }ELSE{
//                RETURN ISPOWEROFFOUR(NUM/4);
//            }
//        }ELSE{
//            SYSTEM.OUT.PRINTLN(NUM+"不能被4整除");
//            RETURN FALSE;
//        }
//    }
    public static boolean isPowerOfFour(int num) {
//        return (num > 0) && ((num & (num - 1)) == 0) && (num % 3 == 1);
        return (num > 0) && ((num & (num - 1)) == 0);
    }




}
