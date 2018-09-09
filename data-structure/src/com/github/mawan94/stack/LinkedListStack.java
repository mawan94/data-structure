/**
 * Copyright (C), 2015-2018, MaWan
 * FileName: LinkedListStack
 * Author:   MaWan
 * Date:     2018/9/9 19:17
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.github.mawan94.stack;

import com.github.mawan94.linkedlist.V2LinkedList;

/**
 * 〈功能简述〉<br> 
 * 〈〉
 *
 * @author : MaWan
 * @create : 2018/9/9
 * @since 1.0.0
 */
public class LinkedListStack<E> implements Stack<E> {

    private V2LinkedList<E> list;

    public LinkedListStack(){
        list = new V2LinkedList<>();
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack: HERE (LEFT) IS STACK TOP ");
        res.append(list);
        return res.toString();
    }
}