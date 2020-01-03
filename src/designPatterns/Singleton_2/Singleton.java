package designPatterns.Singleton_2;

/**
 * 单例模式的第二种方式
 * 懒汉式，线程安全
 */
public class Singleton {
    private static Singleton singleton;
    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
    public void getMessage(){
        System.out.println("Hello Word 2 !");
    }
}
