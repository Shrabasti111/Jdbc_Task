package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcTransactionDemo {

    public void transactionMethod() {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employeedb","root","Root@123");

            connection.setAutoCommit(false);


            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into employee values(6,'Michael',50, 'Male')");
            statement.executeUpdate("insert into employee values(7,'Holly',40, 'Female')");

            connection.commit();
            connection.close();
        }catch(Exception e){ System.out.println(e);}
    }

}
