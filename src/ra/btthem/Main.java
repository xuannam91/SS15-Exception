package ra.btthem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        tinhtoan();
    }
    public static void tinhtoan(){
        try {
            System.out.println("Nhập vào số 1");
            int a = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập vào số 2");
            int b = Integer.parseInt(sc.nextLine());
            System.out.println("cộng: " + (a + b));
            System.out.println("trừ: " + (a - b));
            System.out.println("nhân: " + (a * b));

            try{
                System.out.println("chia: " + (a/b));
            }catch (ArithmeticException e) {
                System.out.println("phep chia b khong the = 0 . vui log nhap lai");
                tinhtoan();
            }

//            if(a==0 || b==0){
//                throw new ArithmeticException("sai");
//
//            }else {
//                System.out.println("chia: " + (a/b));
//            }

        }catch (Exception e){
            System.out.println("Sai định dạng");
            tinhtoan();
        }
    }



}
