package 변수의생존범위;

public class ScopeData {
    public static void main(String[] args) {
        int value = 20; // 지역변수(생성과 소멸이 자동으로 이루어짐)
        int m = 0;
        if(value > 10) {
            m = value - 10; // 오른쪽 연산 후 결과값을 왼쪽에 대입
        }
        System.out.println(m);

    }
}
