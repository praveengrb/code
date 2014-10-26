package user.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import user.bean.User;

public class RecordsDao implements Records{
@Override
	public String saveRecords(User u) throws IOException, SQLException{
		
		String JDBC_URL = "jdbc:mysql://localhost/world";
		String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		String USERNAME = "root";
		String PASSWORD ="root";
		Connection conn=null;
		ResultSet rs=null;
		Statement stmt=null;
try{
		String accNumber= ""+System.currentTimeMillis();
		String pathToSave="./"+u.getAccType().toLowerCase()+accNumber+".txt";
        u.setAccNumber(accNumber);
       
        Class.forName(JDBC_DRIVER);
		conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
		System.out.println(conn);
		 stmt = conn.createStatement();
		System.out.println(stmt);
		stmt.execute("insert into user values('"+u.getAccNumber()+"','"+u.getName()+"','"+u.getAge()+"','"+u.getWelcomemessage()+"','"+u.getAddress()+"','"+u.getAccType()+"')");
        System.out.printf("Serialized data is saved in "+pathToSave);
        return accNumber;

    }catch(Exception i)
    {
        i.printStackTrace();
    } finally{
    	if(stmt!=null)
			stmt.close();
			if(conn!=null)
			conn.close();
    }
	return null;	
	}
@Override
	public User retriveRecords(String acNumber) throws IOException, SQLException {
		User e = null;
		String JDBC_URL = "jdbc:mysql://localhost/world";
		String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		String USERNAME = "root";
		String PASSWORD ="root";
		Connection conn=null;
		ResultSet rs=null;
		Statement stmt=null;
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
			System.out.println(conn);
			 stmt = conn.createStatement();
			System.out.println(stmt);
			rs = stmt.executeQuery("select * from user where accountNumber='"+acNumber+ "' limit 1");
			while (rs.next()) {
				String accNumber = rs.getString("accountnumber");
				String name = rs.getString("name");
				String age = rs.getString("age");
				String messge = rs.getString("messge");
				String address = rs.getString("address");
				String accType = rs.getString("accountnumber");
				e = new User(name, age, address, messge, accNumber, accType);
			}
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally{
			if(rs!=null)
			rs.close();
			if(stmt!=null)
			stmt.close();
			if(conn!=null)
			conn.close();
			
		}
		return e;
	}
}
