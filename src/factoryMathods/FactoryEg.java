package factoryMathods;

public class FactoryEg {

	public static void main(String args[]) {
		OperatingSystemsFactory osf=new OperatingSystemsFactory();
		OS obj=osf.getInstance("mobile");
		OS obj1=osf.getInstance("desktops");
		
		obj.os();
		obj1.os();
	}
}
