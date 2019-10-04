package com.agenda.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.agenda.service.CadastraUsuarioService;

@Path("/pessoas")

@Produces(MediaType.APPLICATION_JSON)
public class UsuarioEndPoint {
	
	 private CadastraUsuarioService service = new CadastraUsuarioService();
	 
	 @GET
	 public Response buscarTodos() {
		 return Response.ok(this.service.buscaPessoas()).build();
	 }
}
