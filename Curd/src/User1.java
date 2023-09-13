import java.sql.*;
public class User1 {
	public static void insertData()throws Exception {
	String url="jdbc:mysql://127.0.0.1:3306/student";
	String username="root";
	String password="0525";
	String Query="insert into details values(?,?,?)";
	Connection conn=DriverManager.getConnection(url,username,password);
	PreparedStatement pst=conn.prepareStatement(Query);
	pst.setInt(1, 2);
	pst.setString(2, "krishvika");
	pst.setString(3, "vika@gmail.com");
	pst.executeUpdate();
	conn.close();

	}
	
	public static void main(String[] args)throws Exception{
		
		insertData();



}
}