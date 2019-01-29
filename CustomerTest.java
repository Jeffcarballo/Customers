/* 
* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customertest;

/**
 *
 * @author Jeff
 */

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerTest{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Customer[] customers = {
            new Customer("Alice Brown", "12 Main St", "Ellicot Manor", "MD", "21999", "123-456-7890"),
            new Customer("Charles Downing", "147 Tolker Ave", "Bloomneld", "NJ", "07001", "890-123-4567"),
            new Customer("Eric Farnes", "8397 Zip Rd", "Bloomneld", "NJ", "07001", "456-789-0123"),
            new Customer("Gary Hull", "1222 Ready Rd", "Resier", "CA", "90001", "345-678-9012"),
            new Customer("Ian Jones", "190 Distro Dr", "Patlock", "MI", "48003", "678-901-2345")
        };
        
        List<Customer> list = new ArrayList<>(Arrays.asList(customers));
        
        Scanner input = new Scanner(System.in);
        int choice = 0;
        
        do {
            System.out.println("\n_________MENU_________");
            System.out.println("'1' - To add a Customer ");
            System.out.println("'2' - To remove a Customer");
            System.out.println("'3' - To sort by Zip Code");
            System.out.println("'4' - To sort by City");
            System.out.println("'5' - To search by Full Name");
            System.out.println("'6' - To print all Customers");
            System.out.println("'>7' - Quit:\n");
            
            System.out.print("Enter Choice: ");
            choice = Integer.parseInt(input.nextLine());
            
            switch (choice) {
                case 1:  addCustomer(list, input);
                        break;
                case 2:  removeCustomer(list, input);
                        break;
                case 3:  sortByZip(list);
                        break;
                case 4:  sortByCity(list);
                        break;
                case 5:  searchByName(list, input);
                        break;
                case 6:  printCustomers(list);
                        break;
            }
        
        }while (choice < 7);
    }
    
    private static void addCustomer(List<Customer> list, Scanner input) {             
        
        System.out.println("\n-New Customer Info-");
        System.out.print("Enter Full Name: ");
        String name = input.nextLine();
        
        System.out.print("Enter Street Address: ");
        String address = input.nextLine();
        
        System.out.print("Enter City: ");
        String city = input.nextLine();
        
        System.out.print("Enter State: ");
        String state = input.nextLine();
        
        System.out.print("Enter Zip Code: ");
        String zip = input.nextLine();
        
        System.out.print("Enter Phone Number: ");
        String phone = input.nextLine();
        System.out.println();
        
        Customer customer = new Customer(name, address, city, state, zip, phone);
        list.add(customer);
        
    }

    private static void removeCustomer(List<Customer> list, Scanner input) {
        System.out.print("\nEnter the Customer's Full Name you wish to remove: ");
        String name = input.nextLine();
        int index = -1;
        
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getFullName().equalsIgnoreCase(name)){
                index = i;
                list.remove(index);
                System.out.println("CUSTOMER SUCCESSFULLY DELETED\n");
            }
        }       
        if(index == -1){
            System.out.println("CUSTOMER FAILED TO BE FOUND\n");
        }
    }

    private static void sortByZip(List<Customer> list) {
        System.out.println();
        
        list.stream()
                .sorted(Comparator.comparing(Customer::getZip))
                .forEach(System.out::println);
        
        System.out.println();
    }

    private static void sortByCity(List<Customer> list) {
        System.out.println();
        
        list.stream()
                .sorted(Comparator.comparing(Customer::getCity))
                .forEach(System.out::println);
        
        System.out.println();
    }

    private static void searchByName(List<Customer> list, Scanner input) {
        System.out.print("\nEnter the Customer's Full Name: ");
        String name = input.nextLine();      
        
        Predicate<Customer> fullName = 
                e->(e.getFullName().equalsIgnoreCase(name));
        
        System.out.println();
               
        if(list.stream().anyMatch(fullName)){
            
            list.stream()
                .filter(fullName)
                .forEach(System.out::println);
            
        } else {
            
            System.out.print("NAME NOT FOUND.");
            
        }
        
        System.out.println();
        
    }

    private static void printCustomers(List<Customer> list) {
        System.out.println();
        list.stream().forEach(System.out::println);
        System.out.println();
    }
} 


