package java基础.基础类型范围;
/**
 * @Author longtao
 * @Date   2020/1/14
 * @Describe java 有8中基础数据类型  byte\short\long\float\double\int\char\boolean
 **/
public class DataTypeDemo {
    public static void main(String[] args) {

        System.out.println("byte 的范围：最小值="+Byte.MIN_VALUE+",最大值="+Byte.MAX_VALUE);
        System.out.println("short 的范围：最小值="+Short.MIN_VALUE+",最大值="+Short.MAX_VALUE);
        System.out.println("int 的范围：最小值="+Integer.MIN_VALUE+",最大值="+Integer.MAX_VALUE);
        System.out.println("long 的范围：最小值="+Long.MIN_VALUE+",最大值="+Long.MAX_VALUE);
        System.out.println("float 的范围：最小值="+Float.MIN_VALUE+",最大值="+Float.MAX_VALUE);
        System.out.println("double 的范围：最小值="+Double.MIN_VALUE+",最大值="+Double.MAX_VALUE);
        System.out.println("char 的范围：最小值="+Character.MIN_VALUE+",最大值="+Character.MAX_VALUE);
        System.out.println("boolean 的范围：最小值="+Boolean.FALSE+",最大值="+Boolean.TRUE);

    }
}
