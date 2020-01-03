package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射
 */
public class ReflectClass {
    // 创建对象
    public void reflectNewInstance() {
        try {
            Class<?> classBook = Class.forName("reflect.Book");
            Object o = classBook.newInstance();
            Book book = (Book) o;
            book.setName("AAAAA");
            book.setAuthor("龙一");
            System.out.println(book.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // 反射私有的构造方法
    public void reflectPrivateConstructor(){
        try {
            Class<?> classBook = Class.forName("reflect.Book");
            Constructor<?> constructor = classBook.getDeclaredConstructor(String.class,String.class);
            constructor.setAccessible(true);
            Object o = constructor.newInstance("BBBBB","龙二");
            Book book = (Book)o;
            System.out.println(book.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // 反射私有属性
    public static void reflectPrivateField() {
        try {
            Class<?> classBook = Class.forName("reflect.Book");
            Object objectBook = classBook.newInstance();
            Field fieldTag = classBook.getDeclaredField("TAG");
            fieldTag.setAccessible(true);
            String tag = (String) fieldTag.get(objectBook);
            System.out.println(tag);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // 反射私有方法
    public static void reflectPrivateMethod() {
        try {
            Class<?> classBook = Class.forName("reflect.Book");
            Method methodBook = classBook.getDeclaredMethod("declaredMethod",int.class);
            methodBook.setAccessible(true);
            Object objectBook = classBook.newInstance();
            String string = (String) methodBook.invoke(objectBook,0);
            System.out.println(string);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public static void main(String[] args) {
        ReflectClass c = new ReflectClass();
        c.reflectNewInstance();
        c.reflectPrivateConstructor();
        c.reflectPrivateField();
        c.reflectPrivateMethod();

    }
}
