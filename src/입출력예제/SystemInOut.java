package 입출력예제;

public class SystemInOut {
    public static void main(String[] args) {
        String name = "동글이러버";
        String addr = "서울 영등포구";
        char gender = '여'; // 문자일 경우 작은 따옴표('') 참조타입 문자열일 경우 큰 따옴표("")
        int age = 30;
        int kor = 99;
        int eng = 88;
        int mat = 55;
        double aver = 0.0;
        // 자바 스타일 (메소드를 오버로딩 하는 방식)
        System.out.println("======= Java Style Output =======");
        System.out.print("이름 : " + name + "\n"); // 줄바꿈 : "\n"
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("총점 : " + (kor + eng + mat));
        System.out.printf("평균 : " + ((double)((kor + eng + mat)/3)));

        // 서식지정자 : %d, %ld, %u, %f, %.2f, %s, %%, %b
        // 이스케이프시퀀스 : \n(줄바꿈), \r(단어없애는것), \t(탭), \b(백스페이스), \\(슬래시)
        System.out.printf("======= Java Style Output =======\n");
        System.out.printf("이름 : %s\n", name);
        System.out.printf("주소 : %s\n", addr);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("총점 : %d\n", kor + eng + mat);
        System.out.printf("평균 : %.2f\n", (double)(kor + eng + mat)/3); //%.2f(소숫점 2자리까지 찍겠다는 서식)

        }


    }

