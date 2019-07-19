package tryCatch;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TryCatchDemo extends Thread {
    static String file = "F:/超网产品-代码/HelloWord/conf/testXML";//F:\超网产品-代码\HelloWord\conf

    public static void main(String[] args) {
        Thread thread = new TryCatchDemo();
        thread.start();
    }

    @Override
    public void run() {
        getFile(file);
    }

    public void getFile(String fileName) {
        String str = null;
        //此处使用try()方式，在try{}中代码执行完毕之后，会自动关闭try()中的资源。
        //BufferedReader implements AutoCloseable 能支持自动关闭资源
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "GBK"))) {
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (Exception e) {
            System.err.println("读取文件时产生了异常:"+e);
        }
    }
}
