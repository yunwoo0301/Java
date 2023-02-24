package 나머지연산자;
import java.util.Scanner;

// 100의 자리 정수를 입력받아 3개의 변수(100자리/10자리/1의자리)에 대입하기
// 365
// a = 3
// b = 6
// c = 5
public class ModEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int a, b, c;
        a = num / 100; // 100 나눈 몫을 취한다.
        b = (num % 100) / 10;
        c = num % 10;
        System.out.println("100자리 : " + a + ", 10자리 : " + b + ", 1자리 : " + c);

    }
}
