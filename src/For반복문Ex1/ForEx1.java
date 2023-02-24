package For반복문Ex1;

import java.util.Scanner;

// for 반복문 : for(초기식;조건식;증감식) { 반복 수행 구간}
public class ForEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 : ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i; // sum = sum + i
        }
        System.out.println("정수의 합은 : " + sum);
    }
    public static int recursiveFunction(int n) {
        if(n == 1) return 1;
        return n + recursiveFunction(n - 1);
    }
}