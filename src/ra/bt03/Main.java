package ra.bt03;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            System.out.println(" Nhâp độ dài");
            int arrlength = Integer.parseInt(sc.nextLine());
            Object[] arr = new Object[arrlength];
            if (arr.length == 0) {
                System.out.println("Độ dài phải lớn hơn 0");
                main(args);
            } else {
                int sum = 0;
                String str = "";
                for (int i = 0; i < arrlength; i++) {
                    arr[i] = sc.nextLine();
                }
                for (int i = 0; i < arr.length; i++) {
                    try {
                        int num = Integer.parseInt((String) arr[i]) ;
                        sum += num;
                    } catch (NumberFormatException e) {
                        System.out.println("Không hợp lệ");


                    }
                }
                System.out.println(sum);


            }
        } catch (NegativeArraySizeException e) {
            System.out.println("Nhập sai kích thước của mảng");
            main(args);
        }
    }





}

