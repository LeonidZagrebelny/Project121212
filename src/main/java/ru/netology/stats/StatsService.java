package ru.netology.stats;

public class StatsService {


    // Сумма продаж за все месяцы
    public long sumSales(long[] sales) {


        long allSales = 0; // сумма продаж pа все месяцы

        for (int i = 0; i < sales.length; i++) {

            allSales = allSales + sales[i];

        }

        return allSales;
    }


    // Максимум продаж за 1 месяц
    public int maxSales(long[] sales) {


        int maxMonth = 0; // номер месяца с максимальными продажами

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i; // запомним его как максимальный
            }


        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    // Миниумм продаж за месяц
    public int minSales(long[] sales) {


        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ран

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }


        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    //количество месяцев, в которых продажи были ниже среднего
    public int lowerMedium(long[] sales) {


        long medSales = sumSales(sales);
        int lowerMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < medSales / 12) {
                lowerMonth = lowerMonth + 1; // запомним его как максимальный
            }


        }

        return lowerMonth; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    //Количества месяцев, в которых продажи были выше среднего
    public int upperMedium(long[] sales) {

        long medSales = sumSales(sales);
        int upperMonth = 0; // номер месяца с максимальными продажами


        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > medSales / 12) {
                upperMonth = upperMonth + 1; // запомним его как максимальный
            }


        }

        return upperMonth; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


}
