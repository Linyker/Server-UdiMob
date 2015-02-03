package br.com.udimob;

import java.io.File;

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
		//acessar arquivo
		  
		String str = "imagens/arquivo.txt";  
		File teste = new File(str);  
		if (!teste.exists()) {  
			return "Não existe";
		} else {  
			return "Existe";
		}
		
		
		
		
	}
}
