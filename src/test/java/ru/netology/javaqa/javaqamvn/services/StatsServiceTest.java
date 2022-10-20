package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void SalesMin() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 8;
        int actualSales = service.NMonthMin(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }


    @Test
    public void SumSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 180;
        int actualSales = service.getSumSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void AverageAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSales = 15;
        long actualSales = service.averageSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void MonthMaximum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expectedSales = 20;
        double actualSales = service.MonthMax(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void AmountMonthsMax() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expectedSales = 5;
        int actualSales = service.AmountAverageMax(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void AmounMonthsMin() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expectedSales = 7;
        int actualSales = service.AmountAverageMin(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }
}


