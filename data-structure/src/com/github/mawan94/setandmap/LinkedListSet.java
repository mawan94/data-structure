/**
 * Copyright (C), 2015-2018, MaWan
 * FileName: LinkedListSet
 * Author:   MaWan
 * Date:     2018/9/15 22:04
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.github.mawan94.setandmap;

import com.github.mawan94.linkedlist.V2LinkedList;
import com.github.mawan94.util.FileOperation;

import java.util.ArrayList;

/**
 * 〈功能简述〉<br>
 * 〈〉
 *
 * @author : MaWan
 * @create : 2018/9/15
 * @since 1.0.0
 */
public class LinkedListSet<E> implements Set<E> {

    private V2LinkedList linkedList;

    public LinkedListSet() {
        this.linkedList = new V2LinkedList();
    }

    @Override
    public void add(E e) {
        if (!linkedList.contains(e))
            linkedList.addFirst(e);
    }

    @Override
    public boolean contains(E e) {
        return linkedList.contains(e);
    }

    @Override
    public void remove(E e) {
        linkedList.removeElement(e);
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println("Pride and Prejudice");

        ArrayList<String> words1 = new ArrayList<>();
        if (FileOperation.readFile("C:\\Users\\MaWan\\gitrepository\\data-structure\\data-structure\\src\\pride-and-prejudice.txt", words1)) {
            System.out.println("Total words: " + words1.size());

            LinkedListSet<String> set1 = new LinkedListSet<>();
            for (String word : words1)
                set1.add(word);
            System.out.println("Total different words: " + set1.getSize());
        }

        System.out.println();


        System.out.println("A Tale of Two Cities");

        ArrayList<String> words2 = new ArrayList<>();
        if (FileOperation.readFile("C:\\Users\\MaWan\\gitrepository\\data-structure\\data-structure\\src\\a-tale-of-two-cities.txt", words2)) {
            System.out.println("Total words: " + words2.size());

            LinkedListSet<String> set2 = new LinkedListSet<>();
            for (String word : words2)
                set2.add(word);
            System.out.println("Total different words: " + set2.getSize());
        }
    }
}