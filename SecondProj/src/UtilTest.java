/**

 * 
 */
import java.time
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
//import java.time;
/**
 * @author User
 *
 */
public class UtilTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
		Date dt = new Date ();
		String currentDate = String.valueOf(dt.getDate());
		System.out.println("Current Date is :" + currentDate);
		System.out.println("Current Time is :" + dt.getTime());
		
		Calendar cal = Calendar.getInstance();
		int dy = Integer.parseInt(args[0]);
		int mnth = Integer.parseInt(args[1]);
		int yr = Integer.parseInt(args[2]);
		cal.set(dy, mnth, yr);
		//String currentCalDate = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH)+1) + "/" + cal.get(Calendar.YEAR) + " " + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + " " + cal.getTimeZone().getDisplayName();                
		//System.out.println("Current Date is :" + currentCalDate);
 		System.out.println("Your Date is : " + yourDate );
 		
 */		
 		
 	LocalDate localDate = LocalDate.now();
 	System.out.println("Current Date Before :" + localDate);
 	
 	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
 		//System.out.println("Current Date formated :" + text);
 		String text = localDate.format(formatter);
 		
 		System.out.println("Current Date formated :" + text);
 		LocalDate parsedDate = LocalDate.parse(args[0], formatter);
 		System.out.println("Your Parsed Date is :" + parsedDate.format(formatter));
 	
	}

}
