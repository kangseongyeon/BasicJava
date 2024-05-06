/* package kr.or.ddit.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HomeWork19 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HomeWork19 obj = new HomeWork19();
        obj.process();
    }

    public void process() {
        List<Map<String, Object>> parkList = inputDate();
//        Map<String, Integer> parkTimeMap = parkTime(parkList);
//        Map<String, Integer> parkPayMap = parkPay(parkTimeMap);

        parkPay(parkTime(parkList));
    }

    // 3. 요금 계산하기
//  public Map<String, Integer> parkPay(Map<String, Integer> parkTime) {
    public void parkPay(Map<String, Integer> parkTime) {    	
//        Map<String, Integer> parkPayMap = new HashMap<>();

        // 기본 시간 (분), 기본 요금 (원), 단위 시간 (분), 단위 요금 (원)
        int fee = 0;
        int basicTime = 180;
        int basicFee = 5000;
        int unitTime = 10;
        int unitFee = 600;
        
        Set<String> keySet = parkTime.keySet();
        for (String key : keySet) {
            if (parkTime.get(key) < basicTime) System.out.println("차량번호 : " + key + "\t 요금 : " + fee + "원");
            else {
            	fee = (parkTime.get(key) - basicTime) / unitTime * unitFee + basicFee;
            	System.out.println("차량번호 : " + key + "\t 요금 : " + fee + "원");
            }
        }
//        return parkPayMap;
    }

    // 2. 차량별 주차 시간 구하기
    public Map<String, Integer> parkTime(List<Map<String, Object>> parkList) {
    	Map<String, Integer> parkIn = new HashMap<String, Integer>();
    	Map<String, Integer> parkOut = new HashMap<String, Integer>();
    	Map<String, Integer> parkTimeMap = new HashMap<String, Integer>();

        for (Map<String, Object> map : parkList) {
        	String carNumber = (String) map.get("차량번호");
            int parkingTime = getMin((String) map.get("시각"));
            String list = (String) map.get("내역");
            
            if (list.equals("입차")) parkIn.put(carNumber,parkingTime);
            else if (list.equals("출차"))  {
            	parkOut.put(carNumber,parkingTime);
            	if (parkTimeMap.containsKey(carNumber)) {
            		int totalParkingTime = parkTimeMap.get(carNumber);
            		parkTimeMap.put(carNumber, parkOut.get(carNumber) - parkIn.get(carNumber) + totalParkingTime);
            	} else {
            		parkTimeMap.put(carNumber, parkOut.get(carNumber) - parkIn.get(carNumber));
            	}
            }
        }
        return parkTimeMap;
    }
    
    public int getMin(String time) {
        String[] tokens = time.split(":");
        int hour = Integer.parseInt(tokens[0]);
        int min = Integer.parseInt(tokens[1]);
        return hour * 60 + min;
    }
    
	// 1. 데이터 넣기
	public List<Map<String, Object>> inputDate() {
		// 시각 차량번호 내역
		// 05:34 5961 입차
		// 06:00 0000 입차
		// 06:34 0000 출차
		// 07:59 5961 출차
		// 07:59 0148 입차
		// 18:59 0000 입차
		// 19:09 0148 출차
		// 22:59 5961 입차
		// 23:00 5961 출차
		// 23:00 0000 출차
		Map<String, Object> park1 = new HashMap();
		park1.put("시각", "05:34");
		park1.put("차량번호", "5961");
		park1.put("내역", "입차");

		Map<String, Object> park2 = new HashMap();
		park2.put("시각", "06:00");
		park2.put("차량번호", "0000");
		park2.put("내역", "입차");

		Map<String, Object> park3 = new HashMap();
		park3.put("시각", "06:34");
		park3.put("차량번호", "0000");
		park3.put("내역", "출차");

		Map<String, Object> park4 = new HashMap();
		park4.put("시각", "07:59");
		park4.put("차량번호", "5961");
		park4.put("내역", "출차");

		Map<String, Object> park5 = new HashMap();
		park5.put("시각", "07:59");
		park5.put("차량번호", "0148");
		park5.put("내역", "입차");

		Map<String, Object> park6 = new HashMap();
		park6.put("시각", "18:59");
		park6.put("차량번호", "0000");
		park6.put("내역", "입차");

		Map<String, Object> park7 = new HashMap();
		park7.put("시각", "19:09");
		park7.put("차량번호", "0148");
		park7.put("내역", "출차");

		Map<String, Object> park8 = new HashMap();
		park8.put("시각", "22:59");
		park8.put("차량번호", "5961");
		park8.put("내역", "입차");

		Map<String, Object> park9 = new HashMap();
		park9.put("시각", "23:00");
		park9.put("차량번호", "5961");
		park9.put("내역", "출차");

		Map<String, Object> park10 = new HashMap();
		park10.put("시각", "23:00");
		park10.put("차량번호", "0000");
		park10.put("내역", "출차");

		List<Map<String, Object>> list = new ArrayList();
		list.add(park1);
		list.add(park2);
		list.add(park3);
		list.add(park4);
		list.add(park5);
		list.add(park6);
		list.add(park7);
		list.add(park8);
		list.add(park9);
		list.add(park10);

		return list;

	}
}

*/

