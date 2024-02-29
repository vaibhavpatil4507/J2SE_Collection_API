package com.imp.list.methods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentController {

	public static void main(String[] args) {
		
		Student result=null;
		List<Student> list=new ArrayList<>();
		
		list.add(new Student(11,"akash",90.30));
		list.add(new Student(12,"virat",50.32));
		list.add(new Student(13,"manjan",80.22));
		list.add(new Student(14,"devendra",95.00));
		
		
	
		double percentage=0.0;
		Iterator<Student> str=list.iterator();
		while(str.hasNext()) {

			Student student=str.next();
			if(student.getPercentage()>percentage) {
				percentage=student.getPercentage();
				result=student;
			}
			
		}
		
		System.out.println(result);
	}
}
