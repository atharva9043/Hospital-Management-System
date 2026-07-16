package com.tka.Hospital.Management.System.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
    
	@Column(name="First_name")
   private String name;
	
	@Column(name="age")
   private String age;
   
	@Column(name="blood_group")
   private String blood;
   
	@Column(name="prescription")
   private String prescription;
   
	@Column(name="Fees")
   private String fees;
   
	@Column(name="Dose")
   private String dose;
   
	@Column(name="Urgency")
   private String urgency;
	
	public Patient() {
		super();
	}

	public Patient(long id, String name, String age, String blood, String prescription, String fees, String dose,
			String urgency) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.blood = blood;
		this.prescription = prescription;
		this.fees = fees;
		this.dose = dose;
		this.urgency = urgency;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", blood=" + blood + ", prescription="
				+ prescription + ", fees=" + fees + ", dose=" + dose + ", urgency=" + urgency + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	public String getFees() {
		return fees;
	}

	public void setFees(String fees) {
		this.fees = fees;
	}

	public String getDose() {
		return dose;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}

	public String getUrgency() {
		return urgency;
	}

	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}
	
	
}
