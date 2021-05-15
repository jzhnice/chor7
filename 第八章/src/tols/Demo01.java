package tols;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.String;
import java.util.LinkedList;
import java.util.List;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-08 11:25
 */
public class Demo01 {
    public static void main(String[] args) {
        String str[] = {"中文，", "计算机","ABC", "123", "qq@qq.com ", " "};
        List<String> List = Arrays.asList(str);
        //   Arrays.asList()将数组转换成列表
        System.out.println(List);

        // 将数组转换为数组列表（链式列表）
        ArrayList<String> alist = new ArrayList<>(Arrays.asList(str));
        LinkedList<String> llist = new LinkedList<>(Arrays.asList(str));
        alist.remove("ABC");
        llist.add("123467");
        System.out.println(alist);
        System.out.println(llist);


        // 3将列表转换为数组
        Object[] str2 = alist.toArray();
        for (Object o : str2) {
            System.out.print(o + "");
        }
        System.out.println();
        Object[] str3 = llist.toArray();
        for (Object o : str3) {
            System.out.print(o + "");
        }
    }
}
