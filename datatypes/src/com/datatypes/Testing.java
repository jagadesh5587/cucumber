

package com.datatypes;

import java.sql.*;

public class Testing {
	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql//localhost:3306/world";
		String uname="root";
		String pass="0011";
		String querry="select movie from caste";
		
		Class.forName("com.mysql.jdbc.driver");	
Connection con=DriverManager.getConnection(url,uname,pass);
Statement st=con.createStatement();
ResultSet r=st.executeQuery(querry);

r.next();

String name=r.getString("movie");
System.out.println(name);
st.close();
con.close();
	}

}
