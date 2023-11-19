package newpkg;

public class New_OverloadClass {

	public static void main(String[] args) {
		
		int c = add(10,20);
		System.out.println(c);
		

	}

	static int add(int a, int b) {
		
		return a+b;
	
	}
	
	static int add1(int x, int y) {
		 
		return x*y;
	}
}
