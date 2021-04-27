import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class CreateAndDropTB {
	public static void main(String[] args) {
		Connection con = new JDBCConnection().getJDBConnection();
		try {
			Statement statement = con.createStatement();
			String sql="Create table Person(ID INT,name Nvarchar(10))";
			//String sql="Drop table Person";
			int rs = statement.executeUpdate(sql);
			if(rs==0)
			System.out.println("Thanh cong");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
