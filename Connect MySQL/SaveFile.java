import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaveFile {

	public static void main(String[] args) throws SQLException, FileNotFoundException {
		Connection connection = new JDBCConnection().getJDBConnection();
		String sql = "Insert into file(name,file) values(?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		File file = new File("test2.txt");
		FileInputStream fin = new FileInputStream(file);
		
		preparedStatement.setString(1, "test2.txt");
		preparedStatement.setBinaryStream(2, fin);
		preparedStatement.executeUpdate();
		
		System.out.println("Them file thanh cong");
	}
}
