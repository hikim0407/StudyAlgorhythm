package easy;

public class Solution05 {
	
	public ListNode mergeTwoLists(ListNode A, ListNode B) {
	    // 더미 노드 생성
	    ListNode dummy = new ListNode(0);
	    ListNode current = dummy;

	    // 두 리스트를 비교하면서 병합
	    while (A != null && B != null) {
	        if (A.val < B.val) {  // 오름차순 정렬
	            current.next = new ListNode(A.val);
	            A = A.next;
	        } else {
	            current.next = new ListNode(B.val);
	            B = B.next;
	        }
	        current = current.next;
	    }

	    // 남아 있는 리스트 처리
	    if (A != null) current.next = A;
	    if (B != null) current.next = B;
	    
	    printNode(dummy.next);
	    
	    return dummy.next;
	}
	
    public static void printNode (ListNode node) {
    	while(node != null) {
    		System.out.println(node.val);
    		node = node.next;
    	}
    };
    
    public static void main (String args[]) {
		Solution05 s5 = new Solution05();
		
		//노드 생성
		ListNode A = new ListNode(5);
        ListNode A02 = new ListNode(8);
        ListNode A03 = new ListNode(20);
        //노드 연결
        A.next = A02;
        A02.next = A03;
        
        ListNode B = new ListNode(4);
        ListNode B02 = new ListNode(11);
        ListNode B03 = new ListNode(15);
        
        B.next = B02;
        B02.next = B03;
        
		System.out.println(s5.mergeTwoLists(A, B));
	};
	
	/*
	public ListNode mergeTwoLists(ListNode A, ListNode B) {
		//첫번째 노드값 지정
		ListNode firstNode;
		if(A.val < B.val) {
			firstNode = A;
		} else {
			firstNode = B;
		}
		
		ListNode newListNode = new ListNode(firstNode.val);
		
		ListNode node = null;
		if(firstNode == A) {
			A = A.next;
		} else {
			B = B.next;
		}
		
		while( !(A == null && B == null) ) {
			int value = 0;
			if(A != null && B != null) {
				if(A.val < B.val) {
					value = A.val;
					A = A.next;
				} else {
					value = B.val;
					B = B.next;
				}
			} else if(A == null) {
				value = B.val;
				B = B.next;
			} else if(B == null) {
				value = A.val;
				A = A.next;
			}
			
			if(newListNode.next == null) {
				newListNode.next = new ListNode(value);
				node = newListNode.next;
			} else {
				node.next = new ListNode(value);
				node = node.next;
			}
		}
		return newListNode;
    };
    */
}

class ListNode {	
	public int val;
	public ListNode next;
	ListNode(int x) { val = x; next = null; }
};