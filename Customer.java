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
public class Customer {
    private String fullName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    
    public Customer() {this(null, null, null, null, null, null);}
    
    public Customer(String fullName, String address, String city,
            String state, String zip, String phone){
        
        this.fullName = CheckValidation.fullName(fullName);            
        this.address = CheckValidation.Address(address);
        this.city = CheckValidation.City(city);
        this.state = CheckValidation.State(state);
        this.zip = CheckValidation.ZipCode(zip);
        this.phone = CheckValidation.Phone(phone);
    }
    
    public String getFullName() {return fullName;}
    
    public void setFullName(String fullName) {          
        
        this.fullName = CheckValidation.fullName(fullName);
        
    }
    
    public String getAddress() {return address;}
    
    public void setAddress(String address) {

        this.address = CheckValidation.Address(address);
        
    }
    
    public String getCity() {return city;}
    
    public void setCity(String city) {

        this.city = CheckValidation.City(city);
        
    }
    
    public String getState() {return state;}
    
    public void setState(String state) {

        this.state = CheckValidation.State(state);
            
    }
    
    public String getZip() {return zip;}
    
    public void setZip(String zip) {

        this.zip = CheckValidation.ZipCode(zip);

    }
    
    public String getPhone() {return phone;}
    
    public void setPhone(String phone) {

        this.phone = CheckValidation.Phone(phone);
        
    }
    
    @Override
    public String toString(){
        return String.format("%-20s %-20s %-20s %-10s %-10s %-10s",
                getFullName(), getAddress(), getCity(), getState(),getZip(), getPhone());
    }
}
