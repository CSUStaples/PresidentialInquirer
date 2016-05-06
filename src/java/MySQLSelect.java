import java.sql.*;
 
/**
 * A Java MySQL SELECT statement example.
 * Demonstrates the use of a SQL SELECT statement against a
 * MySQL database, called from a Java program.
 * 
 * adapted from http://alvinalexander.com/java/java-mysql-select-query-example
 */
public class MySQLSelect
{
 
  public static void main(String[] args)
  {
    try
    {
      // create our mysql database connection
        String myDriver = "MySQL (Connector/J driver)";
      String myUrl = "jdbc:mysql://pinq.cdmazu6ezgrk.us-west-2.rds.amazonaws.com:3306";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "JStaples", "whatever");
       
      // our SQL SELECT query. 
      // if you only need a few columns, specify them by name instead of using "*"
      String query = "SELECT * FROM Candidates";
 
      // create the java statement
      Statement st = conn.createStatement();
       
      // execute the query, and get a java resultset
      ResultSet rs = st.executeQuery(query);
       
      // iterate through the java resultset
      while (rs.next())
      {
        String CandidateName = rs.getString("Candidate");
        String Party = rs.getString("party");
        String Bio = rs.getString("bio");
        String Pic = rs.getString("pic");

         
        // print the results
        System.out.format("%s, %s, %s, %s,\n", CandidateName, Party, Bio, Pic);
      }
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
  }
}