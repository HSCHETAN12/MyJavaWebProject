//JDBC Connectng Steps
package jdbc1.Jdbc;
import java.sql.*;
public class Demo2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        //Targeting the Driver Static block
		Class.forName("com.mysql.cj.jdbc.Driver");
        //Connecting to DataBase                  <--MyWorkbench Url-->           <--UserID--><--Password-->
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2","root",  "root");
        //Writeing the Sql Queries
		CallableStatement p=c.prepareCall("insert into employe values('Tejas',100,2020)");
        //Execute The Querie
		boolean e=p.execute();
        //Print the result
		System.out.println(e);
        //Close the Connection
		c.close();


	}

}
