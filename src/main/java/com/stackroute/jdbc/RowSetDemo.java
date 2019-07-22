package com.stackroute.jdbc;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class RowSetDemo {

    public void rowSetDemoMethod() {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            rowSet.setUrl("jdbc:mysql://localhost:3306/employeedb");
            rowSet.setUsername("root");
            rowSet.setPassword("Root@123");

            rowSet.setCommand("select * from employee");
            rowSet.execute();

            while (rowSet.next()) {
                // Generating cursor Moved event
                System.out.println("Id: " + rowSet.getInt(1));
                System.out.println("Name: " + rowSet.getString(2));
                System.out.println("Age: " + rowSet.getInt(3));
                System.out.println("Gender: "+ rowSet.getString(4));
                System.out.println();
            }

        }catch(Exception e){ System.out.println(e);}
    }
}
