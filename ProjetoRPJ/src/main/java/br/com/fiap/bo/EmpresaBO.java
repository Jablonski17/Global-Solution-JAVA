package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.beans.Empresa;
import br.com.fiap.dao.EmpresaDAO;

public class EmpresaBO {
	
	EmpresaDAO empresaDao;
	
	// Selecionar 
	public ArrayList<Empresa> selecionarBo() throws ClassNotFoundException, SQLException{
		empresaDao = new EmpresaDAO();
		return null;
		
		
	}
	
	// Inserir 
	public static void inserirBo(Empresa empresa) throws ClassNotFoundException, SQLException {
		EmpresaDAO empresaDAO = new EmpresaDAO();
		
		// Regra de negocios
		
		empresaDAO.inserir(empresa);
	}
	
	// Atualizar 
	public static void atualizarBo(Empresa empresa) throws ClassNotFoundException, SQLException {
		EmpresaDAO empresaDAO = new EmpresaDAO();
		
		// Regra de negocios
		
		empresaDAO.atualizar(empresa);
	}
	
	
	// Deletar 
	public static void deletarBo(int id) throws ClassNotFoundException, SQLException {
		EmpresaDAO empresaDAO = new EmpresaDAO();
		
		// Regra de negocios
		
		empresaDAO.deletar(id);
	}		

}
