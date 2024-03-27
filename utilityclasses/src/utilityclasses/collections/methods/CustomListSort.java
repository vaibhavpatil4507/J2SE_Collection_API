package utilityclasses.collections.methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	private String name;
	private Integer roll_no;
	
	public Student() {};
	
	public Student(String name,Integer roll_no) {
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
	public int compareTo(Student o) {
		
		return this.roll_no.compareTo(roll_no);
	}
}


public class CustomListSort {

	public static void main(String[] args) {
		
		ArrayList<Student> list=new ArrayList<>();
		list.add(new Student("abc",15));
		list.add(new Student("xyz",100));
		list.add(new Student("pqr",2));
		list.add(new Student("rst",89));
		
		
		
		System.out.println(list);//It will preserve its insertion order
		
		
		Collections.sort(list);
		System.out.println(list);

		Collections.sort(list, (x,y)->-x.getRoll_no().compareTo(y.getRoll_no()));
	
		System.out.println(list);//It will print follow custom order of compareTo method
	
	}
	
}
