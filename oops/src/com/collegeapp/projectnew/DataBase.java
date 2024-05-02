package com.collegeapp.projectnew;

import java.sql.*;

public class DataBase {
	
    
        public static Connection getConnection() throws ClassNotFoundException, SQLException{
            
            Class .forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegeappmanagement","root","Aspcfamily@1");
            
            return connection;
        }
        public static void update(int rollNo,int percentage,int paidFees) throws ClassNotFoundException,SQLException
        {
        	Connection connection=getConnection();
        	String updateTable="update collegeapp set attendance_percent=?,fees_paid=? where roll_no=?"; 
        	PreparedStatement prepare=connection.prepareStatement(updateTable);
        	prepare.setInt(3,rollNo);
        	prepare.setInt(1,percentage);
        	prepare.setInt(2,paidFees);
        	
        	int row=prepare.executeUpdate();
        	System.out.println("updated data:"+row);
        	connection.close();
        }
        public static void delete(int rollNo) throws ClassNotFoundException,SQLException
        {
        	Connection connection=getConnection();
        	String deleteTable="delete from collegeapp where roll_no=?"; 
        	PreparedStatement prepare=connection.prepareStatement(deleteTable);
        	prepare.setInt(1,rollNo);
        	int row=prepare.executeUpdate();
        	System.out.println("Deleted data:"+row);
        	connection.close();
        }
        public static void insert(int rollNo,int attendancePercentage,int feesPaid) throws ClassNotFoundException,SQLException
        {
        	Connection connection=getConnection();
        	String insertTable="insert into collegeapp values(?,?,?)";
        	PreparedStatement prepare=connection.prepareStatement(insertTable);
        	prepare.setInt(1,rollNo);
        	prepare.setInt(2,attendancePercentage);
        	prepare.setInt(3,feesPaid);
        	int row=prepare.executeUpdate();
        	System.out.println("inserted data:"+row);
        	connection.close();
        }
        
		
}
