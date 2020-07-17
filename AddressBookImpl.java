package bridgelabz;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddressBookImpl implements IAddressBook {

	List<Person> list = new ArrayList<>();
	public void Create() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your first name:");
		String firstName = sc.nextLine();
		System.out.println("enter your last name:");
		String lastName = sc.nextLine();
		System.out.println("enter your address");
		String address = sc.nextLine();
		System.out.println("enter your city");
		String city = sc.nextLine();
		System.out.println("enter your state");
		String state = sc.nextLine();
		System.out.println("enter your phone");
		long mobileNo = sc.nextLong();
		System.out.println("enter your Pin code");
		String pincode = sc.next();

		Person person = new Person(firstName, lastName, address, city, state, mobileNo, pincode);


		list.add(person);


	}

	public void Display() {

		for(Person person:list) {
			System.out.println(person);
		}
	}

	public void deletePersonData(String name) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getFirstName().equalsIgnoreCase(name)) {
				Person person = list.get(i);
				list.remove(person);
			}

		}

	}
	public void updatePersonDetails(int personId) {
		for(int i=0;i<list.size();i++) {
			Person person = list.get(i);
			Scanner scanner = new Scanner(System.in);
			System.out.println("Hi "+person.getFirstName()+" please enter your  new Address");
			String address = scanner.nextLine();
			person.setAddress(address);
		}	

	}

	public void sortByfirstName() {



		Collections.sort(list, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));

		System.out.println(list);

	}

	public void sortBypincode() {

		Collections.sort(list, (p1, p2) ->p1.getPincode().compareTo(p2.getPincode()));

		System.out.println(list);
	}

}
