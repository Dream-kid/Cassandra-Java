package cassandra;


import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Cluster.Builder;
import com.datastax.driver.core.Session;


public class Program1 {
	
	  public static void main(String[] args) 
	    { 
	       Cluster cluster;
	       Session session;
			cluster=Cluster.builder().addContactPoint("localhost").build();
	       session=cluster.connect("sourav");
	       session.execute("INSERT INTO User (id, name, address, age) VALUES (1,'sourav','pabna', 10)");
	       cluster.close();
	    }

}
