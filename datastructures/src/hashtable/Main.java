package hashtable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashTable hashtable = new HashTable();
		Student std1 = new Student("ram","123",3.7);
		Student std2 = new Student("rahim","12",3.7);
		Student std3 = new Student("robot","1",3.3);
		Student std4 = new Student("rot","1",3.9);

		int std1key = hashtable.toHashCode(std1.getRollno());
		int std2key = hashtable.toHashCode(std2.getRollno());
		int std3key = hashtable.toHashCode(std3.getRollno());
		int std4key = hashtable.toHashCode(std4.getRollno());

	
	hashtable.insert(std1key, std1);
	hashtable.insert(std2key, std2);
	hashtable.insert(std3key, std3);
	hashtable.insert(std4key, std4);

	hashtable.deleteStd(std3.getRollno());
	
	hashtable.showData();
	
	Student new_std2= hashtable.fetchStdInfo(std2.getRollno());
	if(new_std2.getName().equals(std2.getName())) {
		System.out.println("Equal");
	}
	
	
	}
	

}
