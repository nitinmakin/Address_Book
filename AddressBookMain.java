package bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);
		AddressBookImpl adress= new AddressBookImpl();
		boolean check = true;
		
			
			while(check) {
				System.out.println("1.ADD  2.DISPLAY  3.DELETE  4.UPDATE  5.SORT BY NAME/ZIP  6.QUIT");
				int option = scanner.nextInt();
				switch(option){
					case 1:
						adress.Create();
						
							break;
					case 2:
							
						adress.Display();
							break;
					case 3:
							System.out.println("enter a person name to delete his details:");
							String name=scanner.next();
							adress.deletePersonData(name);
							break;
					case 4:
							System.out.println("please enter a id of a person to update");
							int personId = scanner.nextInt();
							adress.updatePersonDetails(personId);
							
							break;
					case 5:System.out.println("Please enter your choice  1.sortBy firstName, 2.sortBy pincode");
							int sortBy=scanner.nextInt();
							
							if(sortBy == 1){
								adress.sortByfirstName();
							}else if (sortBy == 2){
								adress.sortBypincode();
							}
							else{
								 System.out.println("Enter a valid option:");
							}
							break;
					
					case 6 :
						
						check=false;
						System.out.println("thanK you for your time");
						default:
							System.out.println("enter a valid option" );
				
				}
			}
	}
}
