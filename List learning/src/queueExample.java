import java.util.LinkedList;
import java.util.Queue;

public class queueExample {
	
	public static void main(String []args) {
		
		Queue<Integer> abc=new LinkedList<>(); 
		
		abc.add(2); 
		abc.add(45); 
		abc.add(30);
		abc.add(10); 
		abc.add(50); 
		System.out.println("-------this program demonstrate queue------");
		System.out.println("Original queue is: "+abc);
		//abc.peek(); 
		System.out.println("Size of the queue is : "+abc.size());
		System.out.println("The first value of queue is :"+abc.peek());
		//abc.clear(); // to remove all elements 
		abc.remove(); // removing a 
		System.out.println("After removing one element :"+abc);
		System.out.println("is the queue empty: "+abc.isEmpty());
		
	}

}
