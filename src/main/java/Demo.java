import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println(Math.max(10, 30));
        System.out.println(Math.min(10, 30));
        System.out.println(Math.abs(-30));

        String str = "100";
        int i = Integer.parseInt(str);
        String str2 = String.valueOf(i);

        Random random = new Random();
        // 0 ~ bound
        int rand = random.nextInt(100);
        System.out.println(rand);

        Scanner scanner = new Scanner(System.in);
        String scan = scanner.next();
        // int ii = scanner.nextInt();
        // long l = scanner.nextLong();

        switch (scan) {
            case "a":
                System.out.println("aa");
                break;
            case "b":
                System.out.println("bb");
                break;
            default:
                System.out.println("??");
        }

        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }

        int k = 0;
        while (k < 10) {
            System.out.println(k);
            k++;
        }
    }
}
