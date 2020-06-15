package FastJson.Demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Snake2Camel {
    public static void main(String[] args) {
        //读取文件
        try {
            FileReader fr = new FileReader("E:/1.IDEA/Workspace/SomeProblem/src/FastJson/Demo/SnakeFile");
            BufferedReader bf = new BufferedReader(fr);
            String str;
            // 按行读取字符串
            while ((str = bf.readLine()) != null) {
                getNewString(str);
            }
            bf.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //按行转换，并输出控制台
    }
    public static void getNewString(String str) {
        str = str.toLowerCase();
        int index = str.indexOf("_");
        while (index != -1) {
            str = str.replaceFirst(str.substring(index, index + 2), str.substring(index + 1, index + 2).toUpperCase());
            index = str.indexOf("_");
        }
        System.out.println(str);
    }


}
