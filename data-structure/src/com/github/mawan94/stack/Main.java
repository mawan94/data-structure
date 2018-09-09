/**
 * Copyright (C), 2015-2018, MaWan
 * FileName: Main
 * Author:   MaWan
 * Date:     2018/9/8 22:27
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.github.mawan94.stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> arrayStack = new ArrayStack<>();
        Stack<Integer> LinkedListstack = new LinkedListStack<>();

        for (int i = 0; i < 5; i++) {
            arrayStack.push(i);
            System.out.println(arrayStack);
        }

        arrayStack.pop();
        System.out.println(arrayStack);

        for(int i = 0 ; i < 5 ; i ++){
            LinkedListstack.push(i);
            System.out.println(LinkedListstack);
        }

        LinkedListstack.pop();
        System.out.println(LinkedListstack);


    }
}