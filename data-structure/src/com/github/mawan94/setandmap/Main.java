/**
 * Copyright (C), 2015-2018, MaWan
 * FileName: Main
 * Author:   MaWan
 * Date:     2018/9/15 21:01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.github.mawan94.setandmap;

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
public class Main {
    public static void main(String[] args) {

        System.out.println("Pride and Prejudice");
        ArrayList<String> words1 = new ArrayList<>();
        if (FileOperation.readFile("C:\\Users\\MaWan\\gitrepository\\data-structure\\data-structure\\src\\pride-and-prejudice.txt", words1)) {
            System.out.println("Total words: " + words1.size());

            Set<String> set1 = new BinarySearchTreeSet<>();
            for (String word : words1)
                set1.add(word);
            System.out.println("Total different words: " + set1.getSize());
        }


        System.out.println("\nA Tale of Two Cities");
        ArrayList<String> words2 = new ArrayList<>();
        if (FileOperation.readFile("C:\\Users\\MaWan\\gitrepository\\data-structure\\data-structure\\src\\a-tale-of-two-cities.txt", words2)) {
            System.out.println("Total words: " + words2.size());

            Set<String> set2 = new BinarySearchTreeSet<>();
            for (String word : words2)
                set2.add(word);
            System.out.println("Total different words: " + set2.getSize());
        }
    }

}