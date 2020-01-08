package designPatterns.singletonDemo;

/**
 * @Author longtao
 * @Date 2020/1/8
 * @Describe 自己尝试些一个单例模式
 **/
public class SingletonTest {
//    private static SingletonTest singletonTest = new SingletonTest();
//
//    public SingletonTest() {
//    }
//
//    public SingletonTest getSingletonTest() {
//        return singletonTest;
//    }

    //写个适合I/O用的
    //个人比较喜欢使用此种方式

    private  volatile  static SingletonTest singletonTest;

    public SingletonTest(){

    }

    public static SingletonTest getInstance(){
        if(singletonTest == null){
            synchronized (SingletonTest.class){
                if(singletonTest == null ){
                    singletonTest = new  SingletonTest();
                }
            }
        }
        return singletonTest;
    }





}
