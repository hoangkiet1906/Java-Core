import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	public static Connection getJDBConnection() {
		final String url = "jdbc:mysql://localhost:3306/hello?useSSL=false";
		 
		final String user = "root";
		final String password = "fanis1962002";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	public static void main(String[] args) {
		Connection connection = getJDBConnection();
		if(connection != null) {
			System.out.println("Thanh Cong");
		}
		else System.out.println("That Bai");
	}
}
