package store;


import java.sql.*;
import javax.swing.JOptionPane;


public class MyConnection 
{
   
    Statement statement;

 public  static Connection getConnection()throws  Exception
    {
        
            
      	Class.forName("com.mysql.jdbc.Driver");
    	
    	String dbpath="jdbc:mysql://localhost:3306/store";
    	String username="root";
    	String password= "2549274";
    	try
        {
            Connection con=DriverManager.getConnection(dbpath,username,password);
     
        if(con != null)
        {
            //JOptionPane.showMessageDialog(null, "connect");
            System.out.println("Connect Done");
           return con;
        }
       
        }
       
        catch(Exception ex)
        {
            System.out.println("exception caught");
        }
        
    	 return null;
   
    }
 public void closeConnection(Connection con)throws Exception
 {
     if(con!=null)
     {
        con.close();
     }
 }
    public static void main(String[] args) throws Exception 
    {
        getConnection();
             
   }

}
