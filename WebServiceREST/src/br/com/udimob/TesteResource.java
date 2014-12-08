package br.com.udimob;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Classe de teste
 */
@Path("/teste")
public class TesteResource {

	@GET
	@Produces("text/plain")
	public String showHelloWorld() {
		return "teste";
	}
}
