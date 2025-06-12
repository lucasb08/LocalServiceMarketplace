//NAME: Lucas Bustos Ortega
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
        ArrayList<Double> ratesforbooking = new ArrayList<>();
        ArrayList<Integer> servicesAvailable = new ArrayList<>();

        servicesAvailable.add(0, 1);
        servicesAvailable.add(1, 1);
        servicesAvailable.add(2, 1);
        servicesAvailable.add(3, 1);
        servicesAvailable.add(4, 1);
        servicesAvailable.add(5, 1);
        servicesAvailable.add(6, 1);
        servicesAvailable.add(7, 1);
        servicesAvailable.add(8, 1);


        // introduction

        System.out.println("Welcome to ABay!");

        // choose a service
        boolean isRunning = true;

        while(isRunning) { // while loop to exit program
            System.out.println("Add a service (1).");
            System.out.println("Book a service (2).");
            System.out.println("Edit your cart/checkout. (3).");
            System.out.println("View your added services. (4).");
            System.out.println("Exit (5)");
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

                switch(optionsBooking) { // switch case for different options of booking
                    case (1):
                            System.out.println("1. Name: Ludo's Cleaning Services. (1).");
                            if(servicesAvailable.get(0) == 0) {
                                System.out.println("Fully Booked.");
                            } else {
                                System.out.println("Hourly Rate: $25.00/hour.");
                            }
                            System.out.println("2. Name: Clean Floors inc. (2).");
                            if(servicesAvailable.get(1) == 0) {
                                System.out.println("Fully Booked.");
                            } else {
                                System.out.println("Hourly Rate: $22.00/hour.");
                            }
                            System.out.println("3. Name: Smiling Surfaces Cleaning. (3).");
                            if(servicesAvailable.get(2) == 0) {
                                System.out.println("Fully Booked.");
                            } else {
                                System.out.println("Hourly Rate: $20.00/ hour.");
                            }


                        int optionsCleaning = sc.nextInt();

                        if(optionsCleaning == 1) {
                            if(servicesAvailable.get(0) > 0) { // marks service as fully booked
                                cart.add("Ludo's Cleaning Services");
                                ratesforbooking.add(25.00);
                                servicesAvailable.set(0, servicesAvailable.get(0) - 1);
                                System.out.println("Your order has been added to your cart.");
                            } else {
                                System.out.println("This service is fully booked.");
                            }

                        } else if(optionsCleaning == 2) {
                            if(servicesAvailable.get(1) > 0) {
                                cart.add("Clean Floors inc.");
                                ratesforbooking.add(22.00);
                                servicesAvailable.set(1, servicesAvailable.get(1) - 1);
                                System.out.println("Your order has been added to your cart.");
                            } else {
                                System.out.println("This service is fully booked.");
                            }

                        } else if(optionsCleaning == 3) {
                            if(servicesAvailable.get(2) > 0) {
                                cart.add("Smiling Surfaces Cleaning");
                                ratesforbooking.add(20.00);
                                servicesAvailable.set(2, servicesAvailable.get(2) - 1);
                                System.out.println("Your order has been added to your cart.");
                            } else {
                                System.out.println("This service is fully booked.");
                            }

                        } else {
                            System.out.println("Invalid input please try again.");

                        }
                        System.out.println("Your cart: " + (cart));
                        break;


                    case (2):
                        System.out.println("1. Name: Marcus' Tutoring Classes. (1).");
                        if(servicesAvailable.get(3) == 0) {
                            System.out.println("Fully Booked.");
                        } else {
                            System.out.println("Hourly Rate: $17.50/hour.");
                        }
                        System.out.println("2. Name: A+ Tutoring & Learning. (2).");
                        if(servicesAvailable.get(4) == 0) {
                            System.out.println("Fully Booked.");
                        } else {
                            System.out.println("Hourly Rate: $19.00/hour.");
                        }
                        System.out.println("3. Name: Top Tier Tutoring. (3).");
                        if(servicesAvailable.get(5) == 0) {
                            System.out.println("Fully Booked.");
                        } else {
                            System.out.println("Hourly Rate: $18.00/hour.");
                        }
                        int optionsTutoring = sc.nextInt();


                        if(optionsTutoring == 1) {
                            if(servicesAvailable.get(3) > 0) {
                                cart.add("Marcus' Tutoring Classes");
                                ratesforbooking.add(17.50);
                                servicesAvailable.set(3, servicesAvailable.get(3) - 1);
                                System.out.println("Your order has been added to your cart.");
                            } else {
                                System.out.println("This service is fully booked.");
                            }

                        } else if(optionsTutoring == 2) {
                            if(servicesAvailable.get(4) > 0) {
                                cart.add("A+ Tutoring & Learning");
                                ratesforbooking.add(19.00);
                                servicesAvailable.set(4, servicesAvailable.get(4) - 1);
                                System.out.println("Your order has been added to your cart.");
                            } else {
                                System.out.println("This service is fully booked.");
                            }

                        } else if(optionsTutoring == 3) {
                            if(servicesAvailable.get(5) > 0) {
                                cart.add("Top Tier Tutoring");
                                ratesforbooking.add(18.00);
                                servicesAvailable.set(5, servicesAvailable.get(5) - 1);
                                System.out.println("Your order has been added to your cart.");
                            } else {
                                System.out.println("This service is fully booked.");
                            }

                        } else {
                            System.out.println("Invalid input, please try again.");
                        }
                        System.out.println("Your cart: " + (cart));

                        break;


                    case (3):
                        System.out.println("1. Name: Betty's Babysitting. (1).");
                        if(servicesAvailable.get(6) == 0) {
                            System.out.println("Fully Booked.");
                        } else {
                            System.out.println("Hourly Rate: $20.50/hour.");
                        }
                        System.out.println("2. Name: Brandon's Childcare Services. (2).");
                        if(servicesAvailable.get(7) == 0) {
                            System.out.println("Fully Booked.");
                        } else {
                            System.out.println("Hourly Rate: $21.00/hour.");
                        }
                        System.out.println("3. Name: Babysitting & Nannies inc. (3).");
                        if(servicesAvailable.get(8) == 0) {
                            System.out.println("Fully Booked.");
                        } else {
                            System.out.println("Hourly Rate: $30.00/hour.");
                        }
                        int optionsChildcare = sc.nextInt();

                        if(optionsChildcare == 1) {
                            if(servicesAvailable.get(6) > 0) {
                                cart.add("Betty's Babysitting");
                                ratesforbooking.add(20.50);
                                servicesAvailable.set(6, servicesAvailable.get(6) - 1);
                                System.out.println("Your order has been added to your cart.");
                            } else {
                                System.out.println("This service is fully booked.");
                            }

                        } else if(optionsChildcare == 2) {
                            if(servicesAvailable.get(7) > 0) {
                                cart.add("Brandon's Childcare Services");
                                ratesforbooking.add(21.00);
                                servicesAvailable.set(7, servicesAvailable.get(7) - 1);
                                System.out.println("Your order has been added to your cart.");
                            } else {
                                System.out.println("This service is fully booked.");
                            }

                        } else if(optionsChildcare == 3) {
                            if(servicesAvailable.get(8) > 0) {
                                cart.add("Babysitting & Nannies inc.");
                                ratesforbooking.add(30.00);
                                servicesAvailable.set(8, servicesAvailable.get(8) - 1);
                                System.out.println("Your order has been added to your cart.");
                            } else {
                                System.out.println("This service is fully booked.");
                            }

                        } else {
                            System.out.println("Invalid input, please try again.");
                        }
                        System.out.println("Your cart: " + (cart));

                        break;


                    default:
                        System.out.println("Invalid input, please try again.");
                        break;
                }

            } else if(options == 3) { // if user chooses edit their cart/checkout
                System.out.println("Would you like to: ");
                System.out.println("View your cart. (1).");
                System.out.println("Remove items from your cart. (2).");
                System.out.println("Checkout. (3).");
                int optionsCheckout = sc.nextInt();

                if(optionsCheckout == 1) { // if the user chooses to view their cart

                    System.out.println(cart);

                } else if(optionsCheckout == 2) {

                    System.out.println("Which item would you like to remove from your cart?");
                    System.out.println(cart);
                    System.out.println("Enter the position the item is in to remove it.");
                    int remove = sc.nextInt();
                    String removedService = cart.get(remove - 1);

                    if(removedService.equals("Ludo's Cleaning Services")) { // changes availability of service back to normal
                        servicesAvailable.set(0, 1);
                    } else if(removedService.equals("Clean Floors inc.")) {
                        servicesAvailable.set(1, 1);
                    } else if(removedService.equals("Smiling Surfaces Cleaning")) {
                        servicesAvailable.set(2, 1);
                    } else if(removedService.equals("Marcus' Tutoring Classes")) {
                        servicesAvailable.set(3, 1);
                    } else if(removedService.equals("A+ Tutoring & Learning")) {
                        servicesAvailable.set(4, 1);
                    } else if(removedService.equals("Top Tier Tutoring")) {
                        servicesAvailable.set(5, 1);
                    } else if(removedService.equals("Betty's Babysitting")) {
                        servicesAvailable.set(6, 1);
                    } else if(removedService.equals("Brandon's Childcare Services")) {
                        servicesAvailable.set(7, 1);
                    } else if(removedService.equals("Babysitting & Nannies inc.")) {
                        servicesAvailable.set(8, 1);
                    } else {
                        System.out.println("Invalid input, please try again.");
                    }

                    cart.remove(remove - 1);
                    ratesforbooking.remove(remove - 1);
                    System.out.println("Updated cart: " + (cart));

                } else if(optionsCheckout == 3) { // if user decides to check out

                    System.out.println("Invoice: ");
                    int counter3 = 0;
                    for(String i : cart) { // displays invoice breaking down total cost and hourly rates
                        System.out.println(i + " Hourly Rate: $" + ratesforbooking.get(counter3) + " per hour.");
                        counter3++;
                    }
                    System.out.print("Your total is: ");
                    double totalSum = 0;
                    for(Double i : ratesforbooking) { // adds the hourly rates together to get the total cost
                        totalSum += i;
                    }
                    System.out.println("$" + totalSum);
                    cart.removeAll(cart);
                    System.out.println("Thank you for shopping with ABay.");
                }
            } else if(options == 4) { // if user decides to view their added services
                System.out.println("Your services: ");
                System.out.println(serviceNames);

            } else if(options == 5) { // if user decides to exit the program
                System.out.println("Thank you for using ABay, come again soon.");
                isRunning = false;
            }
        }
    }
}