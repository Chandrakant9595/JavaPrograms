package programs;

public class First {
	
	public static void m1(String s){
		System.out.println("String");
	}
	
	public static void m1(Object o){
		System.out.println("Object");
	}
	
	
	
	public static void m2(Exception e){
		System.out.println("Exception");
	}
	
	public static void m2(ArithmeticException ae){
		System.out.println("ArithmeticException");
	}
	
	public static void m2(Object o){
		System.out.println("Object");
	}
	
	public static void main(String[] args){
		
		m1(null);
		m2(null);
		
		
		if(null == null){
			System.out.println("null msg");
		}
		
	}

}
