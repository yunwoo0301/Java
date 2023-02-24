package 입출력예제2;
import java.io.IOException;
// 콘솔 입력에 대하여
// System.in.read() : 키보드의 입력을 ASCII 코드값으로 읽어들임
public class ScannerEx2 {
    public static void main(String[] args) {
        while (true) {
            try{
                int ketCode = System.in.read();
                System.out.println("ketCode : " + ketCode);
               if(ketCode == 'q'); break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
