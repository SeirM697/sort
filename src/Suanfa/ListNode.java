package Suanfa;

import java.util.Stack;

public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null){
            return null;
        }
        //定义一个值确定是否需要进位
        int carried = 0;
        //定义虚拟节点
        ListNode dummyHead = new ListNode(0);
        ListNode head = dummyHead;
        while (l1 != null || l2 != null){
            //可以取得上次循环的进位值
            int sum = carried;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            //取得进位值
            carried = sum / 10;
            //取模得到个位数
            sum %= 10;
            dummyHead.next = new ListNode(sum);
            dummyHead = dummyHead.next;
        }
        //判断最后一位是否还有个进位
        if (carried != 0){
            dummyHead.next = new ListNode(carried);
        }
        return head.next;
    }

    public static void toArr(ListNode l) {
        int[] arr = new int[]{};
        int i = 0;
        while (l != null) {
            arr[i++] = l.val;
            l = l.next;
        }
        for (int j : arr
                ) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next.val = 4;
        l1.next.next.val = 3;
        ListNode l2 = new ListNode(5);
        l1.next.val = 6;
        l1.next.next.val = 4;
        toArr(l1);
    }
}



