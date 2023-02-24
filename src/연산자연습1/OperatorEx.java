package 연산자연습1;
// 이항연산자와 삼항연산자
// 산술연산자 : +, -, *, /, %(나머지)
public class OperatorEx {
    public static void main(String[] args) {
        int num1 = 10, num2 = 4;
        System.out.println("+ 연산자 : " + (num1 + num2));
        System.out.println("- 연산자 : " + (num1 - num2));
        System.out.println("* 연산자 : " + (num1 * num2));
        // System.out.println("/ 연산자 : " + ((double)num1 / num2));
        // 몫을 구할 경우 double 형 붙이기
        // System.out.println("% 연산자 : " + (num1 % num2));

        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("값을 0으로 나누면 안됩니다.");
        }
    }
}
