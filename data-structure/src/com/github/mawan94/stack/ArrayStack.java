/**
 * Copyright (C), 2015-2018, MaWan
 * FileName: ArrayStack
 * Author:   MaWan
 * Date:     2018/9/8 22:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.github.mawan94.stack;

/**
 * 〈功能简述〉<br>
 * 〈底层基于数组的栈结构〉
 *
 * @author : MaWan
 * @create : 2018/9/8
 * @since 1.0.0
 */
public class ArrayStack<E> implements Stack<E> {

    private Array<E> array;

    public ArrayStack(int capacity) {
        this.array = new Array<>(capacity);
    }

    public ArrayStack() {
        this.array = new Array<>();
    }

    @Override
    public int getSize() {
        return this.array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return this.array.isEmpty();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public void push(E e) {
        this.array.addLast(e);
    }

    @Override
    public E pop() {
        return this.array.removeLast();
    }

    @Override
    public E peek() {
        return this.array.getLast();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Stack: ");
        stringBuilder.append("[");
        int size = this.array.getSize();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(this.array.get(i));
            if (i != size - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("] HERE (RIGHT) IS STACK TOP");
        return stringBuilder.toString();
    }
}