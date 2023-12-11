package com.callor.student.exec;

import java.util.ArrayList;
import java.util.List;
// 51~100 랜덤수 10개 생성해서 nums리스트 추가 리스트에서 77찾아서 있으면 몇번째인지 없으면 없음이라 출력

public class ListA {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		
		for(int i = 0 ; i < 10 ; i ++) {
			int num = (int)(Math.random() * 50) + 51;
			nums.add(num);
		}		
		System.out.println(nums);
		
		int size = nums.size();
		for(int i = 0 ; i < size ; i++) {
			if(nums.get(i) == 77) {
				//System.out.printf("있다. %d 번째",i);
			}
		}
		int index = 0;
		for(index = 0 ; index < size ; index++) {
			//if(nums.get(index) == 77) {break;
		
		//}
		}
		if(index < size) {
			System.out.println(index + "번째에서 찾음");
		}else {
			System.out.println("없음");
		}
	}
}
