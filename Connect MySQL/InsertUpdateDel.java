import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUpdateDel {
	public static void insertRecords(int id, String name) {
		Connection con = new JDBCConnection().getJDBConnection();
		try {
			Statement statement = con.createStatement();
			String sql ="Insert into Person(id,name) values("+id+","+"'"+name+"'"+")";
			int rs = statement.executeUpdate(sql);
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void updateRecords(int id, String name) {
		Connection con = new JDBCConnection().getJDBConnection();
		try {
			Statement statement = con.createStatement();
			String sql ="Update Person set name = '"+name+"'where id = "+id;
			int rs = statement.executeUpdate(sql);
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void deleteRecords(int id) {
		try (Connection con = new JDBCConnection().getJDBConnection()) {
			Statement statement = con.createStatement();
			String sql ="Delete From Person where id = "+id;
			int rs = statement.executeUpdate(sql);
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		insertRecords(6, "Binh Bo");
		//updateRecords(1, "Kaori");
		//deleteRecords(2);
	}

}
