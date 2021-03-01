package example;

public class Example7 {

	public static void main(String[] args) {
		System.out.println(getNumber());
	}

	public static int getNumber() {
		try {
			// DB Operations
			int a=10/0;// arithamatic exception
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 2;
		} finally {
			// Close DB Connections
			return 3;
		}
	}

//		1. What is the output if there is some exception in try block? //ans 3
//		2. What is the output if there is no exception in try block?" //ans 3
	//finally block allways executed wether their exception or not


}
