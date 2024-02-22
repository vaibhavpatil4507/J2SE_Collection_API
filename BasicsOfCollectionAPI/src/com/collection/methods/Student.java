package com.collection.methods;

public class Student {

	private Integer rollNumber;
	private String Name;
	private Double percentage;
	
	
	public Student() {};
	
	public Student(Integer rollNumber, String name, Double percentage) {
		super();
		this.rollNumber = rollNumber;
		Name = name;
		this.percentage = percentage;
	}


	public Integer getRollNumber() {
		return rollNumber;
	}


	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public Double getPercentage() {
		return percentage;
	}


	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	
	
}
