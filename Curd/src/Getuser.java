import java.sql.*;

public class Getuser {
	public static void selectData()throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/student";
		String username="root";
		String password="0525";
		String Query="select * from details ";
		Connection conn=DriverManager.getConnection(url,username,password);
		PreparedStatement pst=conn.prepareStatement(Query);
		Statement smt=conn.createStatement();
 		ResultSet rs=smt.executeQuery(Query);
 		while(rs.next()) {
 			System.out.println(" stuid "+rs.getInt(1));
 			System.out.println("stuname "+rs.getString(2));
 			System.out.println("stuemail "+rs.getString(3));
 		}
 		conn.close();
	}
     
	
	
	public static void main (String[]args) throws Exception {
		
		selectData();
}
}

