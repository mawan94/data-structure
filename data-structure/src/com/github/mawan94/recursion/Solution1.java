/**
 * Copyright (C), 2015-2018, MaWan
 * FileName: Solution1
 * Author:   MaWan
 * Date:     2018/9/10 23:31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.github.mawan94.recursion;

/**
 * 〈功能简述〉<br>
 * 〈删除val为val的节点〉
 *
 * @author : MaWan
 * @create : 2018/9/10
 * @since 1.0.0
 */
public class Solution1 {

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }

        if (head == null)
            return head;

        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;
            } else {
                prev = prev.next;
            }
        }
        return head;

    }

}