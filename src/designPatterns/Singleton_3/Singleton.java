package designPatterns.Singleton_3;

/**
 * 单例模式有6种写法
 * 这种方式比较常用，但容易产生垃圾对象。
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }

    public void getMessage(){
        System.out.println("Hello Word 3 !");
    }
}
