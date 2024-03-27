package utilityclasses.collections.methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

 class Student1 implements Comparable<Student1>{
	private String name;
	private Integer roll_no;
	
	public Student1() {};
	
	public Student1(String name,Integer roll_no) {
		super();
		this.name=name;
		this.roll_no=roll_no;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setRoll_no(Integer roll_no) {
		this.roll_no=roll_no;
	}
	
	public Integer getRoll_no() {
		return roll_no;
	}
	
	@Override
	public String toString() {
		
		return ("name="+name+" roll_no= "+roll_no);
	}
	
	@Override
	public int compareTo(Student1 o) {
		
		return this.roll_no.compareTo(roll_no);
	}
}


public class CustomBinarySearch  {

	public static void main(String[] args) {
		
		ArrayList<Student1> list=new ArrayList<>();
		list.add(new Student1("abc",15));
		list.add(new Student1("xyz",100));
		list.add(new Student1("pqr",2));
		list.add(new Student1("rst",89));
		
		
		System.out.println(list);
		int index1=Collections.binarySearch(list,new Student1("pqr",2), (s1,s2)->s2.compareTo(s1));
		System.out.println(index1);
	
	}}
