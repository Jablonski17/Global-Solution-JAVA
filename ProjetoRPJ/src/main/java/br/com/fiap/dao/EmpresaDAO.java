package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Gasto;
import br.com.fiap.conexoes.ConexaoFactory;

public class EmpresaDAO {

    public Connection minhaConexao;

    public EmpresaDAO() throws ClassNotFoundException, SQLException {
        super();
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    // Insert
    public String inserir(Empresa empresa) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
                "INSERT INTO Empresa (id, nome, cnpj) VALUES (?, ?, ?)");
        stmt.setInt(1, empresa.getId());
        stmt.setString(2, empresa.getNome());
        stmt.setString(3, empresa.getCnpj());
        stmt.execute();
        stmt.close();
        return "EMPRESA CADASTRADA COM SUCESSO!";
    }

    // Delete
    public String deletar(int id) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
                "DELETE FROM Empresa WHERE id = ?");
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
        return "EMPRESA DELETADA COM SUCESSO!";
    }

    // Update
    public String atualizar(Empresa empresa) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
                "UPDATE Empresa SET nome = ?, cnpj = ? WHERE id = ?");
        stmt.setString(1, empresa.getNome());
        stmt.setString(2, empresa.getCnpj());
        stmt.setInt(3, empresa.getId());
        stmt.executeUpdate();
        stmt.close();
        return "EMPRESA ATUALIZADA COM SUCESSO!";
    }

    // Select
    public List<Empresa> selecionar() throws SQLException {
        List<Empresa> listaEmpresa = new ArrayList<>();
        PreparedStatement stmt = minhaConexao.prepareStatement("SELECT * FROM Empresa");

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Empresa empresa = new Empresa();
            empresa.setId(rs.getInt("id"));
            empresa.setNome(rs.getString("nome"));
            empresa.setCnpj(rs.getString("cnpj")); // Corrigido para usar o campo correto
            listaEmpresa.add(empresa);
        }
        rs.close();
        stmt.close();
        return listaEmpresa;
    }
}
