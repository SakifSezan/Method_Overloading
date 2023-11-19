package newpkg;

public class Overload_Class {

	public static void main(String[] args) {
		int sum = addnumbers(10, 20);
		System.out.println(sum);
		
	String Sakif = addnumbers("Rasif", " Sayan");
	System.out.println(Sakif);
	System.out.println(sum);
		

	}
	public static int addnumbers(int a, int b) {
		
		return a+b;
	}
	
	public static String addnumbers(String x, String y) {
		
		return x+y;
		
	}

}
