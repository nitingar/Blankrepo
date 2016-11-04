

interface Maths{
	int operation(int a, int b);
}





public class LamdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Maths m = new Maths() {
			
			@Override
			public int operation(int a, int b) {


				return a+b;
			}
		};
		System.out.println(m.operation(4, 8));
		
		Maths m2 = (int a, int b) ->{
		return a*b;	
		};
		
		}
	

}
