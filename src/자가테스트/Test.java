package 자가테스트;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        final double taxRate = 0.10;
        Scanner sc = new Scanner(System.in);
        System.out.print("수입을 입력하세요 : ");
        int income = sc.nextInt();
        System.out.println("당신이 내야할 세금은" + income * taxRate);


    }
}

