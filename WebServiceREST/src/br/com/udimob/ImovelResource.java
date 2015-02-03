package br.com.udimob;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.udimob.business.ImovelBusiness;
import br.com.udimob.dto.Imovel;

import com.google.gson.Gson;



@Path("/imovel")
public class ImovelResource {
	
	@GET
    @Path("/buscarTodos")
    @Produces("application/json")
    public ArrayList<Imovel> selTodos(){
		return new ImovelBusiness().buscarTodos();
    }

    @GET
    @Path("/buscarTodosGSON")
    @Produces("application/json")
    public String selTodosGSON(){
    	return new Gson().toJson(new ImovelBusiness().buscarTodos());
    }

}