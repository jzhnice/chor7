package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-08 11:03
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("henan", "河南");  //   entry 实例
        map.put("hebei", "河北");
        map.put("hubei", "湖北");
        map.put("hubei", "湖北1");
        //键重复 会覆盖掉原有的指
        map.put("null", "空1");
        map.put(null, "空2");
        map.put(null, null);
// 20行的代码被21行覆盖掉
        System.out.println(map);
        for (Map.Entry<String, String> m : map.entrySet()) {
            System.out.println(m);
        }
        for (String k : map.keySet()) {
            System.out.println(k + "=" + map.get(k));
        }


        for (String v : map.values()) {
            System.out.println(v);
        }
    }
}
