package ra.bt02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng");
        int arrLength = Integer.parseInt(sc.nextLine());
        int[] arr = new int[arrLength];
        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Mảng rỗng");
        }
//
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max la:" + max);
    }
}
