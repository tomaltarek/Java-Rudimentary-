import java.util.LinkedList;
import java.util.Scanner;

public class useOfLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	LinkedList<Integer> linkedList=new LinkedList<>(); 
	Scanner sc=new Scanner(System.in); 
	System.out.println("how many items you want your linked list be made of?\n");
	int n=sc.nextInt(); 
	
	for (int i=0;i<n;i++)
	{
		if (i==0)
		{
		System.out.println("give first element: ?\n");
		linkedList.add(sc.nextInt());
		
		
		}
		
		else {
			System.out.println("give next element: ?\n");
			linkedList.add(sc.nextInt());
		}
		
	}
	
	
	System.out.println("here is your linked list :"+linkedList);

	}

}
