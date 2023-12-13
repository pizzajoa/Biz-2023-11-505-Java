package com.callor.student.models;

public enum MenuIndex {
	학생정보입력(1), 학생정보조회(2), 학생정보가져오기(3), 학생정보출력(4);
	
	private int index;
	MenuIndex(int index) {
		this.index = index;
	}
	public int getIndex() {
		return index;
	}

}
