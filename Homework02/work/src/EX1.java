import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Hãy nhập 1 số tự nhiên: ");
     int number =scanner.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " chia hết cho cả 3 và 5.");
        } else {
            System.out.println(number + " không chia hết cho cả 3 và 5.");
        }
    }
}