package kr.or.ddit.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HomeWork19 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork19 obj = new HomeWork19();
		obj.process();
	}

	public void process() {
		List<Map<String, Object>> parkList = inputDate();
	}

	// 3. 요금 계산하기
	public Map<String, Integer> parkPay(Map<String, Integer> parkTime) {

		// 기본 시간 (분), 기본 요금 (원), 단위 시간 (분), 단위 요금 (원)
		int time = 200;
		int pay = 0;
		if (time <= 10) pay = 5000;
		else pay = 5000 + (time + 9 - 180) / 10 * 600;
		
		return null;
	}

	// 2. 차량별 주차 시간 구하기
	// sol 1
/*	 public Map<String,Integer> parkTime(List<Map<String, String>> parkList) {
	    	Map<String, Integer> resultMap = new HashMap<String, Integer>();
	    	Map<String, String> temp = new HashMap<String, String>();
	    	
	    	for (Map<String, String> map : parkList) {
	    		String time = map.get("시각");
	    		String carNum = map.get("차량번호");
	    		String inout = map.get("내역");
	    		
	    		if (temp.containsKey(carNum)) {
	    			String intime = temp.remove(carNum);
	    			int parkTime = getMin(time) - getMin(intime);
	    			if (resultMap.containsKey(carNum)) parkTime += resultMap.get(carNum);
	    			resultMap.put(carNum,parkTime);
	    		} else {
	    			temp.put(carNum, time);
	    		}
	    	}
	    	
	    	return resultMap;
	    }
*/

	// sol 2
	public Map<String, Integer> parkTime(List<Map<String, String>> parkList) {
		Map<String, Integer> resultMap = new HashMap<String, Integer>();
		Set<String> carNumSet = new HashSet();

		for (Map<String, String> map : parkList) {
			String carNum = map.get("차량 번호");
			carNumSet.add(carNum);
		}

		Iterator<String> it = carNumSet.iterator();
		while (it.hasNext()) {
			String carNum = it.next();
			int parkTime = parkTime(parkList, carNum);
			resultMap.put(carNum, parkTime);
		}

		return resultMap;
	}

	public int parkTime(List<Map<String, String>> parkList, String car) {
		Map<String, Integer> resultMap = new HashMap<String, Integer>();

		int sum = 0;
		String inTime = null;

		for (Map<String, String> map : parkList) {
			String time = map.get("시각");
			String carNum = map.get("차량번호");
			String inout = map.get("내역");

			if (!carNum.equals(car))
				continue;

			if (inout.equals("인차")) {
				inTime = time;
			} else {
				int parkTime = getMin(time) - getMin(inTime);
				sum += parkTime;
				inTime = null;
			}

		}
		return sum;
	}

	public int getMin(String time) {
		String[] tokens = time.split(":");
		int hour = Integer.parseInt(tokens[0]);
		int min = Integer.parseInt(tokens[1]);
		return hour * 60 + min;
	}

	// 1. 데이터 넣기
	public List<Map<String, Object>> inputDate() {
/*		 시각 차량번호 내역
		 05:34 5961 입차
		 06:00 0000 입차
		 06:34 0000 출차
		 07:59 5961 출차
		 07:59 0148 입차
		 18:59 0000 입차
		 19:09 0148 출차
		 22:59 5961 입차
		 23:00 5961 출차
		 23:00 0000 출차 */
		Map<String, Object> park1 = new HashMap();
		park1.put("시각", "05:34");
		park1.put("차량번호", "5961");
		park1.put("내역", "입차");

		Map<String, Object> park2 = new HashMap();
		park2.put("시각", "06:00");
		park2.put("차량번호", "0000");
		park2.put("내역", "입차");

		Map<String, Object> park3 = new HashMap();
		park3.put("시각", "06:34");
		park3.put("차량번호", "0000");
		park3.put("내역", "출차");

		Map<String, Object> park4 = new HashMap();
		park4.put("시각", "07:59");
		park4.put("차량번호", "5961");
		park4.put("내역", "출차");

		Map<String, Object> park5 = new HashMap();
		park5.put("시각", "07:59");
		park5.put("차량번호", "0148");
		park5.put("내역", "입차");

		Map<String, Object> park6 = new HashMap();
		park6.put("시각", "18:59");
		park6.put("차량번호", "0000");
		park6.put("내역", "입차");

		Map<String, Object> park7 = new HashMap();
		park7.put("시각", "19:09");
		park7.put("차량번호", "0148");
		park7.put("내역", "출차");

		Map<String, Object> park8 = new HashMap();
		park8.put("시각", "22:59");
		park8.put("차량번호", "5961");
		park8.put("내역", "입차");

		Map<String, Object> park9 = new HashMap();
		park9.put("시각", "23:00");
		park9.put("차량번호", "5961");
		park9.put("내역", "출차");

		Map<String, Object> park10 = new HashMap();
		park10.put("시각", "23:00");
		park10.put("차량번호", "0000");
		park10.put("내역", "출차");

		List<Map<String, Object>> list = new ArrayList();
		list.add(park1);
		list.add(park2);
		list.add(park3);
		list.add(park4);
		list.add(park5);
		list.add(park6);
		list.add(park7);
		list.add(park8);
		list.add(park9);
		list.add(park10);

		return list;

	}
}