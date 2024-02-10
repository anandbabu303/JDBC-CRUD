package Wed;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Scannerjdbccrud {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud7", "root", "root");
		PreparedStatement preparedStatement = connection.prepareStatement("delete from local where name=?");
		System.out.println("enter the name");
		preparedStatement.setString(1, sc.next());
//		System.out.println("enter the id");
//		preparedStatement.setInt(2, sc.nextInt());


//		System.out.println("enter the research");
//		preparedStatement.setString(3, sc.next());

		int b = preparedStatement.executeUpdate();
		System.out.println("Affected");
	}

}
