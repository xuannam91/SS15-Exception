package ra.bt01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        hendleAddInteger(scanner);
    }
    private static void hendleAddInteger(Scanner scanner){
        try {
            System.out.println("Hãy nhập lần lượt 2 số a, b");
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("a+b " + (a+b));
        } catch (NumberFormatException | InputMismatchException e){
            System.out.println("đầu vào không đúng định dạng, hãy thử lại");
            hendleAddInteger(scanner);
        }
    }

}
