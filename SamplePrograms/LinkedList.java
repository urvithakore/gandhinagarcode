package apex.java.assign15.SamplePrograms;

import java.util.Scanner;
// Implement a linked list

public class LinkedList {
	
	
	static Node head=null;
	
	static class Node
	{
		int value;
		Node nextNode;
		Node(int d)
		{
			value=d;
			nextNode=null;
		}
	}
	
	public void printList(Node node) {
		while (node != null) {
			System.out.print(node.value + " ");
			node = node.nextNode;
		}
		System.out.println();
	}
	
	public void AddNodeEnd(int value)
	{
		if(head==null)
		{
			head = new Node(value);
		}
		else
		{
			Node node=head;
			while(node.nextNode!=null) {
				node=node.nextNode;
			}
			Node temp = new Node(value);
			node.nextNode=temp;
		}	
	}
	
	public void AddNodeBegining(int value)
	{
		if(head==null)
		{
			head = new Node(value);
		}
		else
		{
			Node temp = new Node(value);
			temp.nextNode=head;
			head = temp;
		}	
	}
	
	public void AddNodeAfter(int value, int after)
	{
		if(head==null)
		{
			head = new Node(value);
		}
		else
		{
			Node node = head;
			while(node.nextNode != null && node.value != after)
			{	
				node = node.nextNode;
			}
			if(node.value == after)
			{	
				Node temp = new Node(value);
				temp.nextNode = node.nextNode;
				node.nextNode=temp;
			}
			else System.out.println("Couldn't find after value :"+ after);
		}	
	}
	
	public void RemoveNode(int value)
	{
		if(head==null)
		{
			return;
		}
		else
		{
			Node node,previous;
			node =previous= head;
			while(node.nextNode != null && node.value != value)
			{	
				previous = node;
				node = node.nextNode;
			}
			if(node.value == value)
			{	
				if(node==head) {head=node.nextNode;}
				else
				{	
					Node temp =node.nextNode;
					previous.nextNode=temp;
				}
			}
			else System.out.println("Couldn't find value :"+ value );
		}	
	}
	
	public void Reverse()
	{
		if(head == null) return;
		else
		{
			Node node = head;
			Node previous = node;
			Node current = node.nextNode;
			Node next = null;
			previous.nextNode=null;
			while(current!=null)
			{
				
				next = current.nextNode;
				current.nextNode=previous;
				previous= current;
				current = next;
			}

			head = previous;
		}
	}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList link = new LinkedList();
		Scanner in = new Scanner(System.in);	
		System.out.print("Input no. of elements: ");
		int m = in.nextInt(); 
		if(in.hasNextInt())
		{
			for(int i=0;i<m; i++)
			{
				link.AddNodeEnd(in.nextInt());				
			}
			
		}
		link.printList(head);
		link.AddNodeBegining(100);
		link.AddNodeAfter(20, 100);
		link.AddNodeEnd(50);
		link.printList(head);
		link.RemoveNode(20);
		link.Reverse();
		link.printList(head);

	}

}