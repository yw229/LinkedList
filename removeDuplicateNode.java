package Questions2;

import java.util.Hashtable;

import Questions2.LinkedListNode;;

public class removeDuplicateNode {
	public static void removeDuplicate (LinkedListNode head)
	{
		Hashtable table = new Hashtable () ;
		LinkedListNode prev =null;
		while (head !=null)
		{
			if(table.containsKey( head.data) )
			{
				prev.next =head.next ;
			}
			else
			{
				table.put(head.data, true);
				prev=head;
			}
			head=head.next;
		}
		
	}
	public static void removeD (LinkedListNode node)
	{
		LinkedListNode prev = node;
		LinkedListNode current = prev.next ;
		while (current != null)
		{
			LinkedListNode runner = node ;
			while ( runner != current)
			{
				if ( runner.data == current.data)
				{
					prev.next = current.next ;
					current = current.next;
					break;
				}
				
				runner = runner.next ;
			}
			System.out.print( " waht ") ;
			if(runner == current)
			{
				prev = current ;
				current = current.next;
			}
		}
		
	}
	/* Alternative Solution tested on LeetCode 
	* 
	/**
	 * Definition for singly-linked list.
	  * public class ListNode {
	  	 *     int val;
	  	  *     ListNode next;
	  	   *     ListNode(int x) {
	  	   	 *         val = x;
	  	   	  *         next = null;
	  	   	   *     }
	  	   	    * }
	  	   	     */
	  	   	   public class Solution {
	  	   	     	    public ListNode deleteDuplicates(ListNode head) {
	  	   	     	    	        // Start typing your Java solution below
	  	   	     	    	                // DO NOT write main() function
	  	   	     	    	                        HashSet<Integer> set = new HashSet<Integer>() ;
	  	   	     	    	                                ListNode prev  = null ;
	  	   	     	    	                                        ListNode current = head ;
	  	   	     	    	                                                while(current!=null)
	  	   	     	    	                                                        {
	  	   	     	    	                                                        	            ListNode next = current.next ;
	  	   	     	    	                                                        	                        if(!set.contains(current.val))
	  	   	     	    	                                                        	                                        {
	  	   	     	    	                                                        	                                        	                    set.add(current.val);
	  	   	     	    	                                                        	                                        	                                        prev = current ;
	  	   	     	    	                                                        	                                        	                                                            current = next ;
	  	   	     	    	                                                        	                                        }
	  	   	     	    	                                                        	                                                    else
	  	   	     	    	                                                        	                                                                    {
	  	   	     	    	                                                        	                                                                    	                    prev.next = next ;
	  	   	     	    	                                                        	                                                                    	                                        current = next ;
	  	   	     	    	                                                        	                                                                    }
	  	   	     	    	                                                        	                                                                                   //current = current.next ;
	  	   	     	    	                                                        } 
	  	   	     	    	                                                                return head ;
	  	   	     	    }
	  	   	     }
	*/
	public static void main (String[] args)
	{
		LinkedListNode node = method.randomLinkedList(10, 0, 10);
		System.out.println(node.printForward());
		//removeDuplicate (node);
		removeD (node) ;
		System.out.println(node.printForward());
	}
}
