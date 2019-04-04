package singlelinkedlist;

public class IntLinkedList {
private Node head;
public IntLinkedList() { // keep int item in arguments inorder to create/  initialize list in the begining
	
	head = new Node();
	head.value = 0; // and this should be item
	head.link = null;
	
}

public boolean insertIteam(int item) {
	
//	Node n = new Node();
//	n.value= item;
//	n.link= head;
//	head = n;
//	return true;
	Node n = new Node();

	Node new_node ;
	new_node=head;
	new_node = head;
	while(new_node.link!=null) {
		new_node=new_node.link;
	}
	n.value= item;
	n.link = null;
	new_node.link=n;
	return true;
	
	
	
}

public void printList() {
	//Node z = head;
	Node z = head.link;
	while(z!=null) {
		System.out.println(z.value);
		z = z.link;
	}
}

public boolean deleteItem(int item) {
	
	
//	if(head.value==item) { even this will work...if performance is criteria go for below
//		head = head.link;
	
	if(head.link.value==item) {
		head.link = head.link.link;
		return true;
	}
	else {
		Node x = head;
		Node y = head.link;
		while(true) {
			if(y == null || y.value == item) {
				break;
			} else {
				x = y;
				y = y.link;
			}
		}
		if(y != null) {
			x.link=y.link;
			return true;
			
		} else {
			return false;
			}
	}	
}

public void sortList() {
	Node a = head.link; 
	int c =0; // for swapping ..bubble sort
	
	while(a.link!=null) {
		Node b =head.link;
		while(b.link!=null) {
			if(b.value < b.link.value) {
				c=b.value;
				b.value=b.link.value;
				b.link.value=c;
			}
			b = b.link;
		}
		a = a.link;	
	}
	
}


	class Node {
	
	private int value;
	private Node link;
	
	}

}
