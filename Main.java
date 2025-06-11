//NAME: Lucas Bustos
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // adding all array lists for service necessities
        ArrayList<String> serviceNames = new ArrayList<>();
        ArrayList<String> serviceCategories = new ArrayList<>();
        ArrayList<Double> serviceRates = new ArrayList<>();
        ArrayList<String> cart = new ArrayList<>();
        
        int counter = 0;
        
        // introduction
        
        System.out.println("Welcome to ABay!");
        
        // choose a service
        boolean isRunning = true;
        
        while(isRunning) { // while loop to exit program
        System.out.println("Add a service (1).");
        System.out.println("Book a service (2).");
        System.out.println("Edit your cart/checkout. (3).");
        System.out.println("Exit (4).");
        int options = sc.nextInt();
        
        sc.nextLine(); // fixes skipping issue

        if(options == 1) { // if user chooses to add a service
        boolean run = true;

            while(run) {
                System.out.println("Enter the service's name: ");
                serviceNames.add(sc.nextLine());

                System.out.println("Enter your service's category: ");
                serviceCategories.add(sc.nextLine());

                System.out.println("Enter your hourly rate: ");
                serviceRates.add(sc.nextDouble());
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
            		cart.add("Ludo's Cleaning Services");
            		System.out.println("Your order has been added to your cart.");
            		counter2++;
            	} else if(optionsCleaning == 2) {
            		cart.add("Clean Floors inc.");
            		System.out.println("Your order has been added to your cart.");
            		counter2++;
            	} else if(optionsCleaning == 3) {
            		cart.add("Smiling Surfaces Cleaning");
            		System.out.println("Your order has been added to your cart.");
            		counter2++;
            	} else {
            		System.out.println("Invalid input please try again.");
            	}
            	System.out.println("Your cart: " + (cart));
            	break; 
            	
            	
            case (2):
            	System.out.println("1. Name: Marcus' Tutoring Classes. (1).");
            	System.out.println("Hourly Rate: $17.50/hour.");
            	System.out.println("2. Name: A+ Tutoring & Learning. (2).");
            	System.out.println("Hourly Rate: $19.00/hour.");
            	System.out.println("3. Name: Top Tier Tutoring. (3).");
            	System.out.println("Hourly Rate: $18.00/hour.");
            	int optionsTutoring = sc.nextInt();
            	
            	if(optionsTutoring == 1) {
            		cart.add("Marcus' Tutoring Classes");
            		System.out.println("Your order has been added to your cart.");
            		counter2++;
            	} else if(optionsTutoring == 2) {
            		cart.add("A+ Tutoring & Learning");
            		System.out.println("Your order has been added to your cart.");
            		counter2++;
            	} else if(optionsTutoring == 3) {
            		cart.add("Top Tier Tutoring");
            		System.out.println("Your order has been added to your cart.");
            		counter2++;
            	} else {
            		System.out.println("Inalid input, please try again.");
            	}
            	System.out.println("Your cart: " + (cart));
            	
            	break;
            	
            	
            case (3):
            	System.out.println("1. Name: Betty's Babysitting. (1).");
            	System.out.println("Hourly Rate: $20.50/hour.");
            	System.out.println("2. Name: Brandon's Childcare Services. (2).");
            	System.out.println("Hourly Rate: $21.00/hour.");
            	System.out.println("3. Name: Babysitting & Nannies inc. (3).");
            	System.out.println("Hourly Rate: $30.00/hour.");
            	int optionsChildcare = sc.nextInt();
            	
            	if(optionsChildcare == 1) {
            		cart.add("Betty's Babysitting");
            		System.out.println("Your order has been added to your cart.");
            		counter2++;
            	} else if(optionsChildcare == 2) {
            		cart.add("Brandon's Childcare Services");
            		System.out.println("Your order has been added to your cart.");
            		counter2++;
            	} else if(optionsChildcare == 3) {
            		cart.add("Babysitting & Nannies inc.");
            		System.out.println("Your order has been added to your cart.");
            		counter2++;
            	} else {
            		System.out.println("Invalid input, please try again.");
            	}
            	System.out.println("Your cart: " + (cart));
            	
            	break;
            	
            	
            	default:
            		System.out.println("Invalid input, please try again.");
            		break;
            }
            
        } else if(options == 3) { // if user chooses to exit program
        	System.out.println("Would you like to: ");
        	System.out.println("View your cart. (1).");
        	System.out.println("Remove items from your cart. (2).");
        	System.out.println("Checkout. (3).");
        	int optionsCheckout = sc.nextInt();
        	
        	if(optionsCheckout == 1) {
        		
        		System.out.println(cart);
        		
        	} else if(optionsCheckout == 2) {
        		
        		System.out.println("Which item would you like to remove from your cart?");
        		System.out.println(cart);
        		System.out.println("Enter the position the item is in to remove it.");
        		int remove = sc.nextInt();
        		cart.remove(remove - 1);
        		System.out.println("Updated cart: " + (cart));
        		
        	} else if(optionsCheckout == 3) {
        		
        		System.out.println("Invoice: ");
        		for(int i = 0; i < cart.size() + 1; i++) {
        			System.out.println(cart.get(i) + ": Hourly rate: " + serviceRates.get(i));
        		}
        	}
        }
        }
    }
}