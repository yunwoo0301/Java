package 주사위게임;
// 주사위 2개 던져서 합 12이면 탈출하는 게임
public class RandomGame {
    public static void main(String[] args) {
        int rand1, rand2;
        int cnt = 0; // 총 몇번 만에 탈출하는지 확인이 필요할 경우
        while (true) {
            cnt++;
            rand1 =(int)((Math.random() * 6 ) + 1); // Math.random() 임의의 숫자 생성(난수) 0.0 부터 시작하므로 + 1
            rand2 =(int)((Math.random() * 6 ) + 1); // 랜덤함수는 실수형으로 값이 생성되므로 형변환이 필요함.
            if((rand1 + rand2) == 12) {
                System.out.printf("무인도를 %d 번 만에 탈출 합니다.\n", cnt);
                break;
            } else {
                System.out.println("주사위의 합이 " + (rand1 + rand2) + "입니다.");
            }
        }
    }
}
