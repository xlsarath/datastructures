package datastructures;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	IntStack intStack = new IntStack();
		
		if(!intStack.isFull()) {
			
			intStack.push(2);
			intStack.push(4);
			intStack.push(6);
			intStack.push(9);
			
		}
		
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
*/
		
		Person person1 = new Person("Sarath","123");
		Person person2 = new Person("Chandra","321");
		
		PersonsStack stack  = new PersonsStack();
		
		stack.push(person1);
		stack.push(person2);
		
		System.out.println(stack.pop().toString());
		System.out.println(stack.pop().toString());

	}

}
