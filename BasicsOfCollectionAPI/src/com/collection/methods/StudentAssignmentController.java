package com.collection.methods;

import java.util.ArrayList;
import java.util.List;




//print whole data of that student who scored max in class.
public class StudentAssignmentController {

	public static void main(String[] args) {
	
		
		Student s=new Student(11,"rohit",40.22);
		Student s1=new Student(12,"akash",60.22);
		Student s2=new Student(13,"prasad",90.22);
		Student s3=new Student(14,"jonny",70.22);
		Student s4=new Student(15,"karan",35.22);
		
		
		
		List<Student> student=new ArrayList<Student>();
		student.add(s);student.add(s1);student.add(s2);student.add(s3);student.add(s4);
		//System.out.println(student);
		
		
		Integer count=0;
		
		for(int i=0;i<student.size()-1;i++) {
			
			if(student.get(i).getPercentage()<student.get(i+1).getPercentage()) {
				count++;
			}
		
		}
		
		System.out.println(student.get(count).getRollNumber());
		System.out.println(student.get(count).getName());
		System.out.println(student.get(count).getPercentage());
		System.out.println("");
	}
}
