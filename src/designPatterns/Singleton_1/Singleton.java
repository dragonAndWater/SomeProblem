package designPatterns.Singleton_1;

/**
 * 单例模式有6种写法
 * 懒汉式，线程不安全
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
            if (singleton == null) {
                singleton = new Singleton();
            }
        return singleton;
    }

    public void getMessage(){
        System.out.println("Hello Word 1 !");
    }
}
