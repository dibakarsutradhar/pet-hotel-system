/* Asadur Rahman (SUKD1702099)
 * Dibakar Sutra Dhar ()
 * Nandita Dhanda ()
 * Abdourahmane Diallo ()
 * Mohamed Abdellah Abdelhag ()
 * Ahmed Aref Ahmed ()
 */
package pet.hotel.system;

import java.io.*;

public class InfoOnPayment implements Serializable {
    
    private String Cust_Name, Cust_Address, Pay_Type, Pay_date;
    private double Pay_cash, Pay_card;
    
    // Constructor
    public InfoOnPayment(String Cust_Name, String Cust_Address, String Pay_Type, String Pay_date, double Pay_cash, double Pay_card) {
        this.Cust_Name = Cust_Name;
        this.Cust_Address = Cust_Address;
        this.Pay_Type = Pay_Type;
        this.Pay_date = Pay_date;
        this.Pay_cash = Pay_cash;
        this.Pay_card = Pay_card;
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

    public double getPay_cash() {
        return Pay_cash;
    }

    public void setPay_cash(double Pay_cash) {
        this.Pay_cash = Pay_cash;
    }

    public double getPay_card() {
        return Pay_card;
    }

    public void setPay_card(double Pay_card) {
        this.Pay_card = Pay_card;
    }
    
    
    
}
    