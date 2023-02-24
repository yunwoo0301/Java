package HashMap기본;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// HashMap : 키와 값으로 구성되어 있음. 키의 중복 여부 확인은 HashCode()를 통해서 수행함
// 키의 중복은 허용하지 않음, 값은 중복 가능. 순서를 유지하지 않음.
// 경우에 따라서 HashCode()와 equals() 메소드를 오버라이드 해시 사용해야함.
// HashMap 은 성능이 우수하고 멀티스레드 환경을 지원하지 않음.(동기화 기능 없음)
// HashTable 은 HashMap 과 내부 구조가 동일하며, 멀티스레드를 지원함.
// Properties 는 HashTable 을 상속받아 기능을 제약하여 사용(키와 값이 모두 문자열로만 구성),
// 정보를 파일에 저장하거나 읽기 위한 용도
public class HashMapEx1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("우영우", 99);
        map.put("동그라미", 55);
        map.put("최수연", 95);
        map.put("이준호", 88);
        map.put("동그라미", 96); // 키가 동일하므로 나중의 값이 대체됨
        System.out.println("총 Entry 수 : " + map.size()); // size() : 저장된 키의 총 수

        System.out.println(map.get("동그라미")); // 값이 96으로 대체됨.

        // map 을 순회하는 방법 : 향상된 for 문 사용
        for (String key : map.keySet()) { // 모든 키를 set 객체에 담아서 리턴
            System.out.println(key + " : " + map.get(key));
        }
        // 반복자로 순회하는 방법(iterator) => Map 은 반복자가 없으므로
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) { // 키가 존재하는 지 확인, iterator 의 다음 키 값이 참이면 내부로 들어온다는 뜻
            String key = iterator.next(); // 키를 가져옴
        }
        map.remove("최수연"); // 객체 제거, 키로 Map.Entry 를 제거
        System.out.println("총 Entry 수 : " + map.size());

        // 값을 수정하는 메소드
        map.replace("이준호", 91);

        // Map.Entry 전체 삭제
        map.clear();
        System.out.println("총 Entry 수 : " + map.size());
    }
}
