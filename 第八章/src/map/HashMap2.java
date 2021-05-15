package map;

import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-15 13:36
 */
public class HashMap2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("CCTV","中央电视台");
        map.put("BTV","北京电视台");
        map.put("CHNTV","河南电视台");
        map.put("TVB","翡翠台");

        // 显示【CCTV】对应的中文名字
        String tvValue = (String)map.get("CCTV");

        // 显示集合中元素个数
        System.out.println("元素共有" + map.size()+"个");

        //判断是否包含键【CCTV]
        System.out.println("map中包含有CCTV的键吗？"+map.containsKey("CCTV"));
        // 分别显示键集、值集和键值对
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map);

        // 清空map中的数据
        map.clear();
        if(map.isEmpty()){
            System.out.println("已清空map中的数据");
        }
    }
}
