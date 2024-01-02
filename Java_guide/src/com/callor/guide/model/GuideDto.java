package com.callor.guide.model;

public class GuideDto extends Object {
	public String id;
	public String list;
	public String SEQ;
	public String Guide;

	public GuideDto() {

	}

	public GuideDto(String id,String list,String SEQ,String Guide ) {
		super();
		this.id = id;
		this.list = list;
		this.SEQ = SEQ;
		this.Guide = Guide;
	}

	@Override
	public String toString() {
		return id + list +  SEQ + Guide;
	}
	

}
