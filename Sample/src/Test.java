import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	
	public void a(){
		
		try {
			System.out.println("gsdfgdf");
		}catch(ArithmeticException | NullPointerException f){
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] x = new int[6];
		System.out.println(x.getClass());

		
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\testing.txt")))
		{

			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		
		
	}

}
