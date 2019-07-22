package com.stackroute.jdbc;

import java.sql.*;

public class ResultSetMetadataDemo {

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;


    public void getColumnDetails() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "Root@123");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("Select * from employee");)
        {

            //getting ResultSetMetaData object

            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

            //getting number of columns in 'rs'

            int colCount = resultSetMetaData.getColumnCount();

            System.out.println("Number Of Columns : "+colCount);

            System.out.println("column Details :");

            for (int i = 1; i <= colCount; i++)
            {
                //getting column name of index 'i'

                String colName = resultSetMetaData.getColumnName(i);

                //getting column's data type of index 'i'

                String colType = resultSetMetaData.getColumnTypeName(i);

                System.out.println(colName+" is of type "+colType);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
//
    }

}
