package LinkedList;

import org.w3c.dom.Node;

public class insert {

	 private Node head;
	private int size;
	public insert()
	{
		size = 0;
	}
	
	public class Node{
		
		private  String val;
	private Node next;
		
		public Node(String val)
		     {
		 	this.val = val;
		 	this.next = null;
		 
			
	         }}
	
	public void InsertLast1(String val)
	{
			
			/*if(tail == null)
			{
				InsertAtFirst(val);
				return;
			}*/
			
			
			Node temp = head;
			Node node = new Node(val);
			if(head==null)
			{ head =node;
			return;
				
			}
			while(temp.next != null) {
				temp =temp.next;}
			
			temp.next=node;
			size++;
	}
	public void insertfirst1(String val)

	{
		Node node = new Node(val);
		if(head == null)
		{
			head= node;
			return;
		}
		
		node.next= head;
	     head=node;
		//size++;
	}
	
	public void Display()
	{
		if(head == null)
		{
			System.out.println("IS empty");
			return;
			
		}
		Node temp = head;
		while(temp !=null)
		{
			System.out.print(temp.val+"->");
			temp =temp.next;	
		}
	
		System.out.println("END");
	}
	
	public void deletefirst()
	{
		if(head == null)
		{
			System.out.println("LL is empty");
			return;
		}
		
		head = head.next;
	
	}
	
	public void deletelast()
	{
		if(head == null)
		{
			System.out.println("LL is empty");
			return;
		}
		if(head.next ==null)
		{
			head= head.next;
		}
		
		Node secondlast = head;
		Node last = head.next;
		while(last.next != null)
		{secondlast= secondlast.next;
		last= last.next;
		}
		secondlast.next = null;
	}
	public static void main(String[] args)
	{
	insert l = new insert();
	l.insertfirst1("a");
	l.insertfirst1("t");
	l.Display();
	l.InsertLast1("RK");
	l.Display();
	l.deletefirst();
	l.deletelast();
	l.Display();
	
	
	}
	
}
