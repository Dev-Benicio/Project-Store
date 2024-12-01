package DAO;

import modelos.Cliente;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
  protected static Connection conexao;
  protected static PreparedStatement stmt;
  protected static ResultSet rs;

  public static int grava(Cliente cliente) throws Exception {
    int id = 0;
    try {
      String sql = "INSERT INTO cliente (nome, cpf, telefone, endereco, numero_residencia) VALUES (?, ?, ?, ?, ?)";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, cliente.getNome());
      stmt.setString(2, cliente.getCpf());
      stmt.setString(3, cliente.getTelefone());
      stmt.setString(4, cliente.getEndereco());
      stmt.setInt(5, cliente.getNumero_residencia());
      id = stmt.executeUpdate();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return id;
  }

  public static List<Cliente> leTodos() throws Exception {
    List<Cliente> cliente = new ArrayList<Cliente>();
    try {
      String sql = "SELECT * FROM cliente";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      rs = stmt.executeQuery();
      while (rs.next()) {
        Cliente clientes = new Cliente();
        clientes.setNome(rs.getString("nome"));
        clientes.setCpf(rs.getString("cpf"));
        clientes.setTelefone(rs.getString("telefone"));
        clientes.setEndereco(rs.getString("endereco"));
        clientes.setNumero_residencia(rs.getInt("numero_residencia"));
        cliente.add(clientes);
      }
      rs.close();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return cliente;
  }

  public static Cliente leUm(int id) throws Exception {
    Cliente cliente = new Cliente();
    try {
      String sql = "SELECT * FROM cliente WHERE id_cliente = ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setInt(1, id);
      rs = stmt.executeQuery();
      while (rs.next()) {
        cliente.setNome(rs.getString("nome"));
        cliente.setCpf(rs.getString("cpf"));
        cliente.setTelefone(rs.getString("telefone"));
        cliente.setEndereco(rs.getString("endereco"));
        cliente.setNumero_residencia(rs.getInt("numero_residencia"));
      }
      rs.close();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return cliente;
  }

  public static int altera(int id, Cliente cliente) throws Exception {
    int ret = 0;
    try {
      String sql = "UPDATE cliente SET nome = ?, cpf = ?, telefone = ?, endereco = ?, numero_residencia = ? WHERE id_cliente = ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, cliente.getNome());
      stmt.setString(2, cliente.getCpf());
      stmt.setString(3, cliente.getTelefone());
      stmt.setString(4, cliente.getEndereco());
      stmt.setInt(5, cliente.getNumero_residencia());
      stmt.setInt(6, id);
      ret = stmt.executeUpdate();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return ret;
  }

  public static int exclui(int id) throws Exception {
    int ret = 0;
    try {
      String sql = "DELETE FROM cliente WHERE id_cliente = ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setInt(1, id);
      ret = stmt.executeUpdate();
      rs.close();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return ret;
  }

  public static List<Cliente> pesquisaPorNomeInicial(String letra) throws Exception {
    List<Cliente> cliente = new ArrayList<Cliente>();
    try {
      String sql = "SELECT * FROM cliente WHERE nome LIKE ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, letra + "%");
      rs = stmt.executeQuery();
      while (rs.next()) {
        Cliente clientes = new Cliente();
        clientes.setNome(rs.getString("nome"));
        clientes.setCpf(rs.getString("cpf"));
        clientes.setTelefone(rs.getString("telefone"));
        clientes.setEndereco(rs.getString("endereco"));
        clientes.setNumero_residencia(rs.getInt("numero_residencia"));
        cliente.add(clientes);
      }
      rs.close();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return cliente;
  }

  public static List<Cliente> pesquisaPorMultiplosIds(int id1, int id2, int id3) throws Exception {
    List<Cliente> cliente = new ArrayList<Cliente>();
    try {
      String sql = "SELECT * FROM cliente WHERE id_cliente IN (?,?,?)";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setInt(1, id1);
      stmt.setInt(2, id2);
      stmt.setInt(3, id3);
      rs = stmt.executeQuery();
      while (rs.next()) {
        Cliente clientes = new Cliente();
        clientes.setNome(rs.getString("nome"));
        clientes.setCpf(rs.getString("cpf"));
        clientes.setTelefone(rs.getString("telefone"));
        clientes.setEndereco(rs.getString("endereco"));
        clientes.setNumero_residencia(rs.getInt("numero_residencia"));
        cliente.add(clientes);
      }
      rs.close();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return cliente;
  }

  public static List<Cliente> pesquisaPorIdForaIntervalo(int idMin, int idMax) throws Exception {
    List<Cliente> cliente = new ArrayList<Cliente>();
    try {
      String sql = "SELECT * FROM cliente WHERE id_cliente NOT BETWEEN ? AND ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setInt(1, idMin);
      stmt.setInt(2, idMax);
      rs = stmt.executeQuery();
      while (rs.next()) {
        Cliente clientes = new Cliente();
        clientes.setNome(rs.getString("nome"));
        clientes.setCpf(rs.getString("cpf"));
        clientes.setTelefone(rs.getString("telefone"));
        clientes.setEndereco(rs.getString("endereco"));
        clientes.setNumero_residencia(rs.getInt("numero_residencia"));
        cliente.add(clientes);
      }
      rs.close();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return cliente;
  }

  public static int atualizaPrecoPorTiposExceto(double novoPreco, int num1, int num2, int num3)
      throws Exception {
    int ret = 0;

    try {
      String sql = "UPDATE cliente SET preco = ? WHERE tipo NOT IN (?,?,?)";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);

      stmt.setDouble(1, novoPreco);
      stmt.setInt(2, num1);
      stmt.setInt(3, num2);
      stmt.setInt(4, num3);

      ret = stmt.executeUpdate();
      stmt.close();

    } catch (SQLException e) {
      e.printStackTrace();
    }

    return ret;
  }

  public static int atualizaNumeroResidencia(int novoNumero, String cpf) throws Exception {
    int ret = 0;
    try {
      String sql = "UPDATE cliente SET numero_residencia = ? WHERE cpf = ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setInt(1, novoNumero);
      stmt.setString(2, cpf);
      ret = stmt.executeUpdate();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return ret;
  }

  public static int atualizaCpf(String telefone, String nome, String cpf) throws Exception
  {
    int ret = 0;
    try {
      String sql = "UPDATE cliente SET telefone = ? WHERE nome = ? AND cpf = ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, telefone);
      stmt.setString(2, nome);
      stmt.setString(3, cpf);
      ret = stmt.executeUpdate();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return ret;
  }
}
