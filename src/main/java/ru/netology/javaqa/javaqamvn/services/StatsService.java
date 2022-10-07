package ru.netology.javaqa.javaqamvn.services;

public class StatsService {
    // номер месяца, в котором был минимум продаж
    public int NMonthMin(int[] sales) {
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
        for (int x : sales)
            sumSales += x;
        return sumSales;
    }

    public double averageSales(int[] sales) {
        // средняя сумма продаж в месяц

        double average = 0;
        int sumSales = 0;
        for (int sale : sales) {
            sumSales += sale;
            average = sumSales / sales.length;
        }
        return average;
    }


    public int MonthMax(int[] sales) {
        // номер месяца, в котором был пик продаж
        int maxSales = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
            }
        }
        return maxSales;
    }

    public int AmountAverageMax(int[] sales) {

// колическтво месяцев, где продажи выше среднего
        int sumSales = 0;
        for (int sale : sales) {
            sumSales += sale;
        }
        double average = sumSales / sales.length;
        int amountMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                amountMax++;
            }
        }
        return amountMax;
    }

    public int AmountAverageMin(int[] sales) {

// колическтво месяцев, где продажи равно или ниже среднего
        int sumSales = 0;
        for (int sale : sales) {
            sumSales += sale;
        }
        double average = sumSales / sales.length;
        int amountMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= average) {
                amountMin++;
            }
        }
        return amountMin;
    }
}

