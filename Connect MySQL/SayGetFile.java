import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SayGetFile {
	public static void main(String[] args) throws SQLException, IOException {
		Connection connection = new JDBCConnection().getJDBConnection();
		String sql = "select * from file";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next()) {
			String name = resultSet.getString("name");
			Blob file = resultSet.getBlob("file");
			
			byte[] a = file.getBytes(1, (int) file.length());
			
			FileOutputStream fout = new FileOutputStream("get"+name);
			fout.write(a);
			System.out.println("Lay file thanh cong");
			fout.close();
		}
	}
}
