package com.github.mawan94.binarysearchtree;

public class BinarySearchTree<E extends Comparable<E>> {

    private class Node {
        public E e;
        public Node left, righr;

        public Node(E e) {
            this.e = e;
            left = null;
            righr = null;
        }
    }

    private Node root;
    private int size;

    public BinarySearchTree() {
        root = null;
        size = 0;
    }

    public int sie() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // 向二分搜索树添加元素e
    public void add(E e) {
        if (root == null) {
            root = new Node(e);
            size++;
        } else {
            add(root, e);
        }
    }

    // 向以node为根的二分搜索树中插入元素e，递归算法
    private Node add(Node node, E e) {
        // 相同值忽略处理
//        if (e.equals(node.e)) {
//            return;
//        } else if (e.compareTo(node.e) < 0 && node.left == null) {
//            node.left = new Node(e);
//            size++;
//            return;
//        } else if (e.compareTo(node.e) > 0 && node.righr == null) {
//            node.righr = new Node(e);
//            size++;
//            return;
//        }
//
//        if (e.compareTo(node.e) < 0)
//            add(node.left, e);
//        else
//            add(node.righr, e);

        if (node == null) {
            size++;
            return new Node(e);
        }
        if (e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            node.righr = add(node.righr, e);
        }
        return node;
    }

    // 看二分搜索树中是否包含元素e
    public boolean contains(E e) {
        return contains(root, e);
    }

    // 看以node为根的二分搜索树中是否包含元素e, 递归算法
    private boolean contains(Node node, E e) {

        if (node == null)
            return false;

        if (e.compareTo(node.e) == 0)
            return true;

        else if (e.compareTo(node.e) < 0)
            return contains(node.left, e);

        else
            return contains(node.righr, e);

    }
}
