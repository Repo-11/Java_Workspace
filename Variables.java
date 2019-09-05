/**
 * 
 */
package allPractice;

/**
 * @author kalla
 *
 */
public class Variables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 10;
		char ch = 'h';
		float var = 2.56f;
		boolean bool = true;
		
		System.out.println("\n" + num + "\n" + ch +"\n" + var + "\n" + bool + "\n");
		System.out.println("Sizeof num = " + Integer.SIZE/8 + " bytes");
		System.out.println("Sizeof ch = " + Character.SIZE/8 + " bytes");
		System.out.println("Sizeof var = " + Float.SIZE/8 + " bytes");
		//System.out.println("Sizeof bool = " + Boolean.SIZE + " bytes");
	}

}
