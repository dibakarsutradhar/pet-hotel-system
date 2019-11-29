/* Asadur Rahman, SUKD1702099
   Deebakar Sutra Dhar, SUKD1802273,
   Mohamed Abdallah Abdelhag, SUKD1802062
   Abdourahmane Diallo, SUKD1801767
   Nandita Dhanda, SUKD1702275
   Ahmed Aref Ahmed, SUKD1801597
*/

package pet.hotel.system;

import java.io.*;

public class InfoOnReg implements Serializable{
    
    private String Cust_Name, Cust_Address, Cust_Email;
    private String Pet_Name, Pet_Type, Pet_Sex, Breed;
    private double Cust_Ph_No;
    private String Arrival_date, Departure_date;
    
    // Constructor
    public InfoOnReg(String Cust_Name, String Cust_Address, String Cust_Email, String Pet_Name, String Pet_Type, String Pet_Sex, String Breed, double Cust_Ph_No, String Arrival_date, String Departure_date) {
        this.Cust_Name = Cust_Name;
        this.Cust_Address = Cust_Address;
        this.Cust_Email = Cust_Email;
        this.Pet_Name = Pet_Name;
        this.Pet_Type = Pet_Type;
        this.Pet_Sex = Pet_Sex;
        this.Breed = Breed;
        this.Cust_Ph_No = Cust_Ph_No;
        this.Arrival_date = Arrival_date;
        this.Departure_date = Departure_date;
    }

  
    
    // Boolean check
    public boolean equals (InfoOnReg infoonreg) 
    {
            return (this.Cust_Name.equals(infoonreg.Cust_Name) &&
                    this.Cust_Address.equals(infoonreg.Cust_Address)&&
                    this.Cust_Email.equals(infoonreg.Cust_Email) &&
                    this.Pet_Name.equals(infoonreg.Pet_Name) &&
                    this.Pet_Type.equals(infoonreg.Pet_Type) &&
                    this.Pet_Sex.equals(infoonreg.Pet_Sex) &&
                    this.Breed.equals(infoonreg.Breed) &&
                    this.Cust_Ph_No == infoonreg.Cust_Ph_No &&
                    this.Arrival_date.equals (infoonreg.Arrival_date) &&
                    this.Departure_date.equals (infoonreg.Departure_date)                   
                     
                    );
            

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

    public String getCust_Email() {
        return Cust_Email;
    }

    public void setCust_Email(String Cust_Email) {
        this.Cust_Email = Cust_Email;
    }

    public String getPet_Name() {
        return Pet_Name;
    }

    public void setPet_Name(String Pet_Name) {
        this.Pet_Name = Pet_Name;
    }

    public String getPet_Type() {
        return Pet_Type;
    }

    public void setPet_Type(String Pet_Type) {
        this.Pet_Type = Pet_Type;
    }

    public String getPet_Sex() {
        return Pet_Sex;
    }

    public void setPet_Sex(String Pet_Sex) {
        this.Pet_Sex = Pet_Sex;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String Breed) {
        this.Breed = Breed;
    }

    public double getCust_Ph_No() {
        return Cust_Ph_No;
    }

    public void setCust_Ph_No(double Cust_Ph_No) {
        this.Cust_Ph_No = Cust_Ph_No;
    }

    public String getArrival_date() {
        return Arrival_date;
    }

    public void setArrival_date(String Arrival_date) {
        this.Arrival_date = Arrival_date;
    }

    public String getDeparture_date() {
        return Departure_date;
    }

    public void setDeparture_date(String Departure_date) {
        this.Departure_date = Departure_date;
    }

}