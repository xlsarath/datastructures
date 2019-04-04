package queues;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*		Intq q =new Intq();
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		
//		System.out.println(q.dequeue());;
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
	
	q.showAll();
	
	*/
		
		Personq q = new Personq();
		q.enqueue(new Person("Sarath","123"));
		q.enqueue(new Person ("San Jose","1234"));
		
		q.showAll();
		
	}

}
