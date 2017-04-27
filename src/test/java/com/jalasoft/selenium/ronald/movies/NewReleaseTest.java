package com.jalasoft.selenium.ronald.movies;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * RNew Release movie.
 * @author bsronald on 4/18/17.
 */
public class NewReleaseTest {

    private static final int DAYS_RENTED = 2;
    private Movie batmanVsSuperman;

    /**
     * * Set up environment.
     */
    @BeforeTest
    public void setup() {
        final String newRelease = "Batman vs Superman";
        batmanVsSuperman = new NewReleaseMovie(newRelease);
    }

    /**
     * Calculate amount.
     */
    @Test
    public void testCalculateAmount() {

        final double expected = 6;

        // When
        final double amount = batmanVsSuperman.calculateAmount(DAYS_RENTED);

        // Then
        Assert.assertEquals(amount, expected, "The values are not equals: ");
    }

    /**
     * Calculate Bonus.
     */
    @Test
    public void testCalculateBonus() {

        // When
        final double expectedBonus = 2;
        final double actualBonus = batmanVsSuperman.getFrequentRenterPoint(DAYS_RENTED,
                batmanVsSuperman.getClass().toString());

        // Then
        Assert.assertEquals(actualBonus, expectedBonus, "The bonus are not equals: ");
    }
}
