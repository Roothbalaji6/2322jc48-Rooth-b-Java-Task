package task;
import java.util.Scanner;
public class MinAdress {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String[] contacts = new String[5]; // allows 5 contacts
	        int count = 0;
	        int choice;

	        do {
	            System.out.println("\n1. Add Contact");
	            System.out.println("2. View Contacts");
	            System.out.println("3. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();
	            sc.nextLine(); // consume newline

	            switch (choice) {
	                case 1:
	                    if (count < contacts.length) {
	                        System.out.print("Enter contact name and phone: ");
	                        contacts[count] = sc.nextLine();
	                        count++;
	                        System.out.println("Contact added!");
	                    } else {
	                        System.out.println("Address book is full!");
	                    }
	                    break;
	                case 2:
	                    System.out.println("Contacts:");
	                    for (int i = 0; i < count; i++) {
	                        System.out.println((i + 1) + ". " + contacts[i]);
	                    }
	                    break;
	                case 3:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice.");
	            }
	        } while (choice != 3);
	    }
	}



