package datadriventesting_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class TestCase_6 {

	public static void main(String[] args) throws Throwable {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pdb", "root", "Admin@123");
		Statement stat = con.createStatement();
		
		String query1="insert into details values('prathap','Hebya');";
		int result = stat.executeUpdate(query1);
		
		
		

	}
}
