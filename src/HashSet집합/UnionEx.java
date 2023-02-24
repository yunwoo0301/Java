package HashSet집합;

import HashSet기본.HashSetEx1;

import java.util.Arrays;
import java.util.HashSet;

public class UnionEx {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
        // s1.addAll(s2); // 합집합 : 1 2 3 4 5 6 7 8 9
        // s1.retain(s2); // 교집합 4 5 6
        s1.removeAll(s2); // 차집합 1 2 3
        System.out.println(s1);
    }
}
