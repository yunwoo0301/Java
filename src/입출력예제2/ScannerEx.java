package 입출력예제2;
import java.io.IOException;
import java.util.Scanner;

// 콘솔 입력에 대해
// System.in.read() : 키보드의 입력을 ASCII 코드값으로 읽어들임.
// Scanner 입력 : 키보드의 입력 원하는 데이터 타입으로 반환 받음
public class ScannerEx {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte(); // 키보드의 입력을 byte 형으로 반환
        short b = sc.nextShort();
        int c = sc.nextInt();
        char ch = sc.next().charAt(0); // 문자열에서 첫번째 문자를 추출
        String s1 = sc.next(); // 문자열을 공백 단위로 입력 받음.
        String s2 = sc.nextLine(); // 문자열을 줄바꿈 기준으로 입력 받음.

    }
}
