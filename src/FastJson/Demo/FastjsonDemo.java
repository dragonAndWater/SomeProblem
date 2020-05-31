package FastJson.Demo;

import FastJson.model.Toy;
import FastJson.model.UserInfo;
import com.alibaba.fastjson.JSON;

import java.util.List;

public class FastjsonDemo {

    public static void main(String[] args) {
        String str = " {\n" +
                "    \"job_name\": \"程序员\",\n" +
                "    \"name\": \"long_tao\",\n" +
                "    \"phone_no\": \"15199999999\",\n" +
                "    \"toy_list\": [\n" +
                "      {\n" +
                "        \"toy_name\": \"小汽车\",\n" +
                "        \"toy_price\": \"15.00\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"toy_name\": \"变形金刚\",\n" +
                "        \"toy_price\": \"35.50\"\n" +
                "      }\n" +
                "    ]\n" +
                "}";
        JSON json = JSON.parseObject(str);
        System.out.println("json = "+json);

        UserInfo userInfo = JSON.toJavaObject(json,UserInfo.class);
        System.out.println("userInfo.getJobName() = "+userInfo.getJobName());

        List<Toy> list = userInfo.getToyList();
        for(Toy t : list){
            System.out.println("t.getToyName()="+t.getToyName());
        }
    }


}
