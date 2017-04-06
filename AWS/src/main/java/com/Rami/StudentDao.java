package com.Rami;
public class StudentDao {
	private static Map<Integer,Student>students;
	static {students= new Hashmap<Integer,Student>(){
		put(1,new Student(1,"Rami","Computer science"));
		put(1, new Student(2,"BEN MOHAMED","Maths"));
	}}
	public Collection<studentes> getAllStudents(){
		return this.students.values();
	}
}
