package LinkedList;

 public class LLReverse{


 public static Node head;

static class Node
{
public int val;
public Node next;

Node(int val)
{
this.val = val;

}

}

public Node reverse(Node node)
{

   Node prev = null;
Node current = head;
while(current != null)
{

Node next = current.next;
current.next= prev;
prev = current;
current = next;
    
}
node = prev;
return node;
}

void printList(Node head) {
Node temp= head;
    { 
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;}
        }
    }
public static void main(String[] args)
  {
       
    LLReverse list = new LLReverse();
    list.head = new Node(85);
    list.head.next = new Node(15);
    list.head.next.next = new Node(4);
    list.head.next.next.next = new Node(20);
    list.printList(head);
    head = list.reverse(head);
    System.out.println("");
list.printList(head);
     
    }
  }
 


