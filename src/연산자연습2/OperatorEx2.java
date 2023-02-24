package 연산자연습2;
// 대입연산자 : 값을 변수에 대입할 때 사용, 대입은 항상 뒤에서 앞으로 일어남
// 복합대입연산자 : 연산 후 대입
// 증감연산자 : 값을 1증가하거나 감소 시키는 연산자(단항 연산자)
// 후위와 전위에 따라 상황이 달라짐
public class OperatorEx2 {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1++);
        System.out.println(num1);
        //++num : 전위연산자(1증가 후 대입시킴) 11
        //num++ : 후위연산자(먼저 대입 후 1증가 시킴) 10

    }
}
