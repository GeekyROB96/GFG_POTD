/*
 * Given two linked lists of size N and M, 
 * which are sorted in non-decreasing order. 
 * The task is to merge them in such a way that the resulting list is in non-increasing order.

Example 1:

Input:
N = 2, M = 2
list1 = 1->3
list2 = 2->4
Output:
4->3->2->1
Explanation:
After merging the two lists in non-increasing order, we have new lists as 4->3->2->1.

 */

 class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}
class GfG
{ //Merge 2 sorted linked list in reverse order

    Node mergeResult(Node node1, Node node2)
    {
	// Your code here	
	
	Node dummy = new Node(0);
	Node curr  = dummy;
	Node temp1 = node1;
	Node temp2 = node2;
	
	
	while(temp1!=null && temp2!=null){
	    
	    if(temp1.data<temp2.data){
	        
	        curr.next = temp1;
	        temp1 = temp1.next;
	    }
	    
	    else {
	        curr.next = temp2;
	        temp2= temp2.next;
	         }
	    curr = curr.next;
        }
        
        if(temp1!=null) curr.next = temp1;
        
        if(temp2!=null) curr.next = temp2;
        
        
        
        
        return reverse(dummy.next);
    }
    
    Node reverse(Node head){ 
        
        Node prev =null;
        Node curr = head;
        Node next;
        
        
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =next;
        }
        
        return prev;
    }
}
