package ru.netology.javaqa.javaqamvn.services;

public class StatsService {
    // номер месяца, в котором был минимум продаж
    public int nMonthMin(int[] sales) {
        int minSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minSales]) {
                minSales = i;
            }
        }
        return minSales;
    }

    public int getSumSales(int[] sales) {
        // сумма всех продаж

        int sumSales = 0;
        for (int sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    public long averageSales(int[] sales) {
        // средняя сумма продаж в месяц
        int sumSales = getSumSales(sales);
        int average = sumSales / sales.length;

        return average;
    }


    public int monthMax(int[] sales) {
        // номер месяца, в котором был пик продаж
        int maxSales = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
            }
        }
        return maxSales;
    }

    public int amountAverageMax(int[] sales) {

// колическтво месяцев, где продажи выше среднего
        int sumSales = getSumSales(sales);
        double average = averageSales(sales);
        int amountMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                amountMax++;
            }
        }
        return amountMax;
    }

    public int amountAverageMin(int[] sales) {

// колическтво месяцев, где продажи равно или ниже среднего
        int sumSales = getSumSales(sales);
        double average = averageSales(sales);
        int amountMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= average) {
                amountMin++;
            }
        }
        return amountMin;
    }
}

