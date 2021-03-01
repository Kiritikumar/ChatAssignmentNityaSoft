package example;

public class Employee implements Comparable<Employee>{
	int id=-1;
	String fname=null;
	String lname=null;
	int age=-1;
	public Employee(int id, String fname, String lname, int age) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return age-o.age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}
	
}
//	public class SortingDemo {
//		public static void main(String[] args) {
//				
//			}
//	
//
//}
