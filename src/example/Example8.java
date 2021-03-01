package example;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
public class Example8 {
	public static Map<String, DateFormat> dateFormat = new HashMap<String, DateFormat>();
	static{
		dateFormat.put("MM-dd-yyyy", new SimpleDateFormat("MM-dd-yyyy"));
		dateFormat.put("dd-MM-yyyy", new SimpleDateFormat("dd-MM-yyyy"));
		dateFormat.put("MM-dd-yy", new SimpleDateFormat("MM-dd-yy"));
		dateFormat.put("dd-MM-yy", new SimpleDateFormat("dd-MM-yy"));
	}
	public static void main(String[] args){
	System.out.println(formatDate("10-09-2019"));
	}

	public static String formatDate(String dateString){
	DateFormat displayFormat = new SimpleDateFormat("dd MMM, yyyy");
	String formatedString = dateString;
	for (Map.Entry<String, DateFormat> entry : dateFormat.entrySet()) {
	String key = entry.getKey();
	DateFormat df = entry.getValue();
	try {
//	Date d = df.parse(dateString);
//	formatedString = displayFormat.format(d);
	break;
	} catch (Exception e) {
	e.printStackTrace();
	}
	}
	return formatedString;
	}


}
