package es.woorea;

import java.util.logging.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.filter.LoggingFilter;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget api = client.target("http://localhost:8080/cloud/api");
		api.register(new LoggingFilter(Logger.getLogger("cloud"),true));
		Response r = api.path("/servers").request().get();
		
		Server s = new Server();
		s.setName("mi nombre");
		s.setTitle("mi titulo");
		s.setImageId(1L);
		s.setHardwareId(1L);
		
		Server response = api.path("/servers").request().post(Entity.json(s), Server.class);
		
	}

}
