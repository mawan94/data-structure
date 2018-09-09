/**
 * Copyright (C), 2015-2018, MaWan
 * FileName: V1LinkedList
 * Author:   MaWan
 * Date:     2018/9/9 18:10
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
public class V1LinkedList<E> {

    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }
    }

    private Node head;
    private int size;

    public V1LinkedList() {
        head = null;
        size = 0;
    }

    // 在链表头添加元素
    public void addFirst(E e) {
//        Node node = new Node(e);
//        node.next = head;
//        head = node;

        head = new Node(e, head);
        size++;
    }

    // 在链表的index(0-based)位置添加新的元素e
    public void add(int index, E e) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add failed. Illegal index.");
        if (index == 0)
            addFirst(e);
        else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
//            Node node = new Node(e);
//            node.next = prev.next;
//            prev.next = node;

            prev.next = new Node(e, prev.next);
        }
    }

    // 在链表末尾添加新的元素e
    public void addLast(E e) {
        add(size, e);
    }

    public static void main(String[] args) {
        V1LinkedList<Integer> integerV1LinkedList = new V1LinkedList<>();
        integerV1LinkedList.addFirst(1);
        integerV1LinkedList.addFirst(2);
        integerV1LinkedList.addFirst(3);
    }
}