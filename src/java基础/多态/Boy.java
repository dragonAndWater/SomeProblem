package java基础.多态;

/**
 * @Author longtao
 * @Date 2020/4/23
 * @Describe boy 对象
 **/
public class Boy extends Person {
    /**
     * @Author longtao
     * @Date 2020/4/23
     * @Describe 表示-说话
     **/
    public void speak() {
        System.out.println("Boy can speak!");
    }

    /**
     * @Author longtao
     * @Date 2020/4/23
     * @Describe 表示-吃
     **/
    public void fight() {
        System.out.println("Boy can fight!");
    }
}
