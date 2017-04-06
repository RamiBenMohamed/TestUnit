package com.Rami;
public class StudentController {
	private StudentService studentService;
	public Collection <Student>getAllStudents(){
		return studentService.getAllStudents();
	}

}
