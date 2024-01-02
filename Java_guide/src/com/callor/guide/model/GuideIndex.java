package com.callor.guide.model;

public enum GuideIndex {
	id(0),
	종목명(1),
	순서(2),
	방법(3);
	public int index;
	GuideIndex(int index) {
		this.index = index;
	}
}
