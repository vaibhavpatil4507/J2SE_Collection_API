package collection.set.problems;

import java.util.LinkedHashSet;
import java.util.Objects;

class Student {
	String name;
	Integer roll_no;

	public Student() {
	};

	public Student(String name, Integer roll_no) {
		super();
		this.name = name;
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(Integer roll_no) {
		this.roll_no = roll_no;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_no=" + roll_no + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, roll_no);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && Objects.equals(roll_no, other.roll_no);
	}

}

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<Integer> ls = new LinkedHashSet<>();
		ls.add(30);
		ls.add(50);
		ls.add(30);
		ls.add(60);

		System.out.println(ls);

		LinkedHashSet<Student> s = new LinkedHashSet<>();
		s.add(new Student("akash", 1));
		s.add(new Student("prakash", 2));
		s.add(new Student("suresh", 3));
		s.add(new Student("sham", 4));
		s.add(new Student("anna", 5));
		s.add(new Student("akash", 1));

		System.out.println(s);
		System.out.println(s.size());
		

	}
}
