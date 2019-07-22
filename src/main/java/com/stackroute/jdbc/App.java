package com.stackroute.jdbc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SimpleJdbcDemo simpleJdbcDemo = new SimpleJdbcDemo();
        simpleJdbcDemo.getEmployeeDetails();
        System.out.println();
        simpleJdbcDemo.getEmployeeDetailsInReverse();
        System.out.println();
        simpleJdbcDemo.getEmployeeDetailsFromSecondRowInReverse();
        System.out.println();
        simpleJdbcDemo.getEmployeeDetailsByNameAndGender("John","Male");

        System.out.println();
        System.out.println();
        ResultSetMetadataDemo resultSetMetadataDemo = new ResultSetMetadataDemo();
        resultSetMetadataDemo.getColumnDetails();
        DatabaseMetadataDemo databaseMetadataDemo = new DatabaseMetadataDemo();
        databaseMetadataDemo.getDatabaseMetadata();

        System.out.println();
        System.out.println();
        JdbcBatchDemo batchDemo = new JdbcBatchDemo();
        batchDemo.BatchDemoMethod();

        JdbcTransactionDemo jdbcTransactionDemo = new JdbcTransactionDemo();
        jdbcTransactionDemo.transactionMethod();

        RowSetDemo rowSetDemo = new RowSetDemo();
        rowSetDemo.rowSetDemoMethod();

    }
}
