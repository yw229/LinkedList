package Questions2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;

public class FindNth {
	public static LinkedListNode nthNode (LinkedListNode head, int n )
	{
		if (head == null || n < 1) {
			return null;
		}

		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		for (int j = 0; j < n ; ++j) { // skip n-1 steps ahead
			if (p2 == null) {
				return null; // not found since list size < n
			}
			p2 = p2.next;
		}
		if (p2 == null) {
			return null;
		}
		while (p2!= null) {
			p1 = p1.next;
			p2 = p2.next;
	  	}
	  	return p1;
		
	}

	public static void  main (String[] args)
	{
		LinkedListNode node = method.randomLinkedList(10, 0, 10) ;
		System.out.println( node.printForward() ) ;
		int nth = 2;
		LinkedListNode n = nthNode(node, nth);
		try{
			FileWriter write = new FileWriter ("findn.txt") ;
			PrintWriter out = new PrintWriter (write) ;
			if (n != null) 
				out.println(nth + "th to last node is " + n.data);
			else 
				out.println("null");
			
		out.close() ;
		}
		catch (IOException e)
		{
			e.printStackTrace() ;
		}
			
		
	}
}
