/* Asadur Rahman, SUKD1702099
   Deebakar Sutra Dhar, SUKD1802273,
   Mohamed Abdallah Abdelhag, SUKD1802062
   Abdourahmane Diallo, SUKD1801767
   Nandita Dhanda, SUKD1702275
   Ahmed Aref Ahmed, SUKD1801597
*/
package pet.hotel.system;

import java.io.*;

public class InfoOnPayment implements Serializable {
    
    private String Cust_Name, Cust_Address, Pay_Type, Pay_date;
    
    
    // Constructor
    public InfoOnPayment(String Cust_Name, String Cust_Address, String Pay_Type, String Pay_date) {
        this.Cust_Name = Cust_Name;
        this.Cust_Address = Cust_Address;
        this.Pay_Type = Pay_Type;
        this.Pay_date = Pay_date;
    }
    // getter and setter

    public String getCust_Name() {
        return Cust_Name;
    }

    public void setCust_Name(String Cust_Name) {
        this.Cust_Name = Cust_Name;
    }

    public String getCust_Address() {
        return Cust_Address;
    }

    public void setCust_Address(String Cust_Address) {
        this.Cust_Address = Cust_Address;
    }

    public String getPay_Type() {
        return Pay_Type;
    }

    public void setPay_Type(String Pay_Type) {
        this.Pay_Type = Pay_Type;
    }

    public String getPay_date() {
        return Pay_date;
    }

    public void setPay_date(String Pay_date) {
        this.Pay_date = Pay_date;
    }
    
    
    
}
    