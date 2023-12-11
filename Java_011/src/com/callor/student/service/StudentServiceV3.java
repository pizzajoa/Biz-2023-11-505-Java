package com.callor.student.service;

import java.util.Scanner;

import com.callor.student.models.StudentDto;

public class StudentServiceV3 {
	private Scanner scan = null;

	public StudentServiceV3() {
		scan = new Scanner(System.in);

	}

	public boolean inputStudent() {
		boolean result = true;
		while(result) {
			result = inputStudent();
			
		}
		
		System.out.println("학번을 입력하세요");
		String stdNum = scan.nextLine();

		System.out.println("이름을 입력하세요");
		String stdName = scan.nextLine();

		System.out.println("학과를 입력하세요");
		String stdDept = scan.nextLine();

		System.out.println("학년을 입력하세요");
		String stdGrade = scan.nextLine();

		System.out.println("전화번호를 입력하세요");
		String stdTel = scan.nextLine();

		System.out.println("주소를 입력하세요");
		String stdAddr = scan.nextLine();

		StudentDto studentDto = new StudentDto();
		System.out.println("학번 중복 다시 입력해 주세요");

		studentDto.num = stdNum;
		studentDto.name = stdName;
		studentDto.dept = stdDept;
		studentDto.grade = stdGrade;
		studentDto.tel = stdTel;
		studentDto.addr = stdAddr;
		return result;
	}
 
}
