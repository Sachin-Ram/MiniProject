package javaapplication1;

import java.sql.*;  

public class conn{
    public Connection c;
    public Statement s;
    public conn()
    {  
        try
        {  
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/getconnect","root","sachin");    
            s =c.createStatement(); 
  
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
    
}  
