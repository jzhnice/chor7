package list;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-06 18:16
 */

//不需要查询用这个  增删改查用这个
public class LinkedListDemo02 {
    public static void main(String[] args) {




        LinkedList<Object> list01=new LinkedList<>(); // 链表的方式实现的
        System.out.println(list01.size());
        //  数组列表  初始值为10
        //1:增加的操作
        list01.add("zhangsan");
        list01.add("lisi");
        list01.add("wangwu");
        System.out.println(list01);
        //2:删除
        list01.remove(1);
        // remove  移除
        System.out.println(list01);
        // 3:修改


        String v = (String) list01.set(1,"xiaowu");     //返回初始值
        System.out.println(v);
        System.out.println(list01);


        //4:查询
        for(Object L:list01){
            System.out.println(L);
        }

        // 5:求长度

        System.out.println(list01.size());


        // 6 清空
        /*list01.clear();
        System.out.println(list01.size());
        System.out.println(list01.isEmpty());// 判断是否为空*/

//        list01.subList() // 截取

        //7:  addAll ()
        LinkedList<Object> list02=new LinkedList<>();
        list02.add(111);
        list02.add(222);
        list01.addAll( 1,list02);
        System.out.println(list01);

        //将数据添加到末尾
        list01.addLast(111);
        //将数据添加到开头
        list01.addFirst(999);
        System.out.println(list01);


    }

}
