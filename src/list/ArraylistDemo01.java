package list;

import java.util.ArrayList;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-06 17:11
 */
//数组扩容的代码;
/*private Object[] grow(int minCapacity) {
        int oldCapacity = elementData.length;
        if (oldCapacity > 0 || elementData != DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
        int newCapacity = ArraysSupport.newLength(oldCapacity,
        minCapacity - oldCapacity, *//* minimum growth *//*
        oldCapacity >> 1           *//* preferred growth *//*);
        return elementData = Arrays.copyOf(elementData, newCapacity);
        } else {
        return elementData = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
        }
        }*/




//查询多用这个
public class ArraylistDemo01 {
    public static void main(String[] args) {

        String [] array01 = new String[10];
        array01[0] = "zhangsan";
        array01[2] = "wangwu";
        array01[1] = "lisi";


        ArrayList<Object>  list01 = new ArrayList<>(100);  //  数组的方式实现的
        //  数组列表  初始值为10
        //initialCapacoty  初始值
       // private static final int DEFAULT_CAPACITY = 10;
//        DEFAULTCAPACITY_EMPTY_ELEMENTDATA 默认的容量

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
        ArrayList<Object> list02=new ArrayList<>();
        list02.add(111);
        list02.add(222);
        list01.addAll( 1,list02);
        System.out.println(list01);



    }
}
