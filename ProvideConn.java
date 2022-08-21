import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProvideConn {
	
	public static Connection EstablishConnection() {
		Connection conn=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/db2";
		
		try {
			conn=DriverManager.getConnection(url,"root","mysqlroot");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return conn;
	}

}
