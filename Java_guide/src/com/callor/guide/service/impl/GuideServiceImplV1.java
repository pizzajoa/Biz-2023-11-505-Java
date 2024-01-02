package com.callor.guide.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.guide.exec.Line;
import com.callor.guide.model.GuideDto;
import com.callor.guide.model.GuideIndex;
import com.callor.guide.service.GuideService;

public class GuideServiceImplV1 implements GuideService {

	protected List<GuideDto> guideList = null;
	protected String guideFile = null;

	
	public GuideServiceImplV1(String guideFile) {
		this.guideFile = guideFile;
		this.guideList = new ArrayList<GuideDto>();

	}

	@Override
	public void loadGuide() {
		
		InputStream is = null;
		Scanner fileRead = null;
		try {
			is = new FileInputStream(this.guideFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		fileRead = new Scanner(is);
		while (fileRead.hasNext()) {
			String line = fileRead.nextLine();
			String[] guide = line.split(",");
			GuideDto dto = new GuideDto(
					guide[GuideIndex.id.index], 
					guide[GuideIndex.종목명.index], 
					guide[GuideIndex.순서.index], 
					guide[GuideIndex.방법.index]);
			guideList.add(dto);
		}
		fileRead.close();
		for(GuideDto dto : guideList) {
			 System.out.println(dto);
		 }
	}

	
	@Override
	public void printGuide(GuideDto guideDto) {
		Line.dline(100);
		System.out.printf("%s\n", guideDto.id);
		System.out.printf("%s\n", guideDto.list);
		System.out.printf("%s 회\n", guideDto.SEQ);
		System.out.printf("%s\n", guideDto.Guide);
		Line.dline(100);

	}

}
