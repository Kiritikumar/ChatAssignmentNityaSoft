package factoryMathods;
import factoryMathods.*;

public class OperatingSystemsFactory {
public OS getInstance(String str) {
	if(str.equals("mobile")) {
		return new Android();
	}
	else if(str.equals("desktops")) {
		return new Windows();
	}
	else {
	return null;	
	}	
}
}
