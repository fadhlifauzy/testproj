import java.util.ArrayList;

/**
 * 
 */

/**
 * @author User
 *
 */
public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		//System.out.println("Array list is empty:" +al.isEmpty());
		
		for (String str:args) {
			al.add(str);
			
			System.out.println("Array list is empty:" + al.isEmpty());
			System.out.println("Array list Size is:" + al.size());
			//al.add(new Integer(10));
			//al.add(Boolean.TRUE) ;
			System.out.println(al);
			Object ar [] = (String [])al.toArray();
			
			System.out.println(ar);
			
		}

	}
}







