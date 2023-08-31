import java.sql.SQLOutput;

public class prime {
    public static void prime(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
                if (count == 0) {
                    System.out.println("Prime number");
                } else
                    System.out.println("Composite number");
            }

    public static void main(String[] args) {
        int num=6;
        prime(num);
    }
}
