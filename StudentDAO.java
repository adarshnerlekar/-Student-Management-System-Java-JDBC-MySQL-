package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDAO 
{
	   static String jdbc_Driver="com.mysql.cj.jdbc.Driver";
	    static String url = "jdbc:mysql://localhost:3306/mystudentdata";
	    static String user = "root";
	    static String password = "---";

	    public static void insertStudent(student s) {
	        try {
	            // Load JDBC driver
	            Class.forName(jdbc_Driver);
	            Connection conn = DriverManager.getConnection(url,user,password);

	            String query = "INSERT INTO students (rollno, name, course) VALUES (?, ?, ?)";
	            PreparedStatement ps = conn.prepareStatement(query);
	            ps.setInt(1, s.getRollno());
	            ps.setString(2, s.getName());
	            ps.setString(3, s.getCourse());

	            ps.executeUpdate();
	            int rows = ps.executeUpdate();
	            if (rows > 0) {
	                System.out.println("Student inserted into DB.");
	            } else {
	                System.out.println(" No rows inserted.");
	            }
	            System.out.println(" Student saved to database.");

	            ps.close();
	            conn.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
