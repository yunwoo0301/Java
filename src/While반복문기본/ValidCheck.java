package While반복문기본;
import java.util.Scanner;
// 반복문을 이용해서 유효값 체크하기
public class ValidCheck {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);  // while 문 내 입력 시 무한 입력 생성됨
        while (true) {
            System.out.print("나이를 입력하세요 : ");
            age = sc.nextInt();
            if(age > 0 && age < 200) break; // 임의의 조건
            System.out.println("나이를 잘못 입력하였습니다.");
        }
        System.out.println("입력하신 나이는 " + age + "입니다.");

    }
}
