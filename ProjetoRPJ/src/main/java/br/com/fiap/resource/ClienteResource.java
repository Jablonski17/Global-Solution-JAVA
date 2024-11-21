package br.com.fiap.resource;

import java.sql.SQLException;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.beans.Empresa;
import br.com.fiap.bo.EmpresaBO;

@Path("/Empresa")
public class ClienteResource {
	
	private EmpresaBO empresaBO = new EmpresaBO();
	
	// Selecionar 
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Empresa> selecionarRs() throws ClassNotFoundException, SQLException{
		return (ArrayList<Empresa>) empresaBO.selecionarBo();
	}
	
	// Inserir 
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response inserirRs(Empresa empresa, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
		
		EmpresaBO.inserirBo(empresa);
		
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(Empresa.getId()));
		return Response.created(builder.build()).build();			
	}
	
	// Atualizar 
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizarRs(Empresa empresa, @PathParam("id") int ID) throws ClassNotFoundException, SQLException {
		EmpresaBO.atualizarBo(empresa);
		
		return Response.ok().build();
	}
	
	// Deletar
	@DELETE
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deletarRs(@PathParam("id") int ID) throws ClassNotFoundException, SQLException {
		
		EmpresaBO.deletarBo(ID);
		return Response.ok().build();
	}
	
}