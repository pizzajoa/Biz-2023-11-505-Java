package com.callor.student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.model.StudentDto;

public class StudentA {
	private Scanner scan = null;
	private List<StudentDto> students = null;

	public StudentA() {
		String dataFile = "src/com/callor/student/data.txt";
		InputStream is = null;
		try {
			is = new FileInputStream(dataFile);
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
				studentDto.tel = lines[4];
				studentDto.addr = lines[5];
			} catch (Exception e) {
				System.out.println("데이터가 없습니다");
				System.out.println(line);
				break;
			}
			students.add(studentDto);
		}
	}

}
