package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {121, 51, 81, 41, 51, 31, 81, 61, 111, 112, 124};
        long expected = 124;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}