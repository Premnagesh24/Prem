package Kumar143;

public class Java1 {

	
		static int a = 10;
		static int b = 20;
			   static int c = 25;
		
		public static void main(String[] args){
			
		/*	System.out.println(a); //Without object
			System.out.println(b);
			System.out.println(c); */
			
			Java1 je = new Java1();// with object
			je.method1();
		}
		
		public void method1(){
			Object je;
			System.out.println(Java1.a);
			System.out.println(Java1.b);
			System.out.println(Java1.c);
		}


	}