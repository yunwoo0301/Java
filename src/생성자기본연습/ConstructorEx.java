package 생성자기본연습;
// 생성자란? 클래스가 객체로 만들어 질 때 자동으로 호출(new 를 호출할 때)되며,
// 생성자는 인스턴스 필드를 초기화하는 것이 주 목적이다.
// 생성자 만드는 규칙
// 1. 생성자는 클래스 이름과 같아야함.
// 2. 반환 타입이 없고 접근제한자는 올 수 있으나 private 특별한 경우 아니면 사용 안함
// 3. 하나의 클래스는 여러개의 생성자를 가질 수 있으나 단, 오버로딩 생성규칙에 맞아야함.
public class ConstructorEx {
    public static void main(String[] args) {

    }
}

class Car {
    String name; // 인스턴스 필드(name, year, color)
    String year;
    String color;
    public Car() {} // 아무것도 없는(매개변수 X) 생성자
    Car(String name) {
    this. name = name;
    }
    public Car(String name, String year) { // 오버로딩 관계성립
        this.name = name;
        this.year = year;
    }
    public Car(String name, String year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    void getCar() {

    }


}
