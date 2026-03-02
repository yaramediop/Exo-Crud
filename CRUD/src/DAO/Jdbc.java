package Dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc {
	String URL="jdbc:mysql://localhost/MVC";
	String Driver="com.mysql.cj.jdbc.Driver";
	String user="root";
	String Password="";
	// Import java connection(api java.sql)
	public Connection co= null;
	public Statement sta= null;
	// Methode contenant l'ensemble des actions à réaliser
	public void connect() {
	
	// gérer les exceptions
		try {
	//1etape: chargement du driver avec la methode Forname
		Class.forName(Driver);
		
	//2etape: connection à la base
	  co=DriverManager.getConnection(URL,user,Password);
	  
	//3etape: statement		
     sta=co.createStatement();
    		 
 		 
     
	}
	catch(Exception e) {
	e.printStackTrace();
	}
}
}
