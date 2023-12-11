package com.callor.student.exec;

import com.callor.student.service.StudentServiceV2;

public class ExecA {
	public static void main(String[] args) {
		StudentServiceV2 stService = new StudentServiceV2();
		stService.inputStudent();
	}
}
