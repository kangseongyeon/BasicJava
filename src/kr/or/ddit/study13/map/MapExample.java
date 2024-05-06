package kr.or.ddit.study13.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * HashMap
 * key와 value로 이루어짐
 * key	: 중복 허용하지 않고 순서가 보장되지 않음
 * 
 * Map 타입의 대표 컬렉션
 * 
 * 주요 메소드
 * .put (key, value)	: 데이터 입력 key 값은 중복되지 않음, value는 중복 함수 있음
 * .get (key)			: 입력 받은 value 값은 key 값을 통해 가져올 수 있음
 * .keySet()			: key로 이루어진 hashSet 값을 가져옴
 * .containsKey(key)	: key 값이 있는지 확인
 * 
 * 
 */
public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		map.put("홍길동", 90);
		map.put("이순신", 75);
		map.put("정용주", 84);
		map.put("이성계", 93);
		
		// 이성계 점수 출력하기
//		int scoreLee = map.get("이성계");
//		System.out.println("이성계 점수 : " + scoreLee);
//		
//		// 홍길동 점수 5점 추가하기
//		int scoreHong = map.get("홍길동");
//		map.put("홍길동", scoreHong + 5);
//		
//		// 전체 출력하기
//		Set <String> keySet = map.keySet();
//		Iterator <String> it = keySet.iterator();
//		while (it.hasNext()) {
//			String key = it.next();	// key 값 (String 타입)
//			System.out.println(key+", " + map.get(key));
//		}
		
		// int : 기본 타입 -> class가 아니기 때문에 Object를 int로 바꿀 수 없음
		// Object -> integer로 바꿈 -> int로 바꿈
		// integer : class -> 값이 null인 것이 가능
		// 언박싱 : 래퍼클래스에 있는 타입을 다시 벗기는 과정  
		// 박싱 : 기본 타입 -> 래퍼 타입 
		int score = map.get("홍길동2");	// 홍길동2 값이 없음 -> null이 나옴 -> null을 int로 바꿀 수 없음 -> 오류
	}
}
