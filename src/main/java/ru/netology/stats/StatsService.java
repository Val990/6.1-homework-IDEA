package ru.netology.stats;

public class StatsService {

    public int findMinSale(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findMaxSale(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int findAverageAmount(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int findBelowAverage(int[] sales) {
        int countBelowAverage = 0;
        int averageAmount = calculateSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale < averageAmount) {
                countBelowAverage++;
            }
        }
        return countBelowAverage;
    }

    public int findOverAverage(int[] sales) {
        int countOverAverage = 0;
        int averageAmount = calculateSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale > averageAmount) {
                countOverAverage++;
            }
        }
        return countOverAverage;
    }
}



