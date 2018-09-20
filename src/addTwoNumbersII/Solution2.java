package addTwoNumbersII;

import java.util.Stack;

class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        while (l1!=null) {
			s1.push(l1.val);
			l1=l1.next;
		}
        while (l2!=null) {
			s2.push(l2.val);
			l2=l2.next;
		}
        //System.out.println(res);
        ListNode l3 = null;
        ListNode l4=null;
        //7742
        int x,y,z,flag=0;
        while(!(s1.empty()&&s2.empty())){
        	//System.out.print(res%10);
        	try {
				x=s1.pop();
			} catch (Exception e) {
				x=0;
			}
        	try {
				y=s2.pop();
			} catch (Exception e) {
				y=0;
			}
        	
        	z=x+y+flag;
        	
        	if(z>9){
        		z=z%10;
        		flag=1;
        	}
        	else {
				flag=0;
			}
        	System.out.println(x+"\t"+y+"\t"+flag+"\t"+z);
        	l4=new ListNode(z);
        	l4.next=l3;
        	l3=l4;
        }
        if(flag==1){
        	l4=new ListNode(1);
        	l4.next=l3;
        	l3=l4;
        }
//        l4=new ListNode((int)res);
//    	l4.next=l3;
    	return l4;
    }
    public static void main(String[] args) {
    	ListNode l1=new ListNode(5);
//		l1.next=new ListNode(9);
//		l1.next.next=new ListNode(9);
//		l1.next.next.next=new ListNode(9);
//		l1.next.next.next.next=new ListNode(9);
//		l1.next.next.next.next.next=new ListNode(9);
//		l1.next.next.next.next.next.next=new ListNode(9);
//		l1.next.next.next.next.next.next.next=new ListNode(9);
//		l1.next.next.next.next.next.next.next.next=new ListNode(9);
//		l1.next.next.next.next.next.next.next.next.next=new ListNode(9);
		ListNode l2=new ListNode(5);
//		l2.next=new ListNode(9);
//		l2.next.next=new ListNode(5);
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		System.out.println(new Solution2().addTwoNumbers(l1, l2).toString());
		//System.out.println(l2.toString());
	}
}