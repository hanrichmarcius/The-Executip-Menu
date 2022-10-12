import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<Dress> dress = new ArrayList<>();

	public Main() {
		// TODO Auto-generated constructor stub
			mainMenu();
	}

	
	private void mainMenu() {
		
		int input = 0;
		
		do {
			System.out.println("The Executip");
			System.out.println("===================");
			System.out.println("1. Insert new dress");
			System.out.println("2. View all dresses");
			System.out.println("3. Delete a dress");
			System.out.println("4. Exit");
			System.out.print(">> ");
			
			input = scan.nextInt();
			scan.nextLine();
			
			switch (input) {
			case 1:
				insert();
				break;

			case 2:
				view();
				break;
				
			case 3:
				delete();
				break;
			}
		} while (input != 4);
	}
	
	
	private void delete() {
		// TODO Auto-generated method stub
		
		String ID;
		int Remove = 0;
		
		if (dress.isEmpty()) {
			System.out.println("No dresses available");
			System.out.println("Press Enter to continue...");
			scan.nextLine();
		} else {
			view();
			System.out.println("Input dress ID to delete: ");
			ID = scan.nextLine();
			for (int i = 0; i < dress.size(); i++) {
				if (dress.get(i).getID().equals(ID)) {
					dress.remove(i);
					Remove = 1;
					System.out.println("Succesfully removed dress " + ID + "!");
					System.out.println("Press Enter to continue...");
					scan.nextLine();
					break;
				} 
			}
			if (Remove == 0) {
				System.out.println("Dress ID is invalid!");
				System.out.println("Press Enter to continue...");
				scan.nextLine();
			}
		}
	}


	private void view() {
		// TODO Auto-generated method stub
		if (dress.isEmpty()) {
			System.out.println("No dresses available");
			System.out.println("Press Enter to continue...");
			scan.nextLine();
		} else {
			System.out.println("==============================================================================================");
			System.out.println("|  ID   |  Name                | Fabric Price | Fabric Type | Discount | Stock | Total Price |");
			System.out.println("==============================================================================================");
			for (int i = 0; i < dress.size(); i++) {
				dress.get(i).display();
			}
			System.out.println("==============================================================================================");
		}
	}


	private void insert() {
		// TODO Auto-generated method stub
		
		int input = 0;
		
		do {
			insertMenu();
			
			input = scan.nextInt();
			scan.nextLine();
			
			switch (input) {
			case 1:
				insertRegularDress();
				break;

			case 2:
				insertLimitedEditonDress();
				break;
			}
		} while (input != 3);
	}


	private void insertLimitedEditonDress() {
		// TODO Auto-generated method stub
		
		LimitedEditionDress led = new LimitedEditionDress(0, null, null, null, 0);
		
		do {
			System.out.println("Input dress name [5 - 20 characters]: ");
			led.setName(scan.nextLine());
		} while (led.getName().length() < 5 || led.getName().length() > 20);
		do {
			System.out.println("Input fabric price [Rp. 100000 - Rp. 300000]: ");
			led.setFabricPrice(scan.nextInt());
			scan.nextLine();
		} while (led.getFabricPrice() < 100000 || led.getFabricPrice() > 300000);
		do {
			System.out.println("Input fabric type [Satin | Chiffon | Crepe]: ");
			led.setFabricType(scan.nextLine());
		} while (!led.getFabricType().equals("Satin") && !led.getFabricType().equals("Chiffon") && !led.getFabricType().equals("Crepe"));
		do {
			System.out.println("Input stock for this dress [1..10]: ");
			led.setStock(scan.nextInt());
			scan.nextLine();
		} while (led.getStock() < 1 || led.getStock() > 10);
		
		led.setID("LI" + (int)Math.floor(Math.random()*10) + (int)Math.floor(Math.random()*10) + (int)Math.floor(Math.random()*10));
		
		dress.add(led);
		
		System.out.println("Successfully added a new Limited Edition Dress!");
		System.out.println("Press Enter to continue...");
		scan.nextLine();
	}

	private void insertRegularDress() {
		// TODO Auto-generated method stub
		
		RegularDress rd = new RegularDress(0, null, null, null, 0);
		
		do {
			System.out.println("Input dress name [5 - 20 characters]: ");
			rd.setName(scan.nextLine());
		} while (rd.getName().length() < 5 || rd.getName().length() > 20);
		do {
			System.out.println("Input fabric price [Rp. 10000 - Rp. 100000]: ");
			rd.setFabricPrice(scan.nextInt());
			scan.nextLine();
		} while (rd.getFabricPrice() < 10000 || rd.getFabricPrice() > 100000);
		do {
			System.out.println("Input fabric type [Cotton | Wool]: ");
			rd.setFabricType(scan.nextLine());
		} while (!rd.getFabricType().equals("Cotton") && !rd.getFabricType().equals("Wool"));
		do {
			System.out.println("Input discount for this dress [1..100]: ");
			rd.setDiscount(scan.nextInt());
			scan.nextLine();
		} while (rd.getDiscount() < 1 || rd.getDiscount() > 100);
		
		rd.setID("RE" + (int)Math.floor(Math.random()*10) + (int)Math.floor(Math.random()*10) + (int)Math.floor(Math.random()*10));
		
		dress.add(rd);
		
		System.out.println("Successfully added a new Regular Dress!");
		System.out.println("Press Enter to continue...");
		scan.nextLine();
	}


	private void insertMenu() {
		// TODO Auto-generated method stub
		System.out.println("Pick which type of dress to insert: ");
		System.out.println("1. Regular Dress");
		System.out.println("2. Limited Edition Dress");
		System.out.println("3. Back");
		System.out.print(">> ");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
