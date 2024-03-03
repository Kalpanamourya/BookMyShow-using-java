package Package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertMovies 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/bms";
		String user = "root";
		String password = "kalpana9832";
		Connection con = DriverManager.getConnection(url,user,password);
		
		
	}
}
