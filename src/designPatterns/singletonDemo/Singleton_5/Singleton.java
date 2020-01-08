package designPatterns.singletonDemo.Singleton_5;

/**
 * 单例模式有6种写法
 * 这种方式能达到双检锁方式一样的功效，但实现更简单。
 * 对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。
 * 这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
 * 只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式
 */
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {
    }

    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void getMessage() {
        System.out.println("Hello Word 5 !");
    }
}
