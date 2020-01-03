package designPatterns.Singleton_6;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;
        singleton.getMessage();
    }
}
