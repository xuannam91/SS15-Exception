package ra.bt02;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài phần tử của mảng");
        int arrLength = Integer.parseInt(sc.nextLine());
        int []arr = new int[arrLength];


        try {
            for (int i = 0; i < arrLength; i++) {
                arr[i] = Integer.parseInt(sc.nextLine());
            }

            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("max la:" + max);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Mảng rỗng");
//            throw new ArrayIndexOutOfBoundsException("Mảng rỗng");
        }

    }
}
