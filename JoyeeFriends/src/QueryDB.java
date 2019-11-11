/*
 This is a generic class to perform all kinds of SQL Query to any tables 
 * 
 * 
 */
import java.sql.Connection;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class QueryDB {
	public  static String all_friends;
	public static void main(String[] args) throws SQLException {
		System.out.println("© 2019 tomal tarek. All rights reserved.");
		System.out.println("With this class, you can perform Query to any tables");
		System.out.println("=====================================================");
		System.out.println("SQL > ");
		//Scanner scanner=new Scanner(System.in);
		//all_friends=scanner.nextLine();
		all_friends=multiLine();
		
		Connection connection=DriverManager.getConnection(CreateDB.JDBC_URL);
		java.sql.Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery(all_friends);
		
		ResultSetMetaData resultSetMetaData=resultSet.getMetaData();
		
		int columnCount=resultSetMetaData.getColumnCount();
		for (int x=1;x<=columnCount;x++) System.out.format("%20s",resultSetMetaData.getColumnName(x)+ "|");
		
		while (resultSet.next()) {
			System.out.println("");
			for (int x=1;x<=columnCount;x++) System.out.format("%20s",resultSet.getString(x)+ "|");
		}
		if (statement!=null) statement.close();
		if ( connection!=null) connection.close();
			
			
		}
	@SuppressWarnings("resource")
	private static String multiLine() {
		Scanner scanner=new Scanner(System.in); 
	    String s=scanner.nextLine().trim();
	    //if users do single line query 
	    if (s.substring(s.length() - 1).equals(";"))
	    {
	    	s = s.substring(0, s.length() - 1);
	    }
	    
	    else {	    	
	    	s=s+" "; //to avoid concatenation between first line and second line 
	    	String s1;
		    do {
		        s1=scanner.nextLine();
		        s=s+s1+" "; // to avoid concatenation between 2nd and successive lines 
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
		
		
	}
	
	
	
}
	

	