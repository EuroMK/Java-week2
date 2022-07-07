package uk.ac.serc.customers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String databaseName = "cf-training-db-server";
        String url = databaseName + ".database.windows.net";
        String database = "northwind";
        String user = "cf_readonly_login";
        String password = "BDtrp7ajxtzoMpF4WN4rGDrfIDAc0xIy";
        String connectionUrl = "jdbc:sqlserver://" + url + ":1433;databaseName=" + database + ";user="+ user + ";password=" + password +";";
    
        System.out.println(connectionUrl);

        ArrayList<Customer> customerList = new ArrayList<Customer>();

        try {
            // Load SQL Server JDBC driver and establish connection.
            System.out.print("Connecting to SQL Server ... ");
            try (Connection connection = DriverManager.getConnection(connectionUrl)) {
                System.out.println("--- Connected to the database ---.");

                String sql = "SELECT * FROM Customers;";
                try (Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {
                    while (resultSet.next()) {
                        customerList.add(new Customer(resultSet.getString("CustomerID"),
                                resultSet.getString("CompanyName"),
                                resultSet.getString("ContactName"),
                                resultSet.getString("ContactTitle"),
                                resultSet.getString("Address"),
                                resultSet.getString("City"),
                                resultSet.getString("Region"),
                                resultSet.getString("PostalCode"),
                                resultSet.getString("Country"),
                                resultSet.getString("Phone"),
                                resultSet.getString("Fax")));
                                
                        
                        //Brian's original print out:
                        //System.out.println(resultSet.getString("CustomerID") + " | " + resultSet.getString("CompanyName") + " | " + resultSet.getString("ContactName"));
                    }
                
                for (Customer customerRequest:customerList){
                    System.out.println(customerRequest.toString());
                }
                }
                connection.close();
                System.out.println("All done.");
            }
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }

    }
}
