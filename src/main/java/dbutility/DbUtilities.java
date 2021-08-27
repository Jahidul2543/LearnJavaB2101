package dbutility;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DbUtilities {

//    Read this secrets from external file like secret.properties

    String userName = "postgres";
    String password = "localhost";
    String hostName = "localhost";
    String portNumber = "5432";
    String database = "dvdrental";
    String query = "SELECT actor_id, first_name, last_name, last_update FROM public.actor limit 15;";
    // jdbc:postgresql://host:port/database
    String url = "jdbc:postgresql://" + hostName +":"+ portNumber + "/" + database ;

    public Connection connectDB() throws SQLException {
        Connection connection = DriverManager.getConnection(url, userName,password);
        return connection;

    }

    public ResultSet executeSelectQuery(String query) throws SQLException {
        Statement statement = connectDB().createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        return resultSet;
    }

    public  List<String> getAColumn(String query, String columnName) throws SQLException {
        DbUtilities dbUtilities = new DbUtilities();
        List<String> list = new ArrayList<>();
        ResultSet resultSet = dbUtilities.executeSelectQuery(query);
        // Process results
        while (resultSet.next()) {
            list.add(resultSet.getString(columnName));
        }
        System.out.println("Number of records: " + list.size());
        list.forEach(s -> System.out.println(s));
        return list;
    }

    public List<Map<String, String>> processResponseTableInList(String query)throws SQLException{
        ResultSet resultSet =  executeSelectQuery(query);
        List<Map<String, String>> listOfRecords = new ArrayList<>();
        Map<String , String> record = new HashMap<>();
        int i = 0;
        while (resultSet.next()) {
            record = null;
            record.put("actor_id", resultSet.getString("actor_id"));
            record.put("first_name", resultSet.getString("first_name"));
            record.put("last_name", resultSet.getString("last_name"));
            record.put("last_update", resultSet.getString("last_update"));
            listOfRecords.add(i, record);
            i++;
        }

        System.out.println(listOfRecords.size());
        return listOfRecords;

    }

    public static void main(String[] args) throws SQLException {
        DbUtilities dbUtilities = new DbUtilities();
       List<Map<String, String>> listOfRecords = dbUtilities.processResponseTableInList(dbUtilities.query);

       for (int i = 0; i<= listOfRecords.size()-1; i++){
          Map<String, String> recordMap = listOfRecords.get(i); // Map01 ~ record01
           for (Map.Entry<String, String> entry:recordMap.entrySet()) {
               System.out.println(entry.getKey() + " : " + entry.getValue());
           }
       }


    }

}
