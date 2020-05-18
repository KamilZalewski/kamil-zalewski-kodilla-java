package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country germany = new Country("Germany", new BigDecimal("83000000"));
        Country spain = new Country("Spain", new BigDecimal("47000000"));
        Country greatBritain = new Country("Great Britain", new BigDecimal("66000000"));
        Country sweden = new Country("Sweden", new BigDecimal("10000000"));

        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(spain);
        europe.addCountry(greatBritain);
        europe.addCountry(sweden);

        Country china = new Country("China", new BigDecimal("1420000000"));
        Country india = new Country("India", new BigDecimal("1300000000"));
        Country japan = new Country("Japan", new BigDecimal("130000000"));
        Country pakistan = new Country("Pakistan", new BigDecimal("180000000"));
        Country russia = new Country("Russia", new BigDecimal("140000000"));

        Continent asia = new Continent("Asia");
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(japan);
        asia.addCountry(pakistan);
        asia.addCountry(russia);

        Country usa = new Country("USA", new BigDecimal("308000000"));
        Country canada = new Country("Canada", new BigDecimal("34000000"));
        Country mexico = new Country("Mexico", new BigDecimal("108000000"));
        Country salvador = new Country("Salvador", new BigDecimal("7000000"));
        Country cuba = new Country("Cuba", new BigDecimal("13000000"));


        Continent northAmerica = new Continent("NorthAmerica");
        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(mexico);
        northAmerica.addCountry(salvador);
        northAmerica.addCountry(cuba);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(northAmerica);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        BigDecimal expectedResult = new BigDecimal("3884000000");
        Assert.assertEquals(expectedResult, result);
    }
}
