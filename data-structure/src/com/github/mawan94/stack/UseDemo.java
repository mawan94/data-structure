/**
 * Copyright (C), 2015-2018, MaWan
 * FileName: UseDemo
 * Author:   MaWan
 * Date:     2018/9/8 22:31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.github.mawan94.stack;

import java.util.Stack;

/**
 * 〈功能简述〉<br>
 * 〈模仿编辑器检测括号匹配〉
 *
 * @author : MaWan
 * @create : 2018/9/8
 * @since 1.0.0
 */
public class UseDemo {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                char topEle = stack.pop();
                if (c == ')' && topEle != '(')
                    return false;
                if (c == ']' && topEle != '[')
                    return false;
                if (c == '}' && topEle != '{')
                    return false;

            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println((new UseDemo()).isValid("()[]{}"));
        System.out.println((new UseDemo()).isValid("([)]"));
    }

}