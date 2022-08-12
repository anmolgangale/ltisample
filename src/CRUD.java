import java.sql.DriverManager;
import java.sql.ResultSet;
//import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public class CRUD {

	
	public static void main(String[] args) throws ClassNotFoundException {
	try {
		//step-1 Register for driver
	      Class.forName("oracle.jdbc.driver.OracleDriver");
		//Class.forname("com.mysql.cj.jdbc.driver")--->for mysql
		
	    //step-2
	      Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","2022Oct@00647","LTI");
	      
	    //create table
	      String sql1="create table empssaa(id number,name varchar2(20))";
	      
	    //insert into table
	     // String sql2="insert into empssy values(1,'Anmol')";
	    //update record
	      //String sql3="update empssy set name='Vaishnavi' where id=1";
	     //delete record
	      //String sql4="delete from empssy where id=1";
	       
	     Statement stmt=con.createStatement();
	      stmt.executeUpdate(sql1);
	      ResultSet re=stmt.executeQuery("select * from empssy");
	      while(re.next())
	      {
	    	  System.out.println(re.getInt(1));
	    	  System.out.println(re.getString(2));
	      }
	      
	      System.out.println("Successful");
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		System.out.println("Exception");
	}
	
	}

}
