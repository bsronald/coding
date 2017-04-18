package com.jalasoft.selenium.ronald.movies;

/**
 * @author bsronald on 3/6/17.
 */
public class NewReleaseMovie extends Movie {

    private static final double AMOUNT = 3;

    /**
     * Constructor class.
     *
     * @param title movies's name.
     * @param priceCode price.
     */
    public NewReleaseMovie(final String title, final int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    /**
     * This method calculate amount to pay.
     *
     * @param daysRented number of days rented.
     * @return amount value.
     */
    public double calculateAmount(final int daysRented) {

        return daysRented * AMOUNT;
    }
}
