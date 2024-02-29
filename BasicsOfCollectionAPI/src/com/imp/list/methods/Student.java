package com.imp.list.methods;

public class Student {

	private Integer roll_no;
	private String name;
	private Double percentage;
	
	public Student() {};
	
	public Student(Integer roll_no, String name, Double percentage) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.percentage = percentage;
	}

	public Integer getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(Integer roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
	
	
	
}
