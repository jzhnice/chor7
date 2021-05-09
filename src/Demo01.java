import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-06 16:49
 */
/*list*/
public class Demo01 {
    public static void main(String[] args) {


        /*
         * 数组转List，但是这里要注意，Arrays.asList方法转出来的虽然也叫ArrayList，
         * 但不是java.util.ArrayList，而是Arrays中的一个内部类ArrayList。两者之间并不相等。
         * 内部类ArrayList没有实现remove、add等方法，使用的话会报错。
         */
        System.out.println("使用Arrays.asList将数组转换为List--------------------------------");
        String str[] = {"中文", "计算机", "ABC", "123", "qq@qq.com"};

        List<String> strList = Arrays.asList(str);

        for (String x : strList) {
            System.out.println(x);
        }

        System.out.println("使用ArrayList构造器方式再由Arrays.asList将数组转换为List----------");
        // 使用下面的代码的写法就不会有问题了。
        ArrayList<String> stringsList = new ArrayList<String>(Arrays.asList(str));
        // 使用remove方法
        stringsList.remove(3);

        for (String string : stringsList) {
            System.out.println(string);
        }

        System.out.println("使用List.toArray方法将一个List转换为数组(默认为Object数组)----------");
        Object[] strArr = stringsList.toArray();
        for (Object object : strArr) {
            System.out.println(object.toString());
        }


    }
}