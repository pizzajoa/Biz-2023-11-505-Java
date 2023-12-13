package com.callor.student.exec;

import com.callor.student.models.StIndex;
import com.callor.student.models.StdIndex;

public class StudentExC {

	public static void main(String[] args) {

		System.out.println(StIndex.학번.getIndex());
		System.out.println(StIndex.이름.getIndex());

		StIndex[] indexArray = StIndex.values();
		for (int i = 0; i < indexArray.length; i++) {
		}
		for (StIndex item : indexArray) {
			System.out.printf("%d, %s\n", item.getIndex(), item);
		}

	}

}
