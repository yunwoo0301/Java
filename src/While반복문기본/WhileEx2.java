package While반복문기본;

import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 : ");
        int num = sc.nextInt();
        int sum = 0;
        while(num > 0) {
            sum += num; // sum = sum + num
            num--;
        }
        System.out.println("정수의 합은 : " + sum);

    }
}
