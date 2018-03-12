package javaprograms;



class prog1{  //parent or super class
       void m1(){
		System.out.println("selenium");
	}
	void m2(){
		System.out.println("manual");
	}
}
		class prog2 extends prog1{ //super class for prog3 and child class for prog1
			void m3(){
				System.out.println("qtp");
			}
			void m4(){
				System.out.println("uft");
			}
		}
			class prog3 extends prog2{ //child class
				void m5(){
					System.out.println("QC");
				}
			}
public class inherit {

	public static void main(String[] args) {
		prog3 obj=new prog3();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
		obj.m5();
	}

	}


