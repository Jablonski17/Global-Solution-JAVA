package br.com.fiap.main;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Gasto;
import br.com.fiap.dao.EmpresaDAO;

public class TesteSelecionar {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Instanciar objetos
        EmpresaDAO dao = new EmpresaDAO();

        try {
            // Recuperar lista de empresas
            List<Empresa> listaEmpresa = dao.selecionar();

            if (listaEmpresa != null && !listaEmpresa.isEmpty()) {
                StringBuilder resultado = new StringBuilder("Empresas cadastradas:\n");

                // Percorrer a lista de empresas
                for (Empresa empresa : listaEmpresa) {
                    resultado.append("ID: ").append(empresa.getId())
                             .append(", Nome: ").append(empresa.getNome())
                             .append(", CNPJ: ").append(empresa.getCnpj())
                             .append("\n");

                    // Adicionar informações sobre os gastos
                    List<Gasto> listaGasto = empresa.getListaDeGastos();
                    if (listaGasto != null && !listaGasto.isEmpty()) {
                        resultado.append("  Lista de Gastos:\n");
                        for (Gasto gasto : listaGasto) {
                            resultado.append("    ID: ").append(gasto.getId())
                                     .append(", Descrição: ").append(gasto.getDescricao())
                                     .append(", Valor: ").append(gasto.getValor())
                                     .append(", Categoria: ").append(gasto.getCategoria())
                                     .append("\n");
                        }
                    } else {
                        resultado.append("  Nenhum gasto cadastrado.\n");
                    }
                }

                // Mostrar os resultados em uma caixa de diálogo
                JOptionPane.showMessageDialog(null, resultado.toString(), "Empresas e Gastos", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhuma empresa encontrada.", "Resultado", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
