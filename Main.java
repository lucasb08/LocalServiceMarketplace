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
        String[] serviceAvailable = new String[100];
        Double[] serviceRates = new Double[100];
        int counter = 0;
        // introduction
        System.out.println("Welcome to ABay!");
        // choose a service
        System.out.println("Add a service (1).");
        System.out.println("Book a service (2).");
        System.out.println("Exit (3).");
        int options = sc.nextInt();
        sc.nextLine(); // fixes skipping issue

        if(options == 1) {
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
        } else if(options == 2) {
            System.out.println("Select one of the categories to view services within it: ");
            System.out.println("1. Cleaning.");
            System.out.println("2. Tutoring.");
            System.out.println("3. Childcare.");
            
        } else if(options == 3) {

        }
    }
}