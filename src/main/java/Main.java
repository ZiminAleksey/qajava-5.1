import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService method = new SQRService();
        int count = method.squaring(9801, 9802);
        System.out.println(count);
    }
}
