import ru.netology.javaga.DZ_Java_mvn_2.service.CalcService;

public class Main {
    public static void main(String[] args) {

        CalcService service = new CalcService();

        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);
        System.out.println(" 1. " + expected + " == ? == " + actual);
    }
}