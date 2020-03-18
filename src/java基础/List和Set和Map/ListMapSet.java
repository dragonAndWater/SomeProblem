package java基础.List和Set和Map;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @Author longtao
 * @Date   2020/1/14
 * @Describe list、map、set 的区别
 **/
public class
ListMapSet {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<String, String>();
        map.put("map_1","0001");
        System.out.println("map_1:"+map.get("map_1"));
        map.put("map_1","0002");
        System.out.println("map_1:"+map.get("map_1"));

        Set<String> set = new HashSet<String>();
        set.add("0003");
        set.add("0003");
        for (String s:set){
            System.out.println("set:"+s);
        }


        List<String> list = new LinkedList<String>();
        list.add("0006");
        list.add("0007");
        list.add("0007");
        for(String s:list){
            System.out.println("list:"+s);
        }


        /**
         * @Describe 关于数组和链表的区别
         **/
        String[] str = {"1","2","3","4","5","6"};//因为有下标，所以查询、修改很快
        //链表之类的，因为没有下标，所以查询不快，但是插入和删除快



    }




}
