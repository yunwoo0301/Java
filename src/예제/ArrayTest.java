package 예제;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] burger = new int[3];
        int[] drink = new int[2];

        for (int i = 0; i < burger.length; i++) {
            burger[i] = sc.nextInt();
            for (int j = 0; j < drink.length; j++) {
                drink[j] = sc.nextInt();

                Arrays.sort(burger);
                Arrays.sort(drink);
                System.out.println(burger[0] + drink[0] - 50);
            }
        }
    }
}



