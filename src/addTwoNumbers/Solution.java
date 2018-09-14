package addTwoNumbers;

public class Solution {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode k2 = l2;
		while (l1 != null) {
			l2.val += l1.val;
			// if (l2.val > 9) {
			// l2.val = l2.val % 10;
			// if (l2.next == null) {
			// l2.next = new ListNode(1);
			// } else {
			// l2.next.val++;
			// }
		// }
			if (l2.next == null && l1.next != null) {
				l2.next = new ListNode(0);
				l2 = l2.next;
			} else {
				l2 = l2.next;
			}
			l1 = l1.next;
		}
		l2 = k2;
		while (l2 != null) {
			if (l2.val > 9) {
				l2.val = l2.val % 10;
				if (l2.next == null) {
					l2.next = new ListNode(1);
				} else {
					l2.next.val++;
				}
			}
			l2 = l2.next;
		}

		return k2;

		// public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// ListNode k2=l2;
		// while(l1!=null){
		// if(l2==null)
		// l2=l1;
		// else {
		// l2.val+=l1.val;
		// }
		// if(l2.val>9){
		// l2.val=l2.val%10;
		// if(l2.next==null){
		// l2.next=new ListNode(1);
		// }
		// else {
		// l2.next.val++;
		// }
		// }
		//
		// l1=l1.next;
		// l2=l2.next;
		// }
		// return k2;
		// }

		// if (l1 == null || l2 == null) {
		// if (l1 == null) {
		// l1 = new ListNode(0);
		// }
		// if (l2 == null) {
		// l2 = new ListNode(0);
		// }
		// }
		// l2.val += l1.val;
		// if (l2.val > 9) {
		// l2.val = l2.val % 10;
		// if (l1.next != null) {
		// l1.next.val++;
		// } else {
		// l1.next = new ListNode(1);
		// }
		// }
		// if (l1.next == null && l2.next == null) {
		// return l2;
		// }else {
		// return addTwoNumbers(l1.next, l2.next);
		// }

	}
}
