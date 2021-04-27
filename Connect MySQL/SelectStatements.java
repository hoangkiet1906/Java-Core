import java.sql.Connection; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStatements {
	public static void main(String[] args) {
		try {
			Connection con = new JDBCConnection().getJDBConnection();
			Statement statement = con.createStatement();
			
			String sql = "SELECT * FROM demo";
			
			ResultSet rs = statement.executeQuery(sql);
			
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				System.out.println(id+" "+name);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
