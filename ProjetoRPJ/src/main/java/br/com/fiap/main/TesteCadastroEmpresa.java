package br.com.fiap.main;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.com.fiap.beans.Empresa;
import br.com.fiap.dao.EmpresaDAO;


public class TesteCadastroEmpresa {

		    static String texto(String j) {
		        return JOptionPane.showInputDialog(j);
		    }

		    static int inteiro(String j) {
		        return Integer.parseInt(JOptionPane.showInputDialog(j));
		    }

		    static double real(String j) {
		        return Double.parseDouble(JOptionPane.showInputDialog(j));
		    }

		    public static void main(String[] args) throws ClassNotFoundException, SQLException {
		        EmpresaDAO dao = new  EmpresaDAO();
		        JOptionPane.showInternalMessageDialog(null, "CADASTRO DE EMPRESA");
		        
		        			Empresa objEmpresa = new  Empresa();
		        			objEmpresa.setId(inteiro("Informe o ID"));
		        			objEmpresa.setNome(texto("Informe o Nome"));
		        			objEmpresa.setCnpj(texto("Informe o CNPJ"));
		        			
		                    System.out.println(dao.inserir(objEmpresa));
		    }
		

	}


