package ra;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1. Kiểm tra tính chẵn lẽ của 1 số");
            System.out.println("2. Kiển tra số nguyên tố");
            System.out.println("3. Kiểm tra số đó có chia đết cho 3 không");
            System.out.println("Thoát");
            System.out.println("Lựu chọn của bạn là: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Bạn vừa chọn kiển tra tính chẵn lẻ của 1 số");
                    break;
                case 2:
                    System.out.println("Bản vừa chọn kiểm tra số nguyên tố");
                    break;
                case 3:
                    System.out.println("Bạn vừa chọn kiểm tra số đó có chia hết cho 3 không");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn từ 1 đến 3");
                    break;
            }
        }
    }
