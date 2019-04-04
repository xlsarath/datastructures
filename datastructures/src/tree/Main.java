package tree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 =new Person("Apple",123);
		Person p2 =new Person("Orange",3);
		Person p3 =new Person("grapes",23);
		Person p4 =new Person("honeydew",13);
		Person p5 =new Person("banana",123);
		Person p6 =new Person("pomo",123);
	BST b =new BST();
	b.insert(p1);
	b.insert(p2);
	b.insert(p3);
	b.insert(p4);
	b.insert(p5);
	b.insert(p6);
	b.insert(p1);
	
	b.showAll(b.findNode("pomo"));
	b.showAll(b.findNode("Apple"));

	b.getData(b.findParent("pomo"));
	b.getData(b.findParent("honeydew"));

	}

}
