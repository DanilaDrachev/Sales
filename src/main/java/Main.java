import ru.netology.javaqa.javaqamvn.services.StatsService;

public class Main {

    public static void main(String[] args) {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int minSales = service.NMonthMin(sales);
        {

            System.out.println(minSales);
        }
    }

}





