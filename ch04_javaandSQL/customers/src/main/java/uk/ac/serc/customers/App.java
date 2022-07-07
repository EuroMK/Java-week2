package uk.ac.serc.customers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args ){

        ArrayList<Customer> customerList = getAllCustomers();

        System.out.print("Please select a country for your customer(s): ");
        Scanner keyboard = new Scanner(System.in);
        String userInput = keyboard.nextLine();

        for (Customer customer : customerList){
            if (userInput.equals(customer.country)){
                System.out.println(customer);
            }
        }

    }

    private static ArrayList<Customer> getAllCustomers(){

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

                        // CustomerID,CompanyName,ContactName,ContactTitle,Address,City,Region,PostalCode,Country,Phone,Fax

                        Customer customer = new Customer();

                        // Column label done with a capital because this is the actual column label in SQL DB
                        customer.customerID = resultSet.getString("CustomerID");
                        customer.companyName = resultSet.getString("CompanyName");
                        customer.contactName = resultSet.getString("ContactName");
                        customer.contactTitle = resultSet.getString("ContactTitle");
                        customer.address = resultSet.getString("Address");
                        customer.city = resultSet.getString("City");
                        customer.region = resultSet.getString("Region");
                        customer.postalCode = resultSet.getString("PostalCode");
                        customer.country = resultSet.getString("Country");
                        customer.phone = resultSet.getString("Phone");
                        customer.fax = resultSet.getString("Fax");

                        customerList.add(customer);

                    }
    
                }
                connection.close();
                System.out.println("All done.");
            }
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }
        return customerList;
    }
 }
