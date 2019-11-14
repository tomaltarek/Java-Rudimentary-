/*
 This class handles all DML and DDL statements 
 * 
 * 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Crud {

	public static void main(String[] args) throws SQLException {
		Connection connection=DriverManager.getConnection(CreateDB.JDBC_URL);
		String statement;
		System.out.println("© 2019 tomal tarek. All rights reserved.");
		System.out.println("With this class, you can perform any DML and DDL statements");
		System.out.println("============================================================");
		System.out.println("Give me a sql statement");
		System.out.println("SQL > ");
		
		statement=Beautify.multiLine();
	
		connection.createStatement().execute(statement);
		System.out.println("Your statement has successfully executed, thank you ");
		
		if ( connection!=null) connection.close();

	}

}

