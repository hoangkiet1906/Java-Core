import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertUpdateDelPrepareStatement {
	public static void Insert(int id,String name) {
		Connection con = new JDBCConnection().getJDBConnection();
		String sql = "Insert into Person(id, name) Values(?,?)";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			int rs = preparedStatement.executeUpdate();
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void Update(int id,String name) {
		Connection con = new JDBCConnection().getJDBConnection();
		String sql = "Update Person set name = ? where id = ?";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(2, id);
			preparedStatement.setString(1, name);
			int rs = preparedStatement.executeUpdate();
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void Delete(int id) {
		Connection con = new JDBCConnection().getJDBConnection();
		String sql = "Delete From Person Where id = ?";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			int rs = preparedStatement.executeUpdate();
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Insert(4, "Gy");
		//Update(4, "Ny");
		//Delete(4);
	}
}
