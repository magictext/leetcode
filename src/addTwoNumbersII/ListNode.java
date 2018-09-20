package addTwoNumbersII;

public class ListNode {

	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	@Override
	public String toString() {
		if (next!=null) {
			return "ListNode [val=" + val + ", next=" + next.toString() + "]";
		}
		else {
			return "ListNode [val=" + val + ", next=" + "null"+ "]";
		}
	}

}
