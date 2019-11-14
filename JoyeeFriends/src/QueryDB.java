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
		all_friends=Beautify.multiLine();		
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
	
}
	

	