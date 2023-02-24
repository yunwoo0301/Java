package 변수와데이터;

public class DataType {
    public static void main(String[] args) {
        int num1, num2; // 같은 타입으로 여러개의 변수를 선언, 콤마(,)로 구분
        double num3 = 3.14; // 실수 타입의 변수를 선언과 동시에 초기화
        int hour = 3;
        int minute = 5;
        System.out.println(hour + "시" + minute + "분");
        NameCard nameCard = new NameCard();
        nameCard.name = "정동글";
        nameCard.age = 20;
        nameCard.address = "서울시 영등포구";
        nameCard.email = "browniris7@naver.com";
        nameCard.phoneNumber = "010-0000-0000"; // 숫자를 문자형으로 표현하기위해 String 사용
        System.out.println(nameCard.name);

    }
}
class NameCard {
    String name;
    int age;
    String address;
    String email;
    String phoneNumber;
}
