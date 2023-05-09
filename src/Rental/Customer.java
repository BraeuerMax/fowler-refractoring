package src.Rental;

import java.lang.*;
import java.util.*;

class Customer
{
    private String name;
    private Vector rentals = new Vector();

    public Customer (String name)
    {
        this.name = name;
    }

    public void addRental(Rental arg)
    {
        rentals.addElement(arg);
    }

    public String getName ()
    {
        return this.name;
    }

    private int getTotalFrequentRenterPoints()
    {
        int result = 0;
        Enumeration enum_rentals = rentals.elements();

        while (enum_rentals.hasMoreElements())
        {
            Rental each = (Rental) enum_rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }

        return result;
    }

    private double getTotalCharge()
    {
        double result = 0;
        Enumeration enum_rentals = rentals.elements();

        while (enum_rentals.hasMoreElements())
        {
            Rental each = (Rental) enum_rentals.nextElement();
            result += each.getCharge();
        }

        return result;
    }

    public String statement()
    {
        Enumeration enum_rentals = rentals.elements();
        String result = "Rental Record for " + this.getName() + "\n"
                + "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (enum_rentals.hasMoreElements())
        {
            Rental each = (Rental) enum_rentals.nextElement();
            result += "\t" + each.getMovie().getTitle()+ "\t" + "\t"
                    + each.getDaysRented() + "\t" + each.getCharge() + "\n";
        }

        result += "Amount owed is " + getTotalCharge() + "\n"
                + "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
        return result;
    }
}
    