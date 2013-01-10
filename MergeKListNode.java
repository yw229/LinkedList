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
public class MergeKListNode {
     public ListNode mergeKLists(ArrayList<ListNode> lists)
    {
        if(lists.size() == 0) return null ;
		ListNode p = lists.get(0);
		ListNode head = new ListNode(0) ;
		head.next = p ;
		for(int i= 1 ; i < lists.size() ; i ++)
		{
			mergeTwoList(head,lists.get(i)) ;
		}
		return head.next ;
	}
	
	public void mergeTwoList(ListNode head, ListNode q)
	{
		ListNode p = head.next ;
		ListNode prev = head ;
		if(head.next==null)
		{
			head.next =q ; // only head node in the first list, we just merge two
		}
		while( p!=null && q!=null)
		{
			if(p.val < q.val)
			{
				if(p.next==null) // only one node
				{
					p.next = q ;
					break ;
				}
				else
				{
					prev = p ; 
					p = p.next ;
				}
			}
			else
			{
				// insert q before p 
				ListNode next = q.next ; // set q next temp 
                prev.next = q ; // head list prev.next point to q 
				q.next = p ; // q.next point to head list p 
                prev = q ; // head list prev set to q ;
				q = next ; // q move to next 
			}
		}
	}
}