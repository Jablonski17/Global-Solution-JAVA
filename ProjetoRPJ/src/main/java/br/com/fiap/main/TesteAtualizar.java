package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Empresa;
import br.com.fiap.dao.EmpresaDAO;

public class TesteAtualizar {
	
	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instanciar objetos
		Empresa objEmpresa = new Empresa();
		
		EmpresaDAO dao = new EmpresaDAO();
		
		objEmpresa.setId(inteiro("Insira o ID da empresa"));
		objEmpresa.setNome(texto("Nome"));
		objEmpresa.setCnpj(texto("CNPJ"));
		
		System.out.println(dao.atualizar(objEmpresa));

	}

}
