package addTwoNumbersII;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long x=0,y=0;
        int z;
        while (l1!=null) {
			x=x*10+l1.val;
			l1=l1.next;
		}
        while (l2!=null) {
			y=y*10+l2.val;
			l2=l2.next;
		}
        long res=x+y;
        //System.out.println(res);
        ListNode l3 = null;
        ListNode l4;
        //7742
        while(res/10L!=0){
        	//System.out.print(res%10);
        	z=(int) (res%(10L));
        	res=res/10;
        	
        	l4=new ListNode(z);
        	l4.next=l3;
        	l3=l4;
        }
        l4=new ListNode((int)res);
    	l4.next=l3;
    	return l4;
    }
    public static void main(String[] args) {
    	ListNode l1=new ListNode(3);
		l1.next=new ListNode(9);
		l1.next.next=new ListNode(9);
		l1.next.next.next=new ListNode(9);
		l1.next.next.next.next=new ListNode(9);
		l1.next.next.next.next.next=new ListNode(9);
		l1.next.next.next.next.next.next=new ListNode(9);
		l1.next.next.next.next.next.next.next=new ListNode(9);
		l1.next.next.next.next.next.next.next.next=new ListNode(9);
		l1.next.next.next.next.next.next.next.next.next=new ListNode(9);
		ListNode l2=new ListNode(7);
//		l2.next=new ListNode(9);
//		l2.next.next=new ListNode(5);
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		System.out.println(new Solution().addTwoNumbers(l1, l2).toString());
		//System.out.println(l2.toString());
	}
}