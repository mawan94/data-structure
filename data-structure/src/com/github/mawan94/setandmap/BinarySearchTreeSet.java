/**
 * Copyright (C), 2015-2018, MaWan
 * FileName: BinarySearchTreeSet
 * Author:   MaWan
 * Date:     2018/9/15 20:27
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.github.mawan94.setandmap;

/**
 * 〈功能简述〉<br>
 * 〈〉
 *
 * @author : MaWan
 * @create : 2018/9/15
 * @since 1.0.0
 */
public class BinarySearchTreeSet<E extends Comparable<E>> implements Set<E> {

    private BinarySearchTree binarySearchTree;

    public BinarySearchTreeSet() {
        this.binarySearchTree = new BinarySearchTree();
    }

    @Override
    public void add(E e) {
        binarySearchTree.add(e);
    }

    @Override
    public boolean contains(E e) {
        return binarySearchTree.contains(e);
    }

    @Override
    public void remove(E e) {
        binarySearchTree.remove(e);
    }

    @Override
    public int getSize() {
        return binarySearchTree.size();
    }

    @Override
    public boolean isEmpty() {
        return binarySearchTree.isEmpty();
    }
}