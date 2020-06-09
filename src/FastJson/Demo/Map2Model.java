package FastJson.Demo;


public class Map2Model {

    //实现NAME_ID转化为nameId
    public static void main(String[] args) {
        String str = "NAME_ID_NO";
        String str2 = "nameIdNo";

        System.out.println("------------蛇形转驼峰------------------");
        Long startTime = System.currentTimeMillis();
        String str3 = getNewString(str);
        Long endTime = System.currentTimeMillis();
        System.out.println("使用时间：" + (endTime - startTime));
        System.out.println("最终获取到的字符串:" + str3);
        System.out.println("------------------------------------—--");

        System.out.println("------------驼峰转蛇形------------------");
        Long startTime1 = System.currentTimeMillis();
        String str4= getOrigString(str2);
        Long endTime1 = System.currentTimeMillis();
        System.out.println("使用时间：" + (endTime1 - startTime1));
        System.out.println("最终获取到的字符串:" + str4);
        System.out.println("------------------------------------—--");
    }

    //蛇形转驼峰:name_id_no转化为nameIdNo
    public static String getNewString(String str) {
        str = str.toLowerCase();
        int index = str.indexOf("_");
        while (index != -1) {
            str = str.replaceFirst(str.substring(index, index + 2), str.substring(index + 1, index + 2).toUpperCase());
            index = str.indexOf("_");
        }
        return str;
    }

    //驼峰转蛇形:将nameIdNo转化为name_id_no
    public static String getOrigString(String str) {
        StringBuilder sb = new StringBuilder(str);

        int temp = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                sb.insert(i + temp, "_");
                temp += 1;
            }
        }
        return sb.toString().toUpperCase();
    }

}
