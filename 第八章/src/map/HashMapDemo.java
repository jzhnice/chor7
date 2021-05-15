package map;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-08 10:06
 */
public class HashMapDemo {
    public static void main(String[] args) {
      HashMap<String,String> map = new HashMap<>();
      map.put("henan","河南");  //   entry 实例
      map.put("hebei","河北");
      map.put("hubei","湖北");
      map.put("hubei","湖北1");
      //键重复 会覆盖掉原有的指
        map.put("null","空1");
        map.put(null,"空2");
        map.put(null,null);
// 20行的代码被21行覆盖掉
        System.out.println(map);
        for(Map.Entry<String,String> m:map.entrySet()) {
            System.out.println(m);
        }
        for (String k:map.keySet()){
            System.out.println(k+"=" + map.get(k));
        }


        for(String v:map.values()){
            System.out.println(v);
        }
//        DEFAULT_INITIAL_CAPACITY = 1 << 4;   默认的初始化容量 = 16 必须是2的整次幂
//        static final int MAXIMUM_CAPACITY = 1 << 30; 默认的最大    = 2的30次方
//        static final float DEFAULT_LOAD_FACTOR = 0.75f;    当体内容量到达全部的0.75的时候直接扩容
//        static final int TREEIFY_THRESHOLD = 8;  当长度为8的时候树化
//        static final int UNTREEIFY_THRESHOLD = 6;  当长度为6的时候 退化为数组


    }
}
