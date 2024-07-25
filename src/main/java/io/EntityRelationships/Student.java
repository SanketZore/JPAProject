package io.EntityRelationships;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Column(name="Student_Name",nullable = false)
	private String name;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollNo;
	
	
	@OneToMany(mappedBy="student")
	private List<Course> courseList;
	
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	
	//	@OneToOne(fetch=FetchType.EAGER)
	@OneToOne(fetch=FetchType.LAZY)
	private StudentIdCard card;
	
	
	public StudentIdCard getCard() {
		return card;
	}
	public void setCard(StudentIdCard card) {
		this.card = card;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	

}
