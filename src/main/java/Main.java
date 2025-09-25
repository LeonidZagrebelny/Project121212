import ru.netology.stats.StatsService;

public class Main {

    public static void main(String[] args) {

        int[] sales;
        sales = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int minMonth;
        minMonth = service.minSales(sales);

        int allSales;
        allSales = service.sumSales(sales);

        int mediumSales;
        mediumSales = service.mediumOfAllSales(sales);

        int maxMonth;
        maxMonth = service.maxSales(sales);

        int lowerMonth;
        lowerMonth = service.lowerMedium(sales);

        int upperMonth;
        upperMonth = service.upperMedium(sales);

        System.out.println("Сумма продаж за все месяцы = " + allSales);
        System.out.println("Среднее значение продаж за 1 месяц = " + mediumSales);
        System.out.println("Максимум продаж - месяц № " + maxMonth);
        System.out.println("Минимум продаж - месяц № " + minMonth);
        System.out.println("количество месяцев, в которых продажи были ниже среднего = " + lowerMonth);
        System.out.println("количество месяцев, в которых продажи были выше среднего = " + upperMonth);
    }
}