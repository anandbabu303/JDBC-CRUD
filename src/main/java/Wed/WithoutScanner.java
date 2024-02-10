package Wed;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WithoutScanner {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/myheart", "root", "root");
		PreparedStatement preparedStatement = connection.prepareStatement("create table naani(name varchar(10), id BigInt)");
		preparedStatement.execute();
		System.out.println("success");
	}

}
