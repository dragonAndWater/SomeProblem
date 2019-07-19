package simpleDateFormat;

import javax.jnlp.ExtendedService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 关于SimpleDateFromat线程不安全
 */
public class SimpleDateFormatDemo {

    public static void main(String[] args) {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-DD-mm HH:mm:ss");
    for(int i = 1;i <= 10;i++){
        Thread t = new Thread(new ThreadDemo(sdf));
        t.start();
    }
    System.out.println("end");
    }
}

class ThreadDemo implements Runnable{
    private SimpleDateFormat sdf;
    ThreadDemo(SimpleDateFormat sdf){
        this.sdf = sdf;
    }
    @Override
    public void run() {
        String str =sdf.format(new Date());
        try {
            Date pareDate = sdf.parse(str);
            String str2 = sdf.format(pareDate);
            Boolean flag = str2.equals(str);
//            if(!flag) {
                System.out.println(flag);
//            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}