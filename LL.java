package LinkedList;

import org.w3c.dom.Node;

public class LL {
  
	
	private int size;
	private Node head;
	private Node tail;
	
	public LL()
	{
		this.size =0;
	}
	
	class Node
	{
		 private int val;
		 private Node next;
		 
		 public Node(int val)
		 {
			 this.val= val;
		 }
		 
		 public Node(int val, Node next) {
			 this.val = val;
			 this.next = next;
		 }
	}
	
	public void InsertAtFirst(int val)
	{
		Node node = new Node(val);
	
	node.next = head;
	head =node;
	if(tail ==null)
		{tail = head;}
	size++;
	
	}
	
	public void InsertAtLast(int val) {
		
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
			System.out.println(size);
		
	}
	
	public void InsertMiddle(int val , int index)
	{
		if(index ==0)
		{
			InsertAtFirst(val);
			return;
		}
		
		if(index ==size)
		{
			InsertAtLast(val);
			return;
		}
		
		if(index > size)
		{
			return;
		}
		Node temp = head;
		for(int i=1;i<index;i++)
		{
			temp = temp.next;
		}
		
		
		
		Node node = new Node(val, temp.next);
		temp.next = node;
		size++;
		
	}
	
	public int DeleteFirst()
	{
		int val = head.val;
		head = head.next;
		if(tail == null)
		{
			tail = head;
		}
		size--;
		return val;
		
	}
	
	public Node get(int index)
	{
		Node temp = head;
		for(int i=1;i<index;i++)
		{
			temp = temp.next;
		}
		
		return temp;
	}
	
	public int DeleteLast()
	{
		if(size<=1)
			
		{
			return DeleteFirst();
		}
			Node secondLast = get(size-2);
		int val = tail.val;
		
		secondLast = tail;
		tail.next = null;
		
		return val;
	}
	public int Deletemiddle(int index)
	{
		if(index ==0)
			{
			return DeleteFirst();}
		
		if(index == size)
		{
			return DeleteLast();
		}
			Node prev  = get(index-1);
			int val = prev.next.val;
			
			prev.next = prev.next.next;
			
			return val;
			
			
			}
	public void value(int val1)
	{
		Node node = head;
		while(node != null)
		{
			if(node.val == val1)
			{
				System.out.println(node);
			}
			node = node.next;
		}
		
	}
		


	public void display()
	{
		Node temp = head;
	
		while(temp != null)
		{
			System.out.print(temp.val + " ->");
			temp =temp.next;
			
		}
		System.out.println("END");
	}
}
