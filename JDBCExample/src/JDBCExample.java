import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class JDBCExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String JDBC_URL = "jdbc:mysql://localhost/world";
		String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		String USERNAME = "root";
		String PASSWORD ="root";
		Class.forName(JDBC_DRIVER);
		Connection conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
		System.out.println(conn);
		Statement stmt = conn.createStatement();
		System.out.println(stmt);
		ResultSet rs = stmt.executeQuery("select * from city");
		while (rs.next()) {
			String userid = rs.getString("Name");
			System.out.println(userid);
		}
	}

}
