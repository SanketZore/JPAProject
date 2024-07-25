package io.EntityRelationships;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class StudentIdCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cardNumber;
	
	private String softwareVersion;
	
	@OneToOne(mappedBy="card")
	private Student student; 

	public void setStudent(Student student) {
		this.student=student;
	}
	public Student getStudent() {
		return student;
	}
	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getSoftwareVersion() {
		return softwareVersion;
	}

	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}
}
