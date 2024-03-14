package collection.set.problems;

import java.util.Objects;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {
	String fname;
	String lname;
	Integer id;

	public Employee() {
	}

	public Employee(String fname, String lname, Integer id) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + ", id=" + id + "]";
	}

//	@Override
//	public int compareTo(Employee o) {
//		if(this.id<o.id) {
//			return -1;
//		}else if(this.id>o.id) {
//			return 1;
//		}else {
//			return 0;
//		}
//	}

//	@Override
//	public int compareTo(Employee o) {
//		return -this.id.compareTo(o.id);
//	}
//
//	// This method is recommended it sort object using DSNO.

//String sorting DSNO only--

	@Override
	public int compareTo(Employee o) {
		return this.fname.compareTo(o.fname);
	}
}

public class TreeSetUserDefinedClass {

	public static void main(String[] args) {

		TreeSet<Employee> e = new TreeSet<>();

		e.add(new Employee("arambh", "athawale", 5));
		e.add(new Employee("bharat", "jadhav", 4));
		e.add(new Employee("rohan", "kambale", 3));
		e.add(new Employee("sham", "gurav", 2));
		e.add(new Employee("prdnya", "athawale", 1));
		e.add(new Employee("sham", "gurav", 2));

		for (Employee employee : e) {
			System.out.println(employee);
		}

	}
}
