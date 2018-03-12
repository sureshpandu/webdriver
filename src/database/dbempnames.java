package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

public class dbempnames {
@Test
public void testdata() throws Exception{
	Connection conn;
	String url="jdbc:mysql://localhost:3306/";
	String username="root";
	String password="chinna";
	String dbname="datatable";
	String dbdriver="com.mysql.jdbc.Driver";
	//connect with data base
	Class.forName(dbdriver);
	conn=DriverManager.getConnection(url+dbname, username,password);
	//perform query
	Statement stmt=conn.createStatement();
	stmt.executeQuery("select * from datatable");
	//execute command
		ResultSet rs=stmt.getResultSet();
		while(rs.next()){
			System.out.println(rs.getString(1));

		}
	
}
}
	
		

	

	