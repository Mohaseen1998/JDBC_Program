import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class empmethod {

	public void saveEmployee(employee emp) {

		String s="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/testyantraproject";
		String user_name ="root";
		String password="root";
		String query=" insert into employee values(?,?,?)";
		
		try {
			//1: load and register Driver
			Class.forName(s);
			//2: EStablish Connection
			Connection c = DriverManager.getConnection(url,user_name,password);
			//3: create a statement
			PreparedStatement pre =c.prepareStatement(query);
			//4: Execute statement / Query
			pre.setInt(1,emp.getId());
			pre.setString(2,emp.getName());
			pre.setDouble(3,emp.getPhone());
			pre.execute();
			//5: close 
			c.close();
			System.out.println(" data saved");
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();

	}

}
}
