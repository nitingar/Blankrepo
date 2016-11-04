import java.util.function.Supplier;

interface JavaEight1{
	default void print(){
		System.out.println("11111111");
	}
	static void show(){
		System.out.println("22222222222");
	}
}
 class Test1 implements JavaEight1 {

	 public  void print(){
		 JavaEight1.super.print();
			System.out.println("333333333");
		}
		public static void show(){
			System.out.println("4444444444");
		}
}

 
 
 public class JavaEight{
	 
	 public static void main(String[] args) {
		 JavaEight1 m = new Test1();
		
		 m.print();
		 JavaEight1.show();
		 Test1.show();
	}
 }
 