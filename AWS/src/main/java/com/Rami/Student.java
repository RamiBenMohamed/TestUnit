package com.Rami;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Student {
	private int id;
	private String name;
	private String cours;
	public Student(){}
	public Student(int id,String name,String cours){
		this.id =id;
		this.name=name;
		this.cours=cours;
	}
	
	public int getId(){
		return this.id;
	}
		this.id=id;
	}
	public setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	
	public setCours(String cours){
		this.cours=cours;
	}
	public String getCours(){
		return this.cours;
	}
}
