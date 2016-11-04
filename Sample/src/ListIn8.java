import java.util.ArrayList;
import java.util.List;

public class ListIn8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
		
		items.forEach(System.out::println);
		
		items.forEach(it->System.out.println(it));
	}

}
