/* Asadur Rahman (SUKD1702099)
 * Dibakar Sutra Dhar ()
 * Nandita Dhanda ()
 * Abdourahmane Diallo ()
 * Mohamed Abdellah Abdelhag ()
 * Ahmed Aref Ahmed ()
 */

package pet.hotel.system;

import java.io.*;
/**
 *
 * @author Asadur Rahman
 */
public class InfoOnBooking implements Serializable
{
    
    private String Cust_Name, Pet_Name, Pet_Type, Breed;
    private String type_of_room, Arrival_date, Departure_date;
    private double price_per_week;

    // Constructor
    public InfoOnBooking(String Cust_Name, String Pet_Name, String Pet_Type, String Breed, String type_of_room, String Arrival_date, String Departure_date, double price_per_week) {
        this.Cust_Name = Cust_Name;
        this.Pet_Name = Pet_Name;
        this.Pet_Type = Pet_Type;
        this.Breed = Breed;
        this.type_of_room = type_of_room;
        this.Arrival_date = Arrival_date;
        this.Departure_date = Departure_date;
        this.price_per_week = price_per_week;
    }
    
    // getter and setter
    public String getCust_Name() {
        return Cust_Name;
    }

    public void setCust_Name(String Cust_Name) {
        this.Cust_Name = Cust_Name;
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

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String Breed) {
        this.Breed = Breed;
    }

    public String getType_of_room() {
        return type_of_room;
    }

    public void setType_of_room(String type_of_room) {
        this.type_of_room = type_of_room;
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

    public double getPrice_per_week() {
        return price_per_week;
    }

    public void setPrice_per_week(double price_per_week) {
        this.price_per_week = price_per_week;
    }
    
    
}

