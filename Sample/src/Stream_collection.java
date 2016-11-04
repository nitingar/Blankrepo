import java.util.LinkedList;
import java.util.PriorityQueue;

public class Stream_collection {

	
	public void a(){
		LinkedList<String> s = new LinkedList<>();
		s.add("one");
		s.add("");
		s.add("one");
		s.add("");
		s.add("two");
		
		int count = (int) s.stream().filter(string -> string.isEmpty()).count();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq = new PriorityQueue<String>();
		 pq.add("carrot");
	 pq.add("apple");
		 pq.add("bannana");
		 System.out.println(pq.poll() +":" + pq.peek());
		 System.out.println(pq.poll() +":" + pq.peek());
		 System.out.println(pq.poll() +":" + pq.peek());
		 System.out.println(pq.poll() +":" + pq.peek());
		 System.out.println(pq.poll() +":" + pq.peek());
		
	}

}
