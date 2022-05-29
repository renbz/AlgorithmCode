import com.alibaba.fastjson.JSON;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/5/29 10:49
 * @Description:
 */

public class JsonTest {

    public static void main(String[] args) {

        JsonTest object = new JsonTest();

        final String readJsonFile = object.readJsonFile("D:\\filter.json");
        final String readJsonData = object.readJsonFile("D:\\data.json");
        System.out.println(readJsonFile);
        System.out.println("===========================");
        System.out.println(readJsonData);
        System.out.println("+++++++++++++++++++++++++++");
        object.getPersonList(readJsonFile,"rtyumnhbcad",readJsonData);
    }

    /**
     * 读取本地json文件
     *
     * @param fileName 本地json文件的路径
     * @return
     */
    private  String readJsonFile(String fileName) {
        String jsonStr = "";
        try {
            File jsonFile = new File(fileName);
            FileReader fileReader = new FileReader(jsonFile);
            Reader reader = new InputStreamReader(new FileInputStream(jsonFile), "utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 解析json字符串，并将目标字符串根据json中数据进行替换
     * @param filterJson
     * @return
     */
    public List<ExpStrBean> getPersonList(String filterJson,String targetString,String dataJson) {

        //解析filterJson
        FileBean fileBean = JSON.parseObject(filterJson, FileBean.class);

        ArrayList<ExpStrBean> filter = fileBean.getFilter();
        System.out.println(filter);

        // 使用json中的字符串和正则表达式进行匹配替换
        for (ExpStrBean expStrBean : filter) {
            String exp = expStrBean.getExp();
            String str = expStrBean.getStr();
            targetString = targetString.replaceAll(exp,str);
        }

        //解析dataJson并返回称呼结果
        //。。。。。

        return filter;
    }


}

