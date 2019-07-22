package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcBatchDemo {

    public void BatchDemoMethod() {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employeedb","root","Root@123");

            connection.setAutoCommit(false);

            Statement statement =connection.createStatement();
            statement.addBatch("insert into employee values(4,'Matt',40, 'Male')");
            statement.addBatch("insert into employee values(5,'Ron',20, 'Male')");

            statement.executeBatch();//executing the batch

            connection.commit();
            connection.close();
        }catch(Exception e){ System.out.println(e);}
    }
}

