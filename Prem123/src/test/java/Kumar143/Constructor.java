package Kumar143;

import net.bytebuddy.implementation.bind.annotation.This;

public class Constructor {
	String name;
	int no ;
	public Constructor() {
		
		System.out.println("Prem");
	}
	
	Constructor(String Nag,int i){
		this.name=Nag;
		this.no=i;
		System.out.println(name);
		System.out.println(no);
	}
	

	public static void main(String[] args) {
		Constructor Prem =new Constructor();
		Constructor P2 =new Constructor();
		Constructor p3=new Constructor();
		Constructor p4=new Constructor("Akhil" ,101);
	}

}
