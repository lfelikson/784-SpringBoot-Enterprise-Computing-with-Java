package lf;

import java.sql.*;
import java.sql.Connection;
import java.io.IOException;
import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Hashtable;

public class DBConnection{ 
	
	public  Connection con; 
	public  Statement stm; 
	private String sit = ""; 
    private DataSource ds;
    private ResultSet res;
	
	 public DBConnection() { 
		
		Hashtable env = new Hashtable();
	    env.put(Context.INITIAL_CONTEXT_FACTORY, 
	    		"org.wildfly.naming.client.WildFlyInitialContextFactory");
	    
	    try {
	    	// Get a Connection to the database
	    	Context context = new InitialContext(env);
	        ds = (DataSource) context.lookup ("java:jboss/datasources/H2_JHU_DB_JNDI");
	        con = ds.getConnection();
	        stm = con.createStatement(); 
	        sit = "Connection successfully executed"; 
	        
	        
	        setSearch ( );
	        
	        
	    	  
	        
	    } catch(Exception e) {
	            e.printStackTrace();
	            sit = "Could not connect to the database" + e.getMessage();
		} 
	 }  // end of DBConnection constructor
	
	 public String getSituation(){ 
		return sit; 
		} 
	 
	 public void setSearch() { 
		 try { 
			 res = stm.executeQuery("select * from student"); 
			 
			 } catch (SQLException e){ 
				 e.printStackTrace(); 
				 } 
		 } 
	 
	 public ResultSet getResult() { 
		 return res; 
		 } 		
}