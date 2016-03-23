import java.util.Scanner;

public class ArrayMenu {
	
	static Scanner scn = new Scanner(System.in);
	static ArrayStore array;
	
	public static void main(String args[]){
		String[] methods = {"Create","Insert","Delete","Print","Exit"};
		Menu menu = new Menu(methods);		
		boolean exit = false;
		int choices = 0;
		do{
			System.out.println(menu.displayMenu());
			System.out.println("Enter your choice:");
			int choice = scn.nextInt();
			switch(choice){
			case 1: System.out.println("Enter array size:");
				int size = scn.nextInt();
				array = new ArrayStore(size);
				System.out.println("ArrayCreated");
				break;
			case 2: System.out.println("enter number to be inserted:");
				int number = scn.nextInt();
				boolean inserted = array.insert(number);
				if(inserted) System.out.println("Insertion Succesful");
				else System.out.println("Insertion Failed");
				break;
			case 3: break;
			case 4: break;
			case 5: exit = true;
			default: if(choices >= 3){
					exit = true;
					System.out.println("Sorry! Exiting");
					System.out.flush();
				}else{
					choices++;
					System.out.println("Choose Carefully." + (4-choices) +" choices left!");
				}
			}
		}while(!exit);
	}
}
