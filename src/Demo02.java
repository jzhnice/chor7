import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-15 14:29
 */
public class Demo02 {
    public static void main(String[] args) {


        System.out.println("使用Arrays.asList将数组转换为List--------------------------------");
        String str[] = {"中文", "计算机", "ABC", "123", "qq@qq.com"};

        System.out.println("下面是数组转Set ----------------------------------");

        Set<String> strSet = new HashSet<String>(Arrays.asList(str));
        for (String string : strSet) {
            System.out.println(string);
        }
        System.out.println("下面是将Set集合转换为数组-------------");
        Object[] objArr = strSet.toArray();
        for (Object string : objArr) {
            System.out.println(string);
        }
    }
}