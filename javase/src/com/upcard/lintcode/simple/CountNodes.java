package com.upcard.lintcode.simple;

public class CountNodes {

	public static void main(String[] args) {
		
		System.out.println(countNodes(null));
	}
	
	public static int countNodes(ListNode head) {
		if(head == null) {
			return 0;
		}
		int count = 1;
		while(head.next != null) {
			count++;
			head = head.next;
		}
		return count;
	}

}


/**
 * 链表结构
 * 当前值，下一个节点
 * @author chenliang
 *
 */
class ListNode{
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}

