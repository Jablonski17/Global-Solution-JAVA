package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Empresa;
import br.com.fiap.dao.EmpresaDAO;

public class TesteDeletar {
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instanciar objetos 
		Empresa objEmpresa = new Empresa();
		
		EmpresaDAO dao = new EmpresaDAO();
		
		objEmpresa.setId(inteiro("Digite o ID da empresa a ser deletado"));
		
		System.out.println(dao.deletar(Empresa.getId()));

	}

}
