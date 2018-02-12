/**
 * 
 */

/**
 * @author User
 *
 */
public class TestString {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
/*	// TODO Auto-generated method stub
		int first = 1;
		int second = 2;
		int third = 3;
		String fourth = "c";
		String fifth = "c";
		String sixth = new String("C");
		
		if(fourth == fifth)
			System.out.println("fourth and fifth is same : " + fourth);
		
		else
			System.out.println("fourth and fifth are not the same : ");
		if(fourth == sixth)
			System.out.println("fourth and sixth is same : " + fourth);
		else
			System.out.println("fourth and sixth are not the same : ");
*/		
		/*
		System.out.println("Now fourth is: " + fourth); //scoping

		fourth = third + fourth;
		System.out.println("Now fourth is: " + fourth);
		
		fourth = second + fourth;
		System.out.println("Now fourth is: " + fourth);
		
		fourth = (String.valueOf(first)).concat(fourth) ;
		System.out.println("Now fourth is: " + fourth);
		*/
	
	
	
	/*
		String sms ="Selamat Datang Ke Malaysia!!";
		System.out.println("SMS size is : " + sms.length());
		System.out.println("Text at 10th position / 9th index : " + sms.charAt(9));
		System.out.println("Index of the text ! : " +sms.indexOf("!"));
		
		System.out.println("Substring of 0 - 10 : " + sms.substring(0,10));
		System.out.println("lower : " + sms.substring(0,10));
		System.out.println("UPPER : " + sms.substring(0,10));
	*/
		
		String country = "Malaysia" ;
		String userCountry = args[0].toLowerCase();
		//if(country.equals(args[0])) {
		if(country.equalsIgnoreCase(args[0])) { 	
			System.out.println("Country is Malaysia");
		}else {
			System.out.println("Country is not Malaysia but " + args[0]);
		}
			
			
			
			
			
		String userCountry = args[0];
		if(userCountry.startsWith("m")) { 	
			System.out.println("Country " + userCountry + " is Starting with m");
			
		}
		
		if (userCountry.endsWith("a")) {
			System.out.println("Country " + userCountry +  is ending with a");
			
	
		
			}
		}
	}

