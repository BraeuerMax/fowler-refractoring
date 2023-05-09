package src.Prices;

import src.Rental.Movie;

public class ChildrensPrice implements Price
{
    @Override
    public int getPriceCode()
    {
        return Movie.CHILDRENS;
    }

    @Override
    public double getCharge(final int daysRented)
    {
        if (daysRented > 3)
        {
            return  1.5 + (daysRented - 3) * 1.5;
        }

        return 1.5;
    }

    @Override
    public int getFrequentRenterPoints(final int daysRented)
    {
        return 1;
    }
}