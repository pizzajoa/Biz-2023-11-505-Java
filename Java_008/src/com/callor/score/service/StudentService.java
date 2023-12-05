package com.callor.score.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.StudentDto;
import com.callor.score.utils.Line;

public class StudentService {
	
	private Scanner scan = null;
	private List<StudentDto> students = null;

	public StudentService(String studentFile) {
//		String studentFile = "src/com/callor/score/service/student.txt";
		InputStream is = null;

		try {
			is = new FileInputStream(studentFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan = new Scanner(is);
		students = new ArrayList<>();
	}

	public void loadStudents() {
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] lines = line.split(",");
			StudentDto studentDto = new StudentDto();
			try {
				studentDto.num = lines[0];
				studentDto.name = lines[1];
				studentDto.dept = lines[2];
				studentDto.grade = lines[3];
				studentDto.prof = lines[4];
				studentDto.tel = lines[5];
				studentDto.addr = lines[6];
			} catch (Exception e) {
				System.out.println("데이터 읽는 중 오류 발생");
				System.out.println(line);
				break;
			}
			students.add(studentDto);
		}
	}
	
	public void printstudents() {
		int num = 140;
		Line.dLine(num);
		System.out.println(" 학번\t 이름\t     학과\t학년\t   담임교수\t  전화번호\t\t 주소");
		Line.sLine(num);
		
		for (int i = 0; i < students.size(); i++) {
			StudentDto studentDto = students.get(i);
			System.out.printf(" %s",studentDto.num);
			System.out.printf("%5s",studentDto.name);
			System.out.printf("%9s\t",studentDto.dept);
			System.out.printf("%2s\t",studentDto.grade);
			System.out.printf("%6s\t",studentDto.prof);
			System.out.printf("%13s\t",studentDto.tel);
			System.out.printf("%10s\n",studentDto.addr);
		}
		Line.dLine(num);
	}

}