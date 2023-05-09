package src.Prices;

import src.Rental.Movie;

public class RegularPrice implements Price
{
    @Override
    public int getPriceCode()
    {
        return Movie.REGULAR;
    }

    @Override
    public double getCharge(int daysRented)
    {
        if (daysRented > 2)
        {
            return (daysRented - 2 ) * 1.5;
        }
        else
        {
            return 2;
        }
    }

    @Override
    public int getFrequentRenterPoints(int daysRented)
    {
        return 1;
    }
}
