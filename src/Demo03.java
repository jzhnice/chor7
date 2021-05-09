import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-15 14:32
 */
public class Demo03 {
    public static void main(String[] args) {


        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "A");
        map.put("2", "B");
        map.put("3", "C");

// 输出所有的key , keySet()方法其实返回的就是一个Set集合。
        System.out.println("通过keySet输出所有的key：" + map.keySet());

        // 把map的值转为一个List
        List<String> stringList = new LinkedList<String>(map.values());
        for (String string : stringList) {
            System.out.print(string + " ");
        }
    }
}