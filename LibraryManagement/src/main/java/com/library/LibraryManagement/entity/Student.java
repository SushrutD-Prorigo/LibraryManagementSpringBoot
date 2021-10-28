package com.library.LibraryManagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_INFORMATION")
public class Student {
	@Id
	@GeneratedValue
	private int studentId;
	private String studentFname;
	private String studentLname;
	private String studentClass;
	
	
	public Student() {
		super();
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentFname() {
		return studentFname;
	}
	public void setStudentFname(String studentFname) {
		this.studentFname = studentFname;
	}
	public String getStudentLname() {
		return studentLname;
	}
	public void setStudentLname(String studentLname) {
		this.studentLname = studentLname;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	@Override
	public String toString() {
		return "Student[ studentFname=" + studentFname + ", studentLname=" + studentLname
				+ ", studentClass=" + studentClass + "]";
	}
	
	

}
