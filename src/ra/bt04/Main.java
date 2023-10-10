package ra.bt04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi");
        String input = sc.nextLine();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            try {
                int n = Integer.parseInt(String.valueOf(input.charAt(i)));
                integerList.add(n);
            } catch (NumberFormatException e){
                System.out.printf("%s không phải là số\n",input.charAt(i));
                integerList.add(0);
            }
        }
        System.out.println(integerList);
    }
}
