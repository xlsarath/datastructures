package singlelinkedlist;


public class PersonLinkedList {
		
		
	private Node head;
	public PersonLinkedList(Person person) { // keep int item in arguments inorder to create/  initialize list in the begining
		
		head = new Node();
		head.person = person; // and this should be item
		head.link = null;
		
	}

	public boolean insertIteam(Person person) {
		
//		Node n = new Node();
//		n.value= item;
//		n.link= head;
//		head = n;
//		return true;
		Node n = new Node();

		Node new_node ;
		new_node = head;
		while(new_node.link!=null) {
			new_node=new_node.link;
		}
		n.person= person;
		n.link = null;
		new_node.link=n;
		return true;
		
		
		
	}

	public void printList() {
		Node z = head;
		while(z!=null) {
			System.out.println(z.person.toString());
			z = z.link;
		}
	}

	public boolean deleteItem(String name) {
		
		
	if(name.equals(head.person.getName())) { 
		head = head.link;
			return true;
		}
		else {
			Node x = head;
			Node y = head.link;
			while(y != null && y.person.getName().equals(name) ) {
				x=y;
				y=y.link;
			}
			if(y != null) {
				x.link=y.link;
				return true;
				
			} else {
				return false;
				}
		}	
	}

//	public void sortList() {
//		Node a = head.link; 
//		int c =0; // for swapping ..bubble sort
//		
//		while(a.link!=null) {
//			Node b =head.link;
//			while(b.link!=null) {
//				if(b.value < b.link.value) {
//					c=b.value;
//					b.value=b.link.value;
//					b.link.value=c;
//				}
//				b = b.link;
//			}
//			a = a.link;	
//		}
//		
//	}


		class Node {
		
		private Person person;
		private Node link;
		
		}

}
