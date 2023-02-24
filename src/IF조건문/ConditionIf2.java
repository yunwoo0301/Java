package IF조건문;

import java.util.Scanner;

// 문자를 입력할 스캐너(클래스 모듈) 객체 생성
// 해당 문자는 대문자, 소문자, 문자가 아님의 조건식 작성
public class ConditionIf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("영문자를 입력하세요 : ");
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + "는 소문자 입니다.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + "는 대문자 입니다.");
        } else {
            System.out.println(ch + "는 영문자가 아닙니다.");
        }
    }
}

