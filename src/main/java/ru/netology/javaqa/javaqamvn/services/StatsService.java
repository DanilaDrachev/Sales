package ru.netology.javaqa.javaqamvn.services;

public class StatsService {
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
        int sumSales = 0;
            for (int x : sales)
                sumSales += x;
            return sumSales;
        }

    public double averageSales(int[] sales) {
        double average = 0;
        int sumSales = 0;
            for (int j = 0; j < sales.length; j++) {
                sumSales += sales[j];
                average = sumSales / sales.length;}
                return average;
            }


        public int MonthMax( int[] sales) {
            int maxSales = sales[0];
            for (int i = 0; i < sales.length; i++) {
                if (sales[i] > maxSales) {
                    maxSales = sales[i];
                }
            }
                return maxSales;
            }

      }