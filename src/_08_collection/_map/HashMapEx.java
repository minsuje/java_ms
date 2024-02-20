package _08_collection._map;

// Map
// - 'Key' , 'Value' 로 구성된 'entry' 객체를 저장
// - 키는 중복 저장할 수 없지만, 값은 중복 저장 가능
// - 기존에 저장된 키와 동일한 키로 값을 저장하면 기존의 값은 없어지고 새로운 값으로 대체 됨

// HashMap
// - 키로 사용할 객체가 'hashCode()' 메소드의 리턴값이 같고, 'equals()' 메소드가 true 를 리턴할 경우, 동일 키로 보고 중복 저장을 허용하지 않음

// HashTable
// - HashMap 이랑 동일한 내부 구조를 가짐
// - 동기화된 메소드로 구성되어 있어 멀티 스레드가 동시에 Hashtable 메소드들을 실행할 수 없음
// - 즉, 멀티스레드 환경에서 안전하게 객체 추가, 삭제 가능

// Properties
// - Hashtable 의 자식 클래스로 Hashtable 특징을 그대로 가짐
// - 키와 값을 String 타입으로 제한한 컬렉션
// - 주로 확장자가 '.properties' 인 프로퍼티 파일 읽을 때 사용함 , => spring 에서 확인가능
// - 프로퍼티 파일 : 키와 값이 '=' 기호로 연결되어 있는 텍스트 파일

// TreeMap
// - 검색 기능을 강화시킨 컬렉션
// - 이진 트리를 기반으로 한 Map 컬렉션
// - Entry 저장 시 키를 기준으로 자동 정렬
// - 부모 키 값과 비교해서 낮은 것은 왼쪽, 높은 것은 오른쪽 자식 노드에 저장
// 주의!  검색 관련 메소드는 TreeMap 에만 정의되어 있어 Map 타입 보다는 TreeMap 타입으로 선언하는 것이 좋음

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map<E> TreeMap = new TreeMap<>(); ( X )
    TreeMap<E> treeMap = new TreeMap<>(); ( O )
 */
public class HashMapEx {
    public static void main(String[] args) {
        // 키가 id, 값은 name 인 HashMap 예제

        // Map 컬렉션 생성
        Map<Integer, String> map = new HashMap<>();

        // 객체 저장
        map.put(1001,"홍길동");
        map.put(1002, "성춘향");
        map.put(1003,"김범");
        map.put(1004, "조의문");

        // 전체 객체 수
        System.out.printf(" 총 %d의 학생이 있습니다. %n%n" , map.size());

        // Key 로 값 얻기
        int key = 1003;
        String value = map.get(key);
        System.out.printf("%d의 해당하는 학생은 %s 입니다. %n%n" , key, value);

        // entrySet() : 키와 값으로 구성된 모든 Map.Entry 객체를 Set 에 담아서 리턴
        Set<Map.Entry<Integer, String>> entrySet =  map.entrySet();
        System.out.println(entrySet); // [1001=홍길동, 1002=성춘향, 1003=김범, 1004=조의문]
        System.out.println();

        Iterator<Map.Entry<Integer, String>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()){
            Map.Entry<Integer, String> entry = entryIterator.next();
            Integer k = entry.getKey();
            String v = entry.getValue();
            System.out.printf("%s 학생은 %d 번 입니다. %n" , v, k);
        }
        // 키 set 컬렉션을 얻고, 반복해서 키와 값 얻기
        Set<Integer> keySet = map.keySet();
        System.out.println(keySet); // [1001, 1002, 1003, 1004]

        // 주어진 키와 일치하는 entry 삭제
        String deletedValue = map.remove(key);
        System.out.printf("%s 학생이 삭제 되었습니다. %n", deletedValue);
    }

}
