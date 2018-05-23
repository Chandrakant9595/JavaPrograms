package programs;

public class TP {
	
	int a = 10;
	static int b = 20;
	
	void abc(){
		System.out.println("Message");
	}
	
	static void xyz(){
		System.out.println("Static method");
	}
	
	public static void mail(String[] args){
		
		TP tp = new TP();
		tp.abc();
		System.out.println(tp.a);
		System.out.println(TP.b);
		TP.xyz();
	}

}


