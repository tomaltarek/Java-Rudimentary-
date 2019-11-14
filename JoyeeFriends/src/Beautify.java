import java.util.Scanner;

public class Beautify {
	
	public static String multiLine() {
		Scanner scanner=new Scanner(System.in); 
		try {
			String s=scanner.nextLine().trim(); //trim is used to avoid blank space 
		    //if first line has a semicolon at the end, the program will take the first line as a 
			//complete sql statement 
		    if (s.substring(s.length() - 1).equals(";"))
		    {
		    	s = s.substring(0, s.length() - 1);
		    }
		    
		    else {	    	
		    	s=s+" "; //to avoid concatenation between first line and second line 
		    	String s1;
			    do {
			        s1=scanner.nextLine();
			        s=s+s1+" "; //last part is to avoid concatenation between 2nd and successive lines 
			      // from second line semicolon will terminate the sql statements 
			    if ( s1.trim().substring((s1.trim().length()) - 1).equals(";")) 
			      {
			    	  break;
			      }
			      }
			     		    
			    while (s1.equals(";")==false);
			   // 
			    s=s.trim();
			    s = s.substring(0, s.length() - 1);
			}
		    
		    System.out.println(s); //keep this line for debugging 
			return s;	
			
		} finally {			
			// to avoid resource leak 
			scanner.close();
		}
	    		
	}	
}
