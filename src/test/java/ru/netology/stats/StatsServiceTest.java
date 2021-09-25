package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldFindMinSale() {
        StatsService service = new StatsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.findMinSale(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxSale() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.findMaxSale(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindAverageAmount() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.findAverageAmount(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindBelowAverage() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findBelowAverage(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindOverAverage() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findOverAverage(purchases);

        assertEquals(expected, actual);
    }
}
