package com.callor.student.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.callor.student.models.StIndex;
import com.callor.student.models.StudentDto;

public class StudentServiceImplV2 extends StudentServiceImplV1 {
	protected String stDataFile = null;

	public StudentServiceImplV2() {
		// 두번째 생성자에게 파일의 정보를 전달하는 실행
		this("src/com/callor/student/data/student.txt");
	}

	public StudentServiceImplV2(String stDataFile) { // 문자열 매개변수 있다
		/*
		 * V1의 생성자를 호출하여 키보드 scan을 사용할 수 있도록 준비
		 */
		super();
		this.stDataFile = stDataFile;
		// V2에서는 파일을 load할기 위하여 파일 scan을 사용할 수 있도록 준비
	}

	public void loadStudent() {
		
		Scanner fileScan = null;
		// 파일을 읽기 위한 준비를 하는 곳인데
		InputStream is = null;
		try {
			is = new FileInputStream(stDataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fileScan = new Scanner(is);
		/*
		 * 파일에서 데이터를 읽어서 계속해서 add() 실행하면
		 * 데이터가 계속 쌓이는 현상이 발생한다
		 * load를 할때는 기존의 List를 새로 생성해서 초기화 해야한다
		 */
		students = new ArrayList<StudentDto>();
		// 이미 생성자가 파일을 읽기 위한 준비를 끝낸 상태이기 때문에
		// 이 method에서는 파일을 읽어서 students에 저장만 하면 된다
		
		// student.txt 파일에서 학생정보 읽어오기
		while(fileScan.hasNext()) {
			String line = fileScan.nextLine();
			String[] student = line.split(",");
			
			StudentDto stdDto = new StudentDto();
			stdDto.num = student[StIndex.학번.getIndex()];
			stdDto.name = student[StIndex.이름.getIndex()];
			stdDto.dept = student[StIndex.학과.getIndex()];
			stdDto.grade = student[StIndex.학년.getIndex()];
			stdDto.tel = student[StIndex.전화번호.getIndex()];
			stdDto.addr = student[StIndex.주소.getIndex()];
			students.add(stdDto);
			
		} // end while
		fileScan.close();
		
	}
	/*
	 * students 리스트에 보관중인 학생정보 리스트를 
	 * student.txt 파일에 영구(영속적으로 persistence) 저장하는 method
	 * 
	 */

	public void saveStudent() {
		// 데이터를 저장할 파일을 연결하기 위한 도구
		OutputStream fos = null;
		/* System.cot와 형제간
		 * System.out 에는 print**() method 들이 있고
		 * 이 method 를 사용하여 화면에 메모리 내용을 출력하였다
		 * 
		 * 이 PrintWriter는 OutputStream과 연결되어
		 * print**() method 들을 사용하여 파일에 데이터를 기록할 수 있다(저장하기)
		 */
		PrintWriter fileOut = null;
		try {
			fos = new FileOutputStream(stDataFile); // 어떤 파일에 기록을 할 것인지 연결하는 절차 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 기록할 파일을 PrinterWriter에 연결하기
		fileOut = new PrintWriter(fos); 
		
		/*
		 * PrintWriter가 준비되면
		 * System.out.print**()처럼 같은 방식으로 파일에 "문자열"을 기록할 수 있다
		 */
		for(StudentDto dto : students) {
			fileOut.printf("%s,", dto.num);
			fileOut.printf("%s,", dto.name);
			fileOut.printf("%s,", dto.dept);
			fileOut.printf("%s,", dto.grade);
			fileOut.printf("%s,", dto.tel);
			fileOut.printf("%s\n", dto.addr);
			
			
		}
		/* 파일에 내용 기록이 끝나면 반드시 PrintWriter를 close()해야한다
		 * 이 과정을 생략하면 파일이 계속 열린 상태가 되고
		 * 기록한 내용은 완전 저장되지 않는다
		 * 또한 이 상태의 파일은 삭제도 할 수 없게 된다.
		 * 다만 윈도우를 재 시작하기 전까지
		 */
		
		fileOut.close();
		
	}

}
