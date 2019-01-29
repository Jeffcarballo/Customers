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
public class ValidateInput {
    
    public static boolean validateFullName(String fullName) {
        return fullName.matches("^[a-zA-Z\\s]*$");      
    }
    
    public static boolean validateAddress(String address) {
        return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }
    
    public static boolean validateCity(String city) {
        return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }
    
    public static boolean validateState(String state) {
        return state.matches("([a-zA-z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }
    
    public static boolean validateZip(String zip) {
        return zip.matches("\\d{5}");
    }
    
    public static boolean validatePhone(String phone) {
        return phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
    }
}
