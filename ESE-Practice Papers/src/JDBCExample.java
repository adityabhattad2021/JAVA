import java.sql.*;

public class JDBCExample {

    private Connection connection;
    private Statement statement;

    public JDBCExample(String databaseUrl,String userName,String password) throws SQLException {

        // Check if there is a JDBC Connection instance.
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Connect to the database and create a statement to query.
        try {
            connection = DriverManager.getConnection(databaseUrl, userName, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public String executeQuery(String query) throws SQLException {
        String resultString="";
        // Execute a query.
        ResultSet result = statement.executeQuery(query);
        ResultSetMetaData metaData = result.getMetaData();
        int columnCount = metaData.getColumnCount();
        // Loop through the query.
        while(result.next()){
            for(int x=0;x<columnCount;x++){
                resultString+=result.getString(x)+" ";
            }
            resultString+="\n";
        }
        return resultString;
    }

    // Finally closes all the connection, to be used as clean up function.
    public void closeAllConnections() throws SQLException {
        statement.close();
        connection.close();
    }

}
