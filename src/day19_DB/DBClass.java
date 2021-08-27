package day19_DB;

import java.sql.DriverManager;

public class DBClass {
	private String url;
	private String id;
	private String pwd;
	private Connection con;
	public DBClass() {
	

		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		url = "jdbc:oracle:thin:@localhost:1521:xe";
		id = "sjh";
		pwd = "1234";
		con = DriverManager.getConnection(url,id,pwd);
		System.out.println(con);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
}
}