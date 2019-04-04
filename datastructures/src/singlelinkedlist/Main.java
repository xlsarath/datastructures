package singlelinkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IntLinkedList list = new IntLinkedList();
list.insertIteam(2);
list.insertIteam(19);
list.insertIteam(8);
list.printList();
	list.sortList();

//list.deleteItem(5);
list.printList();

Person person1 = new Person("apple","123");
Person person2 = new Person("orange","456");

PersonLinkedList list1 = new PersonLinkedList(person1);
list1.insertIteam(person2);
list1.printList();


	}

}
