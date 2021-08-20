package LinkedList;

/*
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * There is a cycle in a linked list if there is some node in the list 
 * that can be reached again by continuously following the next pointer.
 *  Internally, pos is used to denote the index of the node that tail's next pointer is connected to. 
 *  Note that pos is not passed as a parameter.
 *  Return true if there is a cycle in the linked list. Otherwise, return false.
 */

public class LinkedListCycle {
	ListNode head;
	
	public static boolean hasCycle(ListNode head) {
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		while(slowPtr != null && fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;

			if(slowPtr == fastPtr) {
				return true;
			}

		}    	
		return false;

	}
	 
	public static void main(String[] args) {
		LinkedListCycle llist = new LinkedListCycle();
		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(10);

		//creating a loop

		//llist.head.next.next.next.next = llist.head;

		System.out.print(hasCycle(llist.head));


	}
	 
	public void push(int new_data) {
		/* 1 & 2: Allocate the Node &
	                Put in the data*/
		ListNode new_node = new ListNode(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}


}


class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}
