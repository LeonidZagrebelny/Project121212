package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {


    // Тестирование суммы продаж за все месяцы
    @Test
    public void sumSalesTest() {

        StatsService service = new StatsService();


        long[] sales;
        sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSumSales = 180;
        long actualSumSales = service.sumSales(sales);

        Assertions.assertEquals(expectedSumSales, actualSumSales);
    }


    // Тестирование среднего количества продаж за 1 месяц
    @Test
    public void mediumOfAllSales() {

        StatsService service = new StatsService();


        long[] sales;
        sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSumSales = 15;
        long actualSumSales = service.sumSales(sales) / 12;

        Assertions.assertEquals(expectedSumSales, actualSumSales);
    }


    //Тестирование номера месяца, в котором был максимум продаж
    @Test
    public void maxSalesTest() {

        StatsService service = new StatsService();


        long[] sales;
        sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 8;
        int actualMinMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }


    //Тестирование номера месяца, в котором был минимум продаж
    @Test
    public void minMothTesy() {

        StatsService service = new StatsService();


        long[] sales;
        sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }


    //Тестирование количества месяцев, в которых продажи были ниже среднего
    @Test
    public void lowerMediumTesy() {

        StatsService service = new StatsService();


        long[] sales;
        sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedLowerMonth = 5;
        int actualLowerMonth = service.lowerMedium(sales);

        Assertions.assertEquals(expectedLowerMonth, actualLowerMonth);
    }


    //Количества месяцев, в которых продажи были выше среднего
    @Test
    public void upperMediumTest() {

        StatsService service = new StatsService();


        long[] sales;
        sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedUpperMonth = 5;
        int actualUpperMonth = service.lowerMedium(sales);

        Assertions.assertEquals(expectedUpperMonth, actualUpperMonth);
    }


}
