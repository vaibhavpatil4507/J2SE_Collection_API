package collection.set.problems;

public class StudentWithPrivateDemo {

	private  Integer roll_no;
	private  String name;
	private  Double marks;
	
	
	public StudentWithPrivateDemo() {};
	
	public StudentWithPrivateDemo( Integer roll_no,String name,Double marks) {
		super();
		this.roll_no=roll_no;
		this.name=name;
		this.marks=marks;
		
	}
	
	public void setRoll_no(Integer roll_no) {
		this.roll_no=roll_no;
	}
	
	public Integer getRoll_no() {
		return roll_no;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setMarks(Double marks) {
		this.marks=marks;
	}
	public Double getMarks() {
		return marks;
	}
	
	@Override
	public String toString() {
		return ( "roll_no= "+ this.roll_no+ "  name="+this.name+ "  marks="+this.marks);
	}
	
	
	
}
