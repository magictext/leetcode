package addTwoNumbers;

import com.sun.org.apache.bcel.internal.generic.L2D;

public class Main {
	public static void main(String[] args) {
		ListNode l1=new ListNode(1);
		//l1.next=new ListNode(9);
		//l1.next.next=new ListNode(2);
		ListNode l2=new ListNode(9);
		l2.next=new ListNode(9);
		//l2.next.next=new ListNode(5);
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		System.out.println(new Solution().addTwoNumbers(l1, l2).toString());
		//System.out.println(l2.toString());
	}
}
