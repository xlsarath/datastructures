package doublelinkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DList list = new DList(2);
		list.insertIteam(3);
		list.insertIteam(6);
		list.printList();
		list.deleteItem(3);
		list.printList();

		
	}

}
