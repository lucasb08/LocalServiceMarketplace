//NAME: Lucas Bustos
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // adding all arrays for service necessities
        String[] serviceNames = new String[100];
        String[] serviceCategories = new String[100];
        String[] cart = new String[100];
        Double[] serviceRates = new Double[100];
        
        int counter = 0;
        
        // introduction
        
        System.out.println("Welcome to ABay!");
        
        // choose a service
        boolean isRunning = true;
        
        while(isRunning) { // while loop to exit program
        System.out.println("Add a service (1).");
        System.out.println("Book a service (2).");
        														System.out.println("View cart (3).");
        System.out.println("Exit (4).");
        int options = sc.nextInt();
        
        sc.nextLine(); // fixes skipping issue

        if(options == 1) { // if user chooses to add a service
        boolean run = true;

            while(run) {
                System.out.println("Enter the service's name: ");
                serviceNames[counter] = sc.nextLine();

                System.out.println("Enter your service's category: ");
                serviceCategories[counter] = sc.nextLine();

                System.out.println("Enter your hourly rate: ");
                serviceRates[counter] = sc.nextDouble();
                sc.nextLine(); // fixes skipping issue

                counter++;

                System.out.println("Your service has been added!");

                System.out.println("Would you like to add another service? (yes/no)");

                String addService = sc.nextLine();

                if (addService.equals("no")) {
                run = false;
                }
            }
        } else if(options == 2) { // if user chooses to book a service
        	
            System.out.println("Select one of the categories to view services within it: ");
            System.out.println("1. Cleaning. (1).");
            System.out.println("2. Tutoring. (2).");
            System.out.println("3. Childcare. (3).");
            int optionsBooking = sc.nextInt();
            int counter2 = 0;
            
            switch(optionsBooking) {
            case (1):
            	System.out.println("1. Name: Ludo's Cleaning Services. (1).");
            	System.out.println("Hourly Rate: $25.00/hour.");
            	System.out.println("2. Name: Clean Floors inc. (2).");
            	System.out.println("Hourly Rate: $22.00/hour.");
            	System.out.println("3. Name: Smiling Surfaces Cleaning. (3).");
            	System.out.println("Hourly Rate: $20.00/ hour.");
            	
            	int optionsCleaning = sc.nextInt();
            	
            	if(optionsCleaning == 1) {
            		cart[counter2] = "Ludo's Cleaning Services";
            		System.out.println("Your order has been added to your cart.");
            	} else if(optionsCleaning == 2) {
            		cart[counter2] = "Clean Floors inc.";
            		System.out.println("Your order has been added to your cart.");
            	} else if(optionsCleaning == 3) {
            		cart[counter2] = "Smiling Surfaces Cleaning";
            		System.out.println("Your order has been added to your cart.");
            	} else {
            		System.out.println("Invalid input please try again.");
            	}
            	break; 
            	
            	
            case (2):
            	System.out.println("1. Name: Marcus' Tutoring Classes.");
            	System.out.println("Hourly Rate: $17.50/hour.");
            	System.out.println("2. Name: A+ Tutoring & Learning.");
            	System.out.println("Hourly Rate: $19.00/hour.");
            	System.out.println("3. Name: Top Tier Tutoring.");
            	System.out.println("Hourly Rate: $18.00/hour.");
            	String optionsTutoring = sc.nextLine();
            	break;
            	
            	
            case (3):
            	System.out.println("1. Name: Betty's Babysitting.");
            	System.out.println("Hourly Rate: $20.50/hour.");
            	System.out.println("2. Name: Brandond's Childcare Services.");
            	System.out.println("Hourly Rate: $21.00/hour.");
            	System.out.println("3. Name: Babysitting & Nannies inc.");
            	System.out.println("Hourly Rate: $30.00/hour.");
            	String optionsChildcare = sc.nextLine();
            	break;
            	
            	
            	default:
            		System.out.println("Invalid input, please try again.");
            		break;
            }
            
        } else if(options == 4) { // if user chooses to exit program
        	System.out.println("Thank you for using ABay.");
        	isRunning = false;
        }
        }
    }
}