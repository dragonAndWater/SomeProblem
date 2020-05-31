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
        SerializeConfig config = SerializeConfig.getGlobalInstance();
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
        UserInfo u = (UserInfo) JSON.toJavaObject(JSON.parseObject(xwRequest.getBody().toString()), UserInfo.class);
        System.out.println("u :" + u.toString());

        String userStr = JSON.toJSONString(u);
        System.out.println("userStr = " + userStr);

        Object o = (Object) xwRequest.getBody();
        String oStr = JSON.toJSONString(o);
        System.out.println("oStr    = " + oStr);

        //不能实现JsonObject 转 javaBean
        UserInfo u1 = (UserInfo) o;

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
        return "{\"body\":{\"job_name\":\"程序员\",\"name\":\"long_tao\",\"phone_no\":\"15199999999\",\"toy_list\":[{\"toy_name\":\"小汽车\",\"toy_price\":\"15.00\"},{\"toy_name\":\"变形金刚\",\"toy_price\":\"35.50\"}]},\"head\":{\"ret_code\":\"000000\",\"ret_msg\":\"交易成功\",\"status\":\"success\"}}";
    }

}
