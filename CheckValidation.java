/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3b;

/**
 *
 * @author Jeff
 */
public class CheckValidation {
    
    
    public static String fullName(String fullName) {
        if(!ValidateInput.validateFullName(fullName)){
            System.out.printf("Name: %s%s%n", fullName, " is Invalid. Set to 'None'.");
        }else           
            return fullName;      
        return "None";
    }
    
    public static String Address(String address) {
        if(!ValidateInput.validateAddress(address)){
            System.out.printf("Address: %s%s%n", address, " is Invalid. Set to 'None'.");
        }else           
            return address;      
        return "None";
    }
    
    public static String City(String city) {
        if(!ValidateInput.validateCity(city)){
            System.out.printf("City: %s%s%n", city, " is Invalid. Set to 'None'.");
        }else           
            return city;      
        return "None";
    }
    
    public static String State(String state) {
        if(!ValidateInput.validateState(state)){
            System.out.printf("State: %s%s%n", state, " is Invalid. Set to 'None'.");
        }else           
            return state;      
        return "None";
    }
    
    public static String ZipCode(String zip) {
        if(!ValidateInput.validateZip(zip)){
            System.out.printf("Zip Code: %s%s%n", zip, " is Invalid. Set to 'None'.");
        }else           
            return zip;      
        return "None";
    }
    
    public static String Phone(String phone) {
        if(!ValidateInput.validatePhone(phone)){
            System.out.printf("Phone Number: %s%s%n", phone, " is Invalid. Set to 'None'.");
        }else           
            return phone;      
        return "None";
    }    
}
