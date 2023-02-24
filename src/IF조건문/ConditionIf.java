package IF조건문;
// 정수를 입력할 스캐너(클래스 모듈) 생성
// 해당 정수는 100 > n, 100 = n, 100 < n
import java.util.Scanner;

public class ConditionIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int number = sc.nextInt(); // 키보드 입력을 정수형 변수에 담음

        if (number > 100) {
            System.out.println(number + "는 100보다 큽니다.");
        } else if (number < 100) {
            System.out.println(number + "는 100보다 작습니다.");
        } else {
            System.out.println(number + "는 100과 같습니다.");
        }

    }
}

