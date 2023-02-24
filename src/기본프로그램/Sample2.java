package 기본프로그램;

import java.util.Scanner;

// 상수란? 변수와 마찬가지로 데이터를 저장할 수 있는 메모리 공간을 의미함
// 변수와 다른 점은 프로그램이 실행되는 동안 값이 변경이 안됨
// 자바에서 상수는 final 키워드로 정의하고, 단 한 번만 값을 설정할 수 있음
// 상수 선언 시 관례 상 변수를 대문자로 써야함
public class Sample2 {
    public static void main(String[] args) {
        final double taxRate = 0.10; // 세율은 고정되어야하는 값(상수)이므로 final 을 붙여야함
        Scanner sc = new Scanner(System.in);
        System.out.print("수입을 입력하세요 : ");
        int income = sc.nextInt();
        System.out.println("당신이 내야할 세금은" + income * taxRate );


    }
}
