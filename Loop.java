package Questions2;

public class Loop
{
	public LinkedListNode head ;
    public LinkedListNode  n1  ;
    public LinkedListNode  n2 ;
    public Loop(LinkedListNode head)
    {
    	this.head = head ;
        n1 = head ;
        n2 = head ;
    }
    
    public LinkedListNode detectLoop()
    {
        while(n2.next!=null)
        {
            n1=n1.next ;
            n2=n2.next.next.next; 
            if(n1==n2) // find meeting point
                break ;
        }
        if(n2.next ==null)
            return null ; // no loop in the linkedlist
        /*
         * move n1 to head, keep n2 at meeting point ,
         * each are k nodes from loop start , if they move at the same pace, they must meet at loop start
         *  */
        /*n1 = head ;*/
        while(n1!=n2)
        {
            n1= n1.next ;
            n2= n2.next ;
        } 
        return n2 ; //n2 points to the start
    }
    public static void main(String[] args)
    {
    	LinkedListNode[] nodes = new LinkedListNode[10] ;
    	for(int i = 0 ; i < 10 ; i ++)
    	{
    		nodes[i] = new LinkedListNode( i>0? nodes[i-1] : null,null, i) ;
    		System.out.print(" " +nodes[i].data) ;
    	}
    	System.out.println() ;
    	nodes[9].next = nodes[3] ;
    	Loop lp = new Loop(nodes[0]) ;
    	LinkedListNode n = lp.detectLoop() ;
    	System.out.println( n.data) ;
    }
}