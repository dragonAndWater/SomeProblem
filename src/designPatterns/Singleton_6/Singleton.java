package designPatterns.Singleton_6;

/**
 * 这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。
 * 它更简洁，自动支持序列化机制，绝对防止多次实例化。
 * 如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式
 */
public enum Singleton {
    INSTANCE;

    public void getMessage() {
        System.out.println("Hello Word 6 !");
    }
}
