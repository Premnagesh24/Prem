package Kumar143;

public class Logical {

	public static void main(String[] args) {
		int a=100;
		int b=20;
		int c=30;
		if(a>b&&a>c) {
			System.out.println("a value is bigg");
			
		}
		else if(b>a&&b>c) {
			System.out.println("b value is bigg");
		}
		else if (c>a&&c>b){
			System.out.println("c value is bigg");
		}
		else {
			System.out.println("Please Check the values");
		}
	}

}
