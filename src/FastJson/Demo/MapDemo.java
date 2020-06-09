package FastJson.Demo;

import FastJson.model.HeadModel;
import FastJson.model.Toy;
import FastJson.model.UserInfo;
import FastJson.model.XwRequest;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.serializer.SerializeConfig;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        XwRequest request = setRequest();
        System.out.println("request 对象：" + request);

        //将bean转为Json
        String json = JSON.toJSONString(request);
        System.out.println("json : " + json);

        //将bean转为Map   bean-->json-->map
        Map<String, Object> map = JSON.parseObject(json, Map.class);
        System.out.println("map : " + map);

        //bean转为蛇形json
        //实际开发中获取SerializeConfig的单例
//        SerializeConfig config = SerializeConfig.getGlobalInstance();
        SerializeConfig config = new SerializeConfig();
        config.propertyNamingStrategy = PropertyNamingStrategy.SnakeCase;
        String SXjson = JSON.toJSONString(request, config);
        System.out.println("蛇形json : " + SXjson);

        //str转为json
        JSON json2 = JSON.parseObject(json);
        System.out.println("json2 = " + json2);

        //json转为bean
        XwRequest xwRequest = JSON.toJavaObject(JSON.parseObject(getStr()), XwRequest.class);
//        UserInfo o = (UserInfo) xwRequest.getBody();
//        System.out.println("o :"+o);
        UserInfo u =  JSON.toJavaObject(JSON.parseObject(xwRequest.getBody().toString()), UserInfo.class);
        System.out.println("u :" + u.toString());

        String userStr = JSON.toJSONString(u);
        System.out.println("userStr = " + userStr);

        Object o = (Object) xwRequest.getBody();
        String oStr = JSON.toJSONString(o);
        System.out.println("oStr    = " + oStr);

        //不能实现JsonObject 转 javaBean
        UserInfo u1 = (UserInfo) xwRequest.getBody();

    }

    public static XwRequest setRequest() {
        XwRequest requset = new XwRequest();
        HeadModel headModel = new HeadModel();
        headModel.setRetCode("000000");
        headModel.setRetMsg("交易成功");
        headModel.setStatus("success");
        requset.setHead(headModel);


        UserInfo userModel = new UserInfo();
        userModel.setName("long_tao");
        userModel.setPhoneNo("15199999999");
        userModel.setJobName("程序员");

        List<Toy> toyList = new LinkedList<Toy>();
        Toy toy1 = new Toy();
        toy1.setToyName("小汽车");
        toy1.setToyPrice("15.00");
        toyList.add(toy1);

        Toy toy2 = new Toy();
        toy2.setToyName("变形金刚");
        toy2.setToyPrice("35.50");
        toyList.add(toy2);

        userModel.setToyList(toyList);
        requset.setBody(userModel);

        return requset;
    }


    public static String getStr() {
        return "{\n" +
                "  \"BODY\": {\n" +
                "    \"JOB_NAME\": \"程序员\",\n" +
                "    \"NAME\": \"long_tao\",\n" +
                "    \"PHONE_NO\": \"15199999999\",\n" +
                "    \"TOY_LIST\": [\n" +
                "      {\n" +
                "        \"TOY_NAME\": \"小汽车\",\n" +
                "        \"TOY_PRICE\": \"15.00\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"TOY_NAME\": \"变形金刚\",\n" +
                "        \"TOY_PRICE\": \"35.50\"\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  \"HEAD\": {\n" +
                "    \"RET_CODE\": \"000000\",\n" +
                "    \"RET_MSG\": \"交易成功\",\n" +
                "    \"STATUS\": \"success\"\n" +
                "  }\n" +
                "}\n";

    }

}
