/* Asadur Rahman, SUKD1702099
   Deebakar Sutra Dhar, SUKD1802273,
   Mohamed Abdallah Abdelhag, SUKD1802062
   Abdourahmane Diallo, SUKD1801767
   Nandita Dhanda, SUKD1702275
   Ahmed Aref Ahmed, SUKD1801597
*/

package pet.hotel.system;

import java.io.*;

public class InfoOnPkg implements Serializable
{
    private String type_of_room, grooming, toys, food, vaccine;
    private String Pet_Type, Cust_Name;
    private double price_per_week;
    
    // Constructor

    public InfoOnPkg(String type_of_room, String grooming, String toys, String food, String vaccine, String Pet_Type, String Cust_Name, double price_per_week) {
        this.type_of_room = type_of_room;
        this.grooming = grooming;
        this.toys = toys;
        this.food = food;
        this.vaccine = vaccine;
        this.Pet_Type = Pet_Type;
        this.Cust_Name = Cust_Name;
        this.price_per_week = price_per_week;
    }

    // getter and setter
    public String getType_of_room() {
        return type_of_room;
    }

    public void setType_of_room(String type_of_room) {
        this.type_of_room = type_of_room;
    }

    public String getGrooming() {
        return grooming;
    }

    public void setGrooming(String grooming) {
        this.grooming = grooming;
    }

    public String getToys() {
        return toys;
    }

    public void setToys(String toys) {
        this.toys = toys;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getVaccine() {
        return vaccine;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    public String getPet_Type() {
        return Pet_Type;
    }

    public void setPet_Type(String Pet_Type) {
        this.Pet_Type = Pet_Type;
    }

    public String getCust_Name() {
        return Cust_Name;
    }

    public void setCust_Name(String Cust_Name) {
        this.Cust_Name = Cust_Name;
    }

    public double getPrice_per_week() {
        return price_per_week;
    }

    public void setPrice_per_week(double price_per_week) {
        this.price_per_week = price_per_week;
    }

    
}
    