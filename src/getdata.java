import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
	import java.sql.Statement;
	
public class getdata {
	public void getEmployee(int id) {

			String s="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/testyantraproject";
			String user_name ="root";
			String password="root";
			String query="select * from employee where id=?";
			
			try {
				//1: load and register Driver
				Class.forName(s);
				//2: EStablish Connection
				Connection c = DriverManager.getConnection(url,user_name,password);
				//3: create a statement
				PreparedStatement pre =c.prepareStatement(query);
				//4: Execute statement / Query
				PreparedStatement.setInt(1,id);
				ResultSet resultset= pre.executeQuery();
				while(resultset.next()) {
					System.out.println(resultset.getInt(1));
					System.out.println(resultset.getString(2));
					System.out.println(resultset.getDouble(3));
				}
				//5: close 
				c.close();
				System.out.println(" data saved");
			}
			catch(ClassNotFoundException | SQLException e){
				e.printStackTrace();

		}

	}
	}

}
