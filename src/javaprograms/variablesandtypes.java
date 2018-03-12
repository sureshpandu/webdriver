package javaprograms;
class variabletypes{
	   static int a=10; //instance variables
		static int b=20;//a ,b are static variables those are used in any methods
		int c=30;
		
		void m1(){
		 int e; //local variable  
			e=a+b;
			System.out.println(e);
		}
		 static void m2(){
			int d; //local variable
			d=b+a; //c is non static variable so c is used only non static methods
			System.out.println(d);
		}
}
public class variablesandtypes {

	public void main(String[] args) {
		variabletypes obj=new variabletypes();
		obj.m1();
		variabletypes.m2();

	}

}
