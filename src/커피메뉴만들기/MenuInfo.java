package 커피메뉴만들기;

public class MenuInfo implements Comparable { // 정렬하기 위해 Comparable
    String name;  // 메뉴명
    int price;    // 가격
    String group; // 분류
    String desc;  // 설명

    public MenuInfo(String name, int price, String group, String desc) {
        this.name = name;
        this.price = price;
        this.group = group;
        this.desc = desc;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
