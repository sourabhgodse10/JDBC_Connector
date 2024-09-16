package First_Backend.first_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	String Url="jdbc:mysql://localhost:3306/student";
    	String Username="root";
    	String password="root";
    	Connection connection=DriverManager.getConnection(Url,Username,password);
    	Statement statement=connection.createStatement();
    	ResultSet rs=statement.executeQuery("Select * from marks");
    	
    	while (rs.next()) {
    		String studentname=rs.getString("student_name");
    		String marks=rs.getString("marks");
        	System.out.println(studentname);
        	System.out.println(marks);
    	}
    	
    	connection.close();
    }
}
