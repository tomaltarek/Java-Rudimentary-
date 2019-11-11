import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDB {
    public static final String DRIVER="org.apache.derby.jdbc.EmbeddedDriver";
    public static final String JDBC_URL="jdbc:derby:tomaldb;create=true";
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER);
		Connection connection=DriverManager.getConnection(JDBC_URL);
		// write code below to show that database already exists 

	}
  
}
