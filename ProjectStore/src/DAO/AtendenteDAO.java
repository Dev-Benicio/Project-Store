package DAO;

import modelos.Atendente;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AtendenteDAO {
  protected static Connection conexao;
  protected static PreparedStatement stmt;
  protected static ResultSet rs;

  public static int grava(Atendente atendente) throws Exception {
    int id = 0;
    try {
      String sql = "INSERT INTO atendente (nome, cpf, telefone, turno, endereco) VALUES (?, ?, ?, ?, ?)";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, atendente.getNome());
      stmt.setString(2, atendente.getCpf());
      stmt.setString(3, atendente.getTelefone());
      stmt.setString(4, atendente.getTurno());
      stmt.setString(5, atendente.getEndereco());
      id = stmt.executeUpdate();
      stmt.close();
    } catch (SQLException e) {
      
    }
    return id;
  }

  public static List<Atendente> leTodos() throws Exception {
    List<Atendente> atendente = new ArrayList<Atendente>();
    try {
      String sql = "SELECT * FROM atendente";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      rs = stmt.executeQuery();
      while (rs.next()) {
        Atendente atendentes = new Atendente();
        atendentes.setNome(rs.getString("nome"));
        atendentes.setCpf(rs.getString("cpf"));
        atendentes.setTelefone(rs.getString("telefone"));
        atendentes.setTurno(rs.getString("turno"));
        atendentes.setEndereco(rs.getString("endereco"));
        atendente.add(atendentes);
      }
      rs.close();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return atendente;
  }

  public static Atendente leUm(int id) throws Exception {
    Atendente atendente = new Atendente();
    try {
      String sql = "SELECT * FROM atendente WHERE id_atendente = ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setInt(1, id);
      rs = stmt.executeQuery();
      while (rs.next()) {
        atendente.setNome(rs.getString("nome"));
        atendente.setCpf(rs.getString("cpf"));
        atendente.setTelefone(rs.getString("telefone"));
        atendente.setTurno(rs.getString("turno"));
        atendente.setEndereco(rs.getString("endereco"));
      }
      rs.close();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return atendente;
  }

  public static int altera(int id, Atendente atendente) throws Exception {
    int ret = 0;
    try {
      String sql = "UPDATE atendente SET nome = ?, cpf = ?, telefone = ?, turno = ?, endereco = ? WHERE id_atendente = ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, atendente.getNome());
      stmt.setString(2, atendente.getCpf());
      stmt.setString(3, atendente.getTelefone());
      stmt.setString(4, atendente.getTurno());
      stmt.setString(5, atendente.getEndereco());
      stmt.setInt(6, id);
      ret = stmt.executeUpdate();
      stmt.close();
    } catch (SQLException e) {
      
    }
    return ret;
  }

  public static int exclui(int id) throws Exception {
    int ret = 0;
    try {
      String sql = "DELETE FROM atendente WHERE id_atendente = ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setInt(1, id);
      ret = stmt.executeUpdate();
      stmt.close();
    } catch (SQLException e) {
      
    }
    return ret;
  }

  public static List<Atendente> pesquisaPorNomeInicial(String letra) throws Exception {
    List<Atendente> atendente = new ArrayList<Atendente>();
    try {
      String sql = "SELECT * FROM atendente WHERE nome LIKE ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, letra + "%");
      rs = stmt.executeQuery();
      while (rs.next()) {
        Atendente atendentes = new Atendente();
        atendentes.setNome(rs.getString("nome"));
        atendentes.setCpf(rs.getString("cpf"));
        atendentes.setTelefone(rs.getString("telefone"));
        atendentes.setTurno(rs.getString("turno"));
        atendentes.setEndereco(rs.getString("endereco"));
        atendente.add(atendentes);
      }
      rs.close();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return atendente;
  }

  public static List<Atendente> pesquisaPorMultiplosIds(int id1, int id2, int id3) throws Exception {
    List<Atendente> atendente = new ArrayList<Atendente>();

    try {
      String sql = "SELECT * FROM atendente WHERE id_atendente IN (?,?,?)";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);

      stmt.setInt(1, id1);
      stmt.setInt(2, id2);
      stmt.setInt(3, id3);

      rs = stmt.executeQuery();

      while (rs.next()) {
        Atendente atendentes = new Atendente();
        atendentes.setNome(rs.getString("nome"));
        atendentes.setCpf(rs.getString("cpf"));
        atendentes.setTelefone(rs.getString("telefone"));
        atendentes.setTurno(rs.getString("turno"));
        atendentes.setEndereco(rs.getString("endereco"));
        atendente.add(atendentes);
      }
      rs.close();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return atendente;
  }

  public static List<Atendente> pesquisaPorIdForaIntervalo(int idMin, int idMax) throws Exception {
    List<Atendente> atendente = new ArrayList<Atendente>();
    try {
      String sql = "SELECT * FROM atendente WHERE id_atendente NOT BETWEEN ? AND ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setInt(1, idMin);
      stmt.setInt(2, idMax);
      rs = stmt.executeQuery();
      while (rs.next()) {
        Atendente atendentes = new Atendente();
        atendentes.setNome(rs.getString("nome"));
        atendentes.setCpf(rs.getString("cpf"));
        atendentes.setTelefone(rs.getString("telefone"));
        atendentes.setTurno(rs.getString("turno"));
        atendentes.setEndereco(rs.getString("endereco"));
        atendente.add(atendentes);
      }
      rs.close();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return atendente;
  }

  public static int atualizaTurno(String novoTurno, int idMin, int idMax) throws Exception {
    int ret = 0;
    try {
      String sql = "UPDATE atendente SET turno = ? WHERE id_atendente NOT IN (?,?)";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, novoTurno);
      stmt.setInt(2, idMin);
      stmt.setInt(3, idMax);
      
      ret = stmt.executeUpdate();
      stmt.close();
    } catch (SQLException e) {
      
    }
    return ret;
  }
  
  public static int atualizaEndereco(String novoEndereco, int id) throws Exception {
    int ret = 0;
    try {
      String sql = "UPDATE atendente SET endereco = ? WHERE id_atendente = ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, novoEndereco);
      stmt.setInt(2, id);
      
      ret = stmt.executeUpdate();
      stmt.close();
    } catch (SQLException e) {
      
    }
    return ret;
  }

  public static int atualizaNome(String novoNome, int id, String cpf) throws Exception {
    int ret = 0;
    try {
      String sql = "UPDATE atendente SET nome = ? WHERE id_atendente = ? AND cpf = ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, novoNome);
      stmt.setInt(2, id);
      stmt.setString(3, cpf);
      
      ret = stmt.executeUpdate();
      stmt.close();
    } catch (SQLException e) {
      
    }
    return ret;
  }
}
