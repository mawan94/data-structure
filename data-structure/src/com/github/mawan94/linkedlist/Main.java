/**
 * Copyright (C), 2015-2018, MaWan
 * FileName: Main
 * Author:   MaWan
 * Date:     2018/9/9 19:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.github.mawan94.linkedlist;

/**
 * 〈功能简述〉<br>
 * 〈〉
 *
 * @author : MaWan
 * @create : 2018/9/9
 * @since 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        V2LinkedList<Integer> linkedList = new V2LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList.addFirst(i);
            System.out.println(linkedList);
        }

        linkedList.add(2, 666);
        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);
    }

}