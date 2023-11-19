package newpkg;

public class GP_Demo {

	public static void main(String[] args) {
		GP_Demo.S(10, 20);
		GP_Demo.S(100, 277, 199);
		GP_Demo.S(1, 2, 3, 4);
		GP_Demo.S(7, 6, 2, 1, 8);
		
		GP_Demo TX = new GP_Demo();
		TX.R(100, 20);
		TX.Z(10.1, 1.2);

	}
	public static void S(int a, int b) {
		
		int c = a+b;
		System.out.println(c);
	}
public static void S(int a, int b, int d) {
		
		int c = a+b;
		System.out.println(c);
		
}

public static void S(int a, int b, int e, int s) {
	
	int c = a+b;
	System.out.println(c);
}

public static void S(int a, int b, int t, int k, int j) {
	
	int c = a+b;
	System.out.println(c);
}
public void R(int a, int b) {
	int c =a+b;
	System.out.println(c);
}
public void Z(Double x, Double y) {
	Double d = x*y;
	System.out.println(d);
}

}