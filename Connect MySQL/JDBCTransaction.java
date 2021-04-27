import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTransaction {
	public static void main(String[] args){
		Connection con = new JDBCConnection().getJDBConnection();
		try {
			Statement statement1 = con.createStatement();
		
			con.setAutoCommit(false);
			
			String sql1 = "Insert into Person(id, name) Values(2,'Kiet')";
			String sql2 = "Delete From Person where id = 1";
			
			statement1.executeUpdate(sql2);
			statement1.executeUpdate(sql1);
			
			con.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
