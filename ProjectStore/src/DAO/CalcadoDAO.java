package DAO;

import modelos.Calcado;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CalcadoDAO {
  protected static Connection conexao;
  protected static PreparedStatement stmt;
  protected static ResultSet rs;

  public static int grava(Calcado calcado) throws Exception {
    int id = 0;
    try {
      String sql = "INSERT INTO calcado (nome, preco, descricao, tipo, marca, numero) VALUES (?, ?, ?, ?, ?, ?)";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, calcado.getNome());
      stmt.setDouble(2, calcado.getPreco());
      stmt.setString(3, calcado.getDescricao());
      stmt.setString(4, calcado.getTipo());
      stmt.setString(5, calcado.getMarca());
      stmt.setInt(6, calcado.getNumero());
      id = stmt.executeUpdate();
      stmt.close();
    } catch (SQLException e) {
      
    }
    return id;
  }

  public static List<Calcado> leTodos() throws Exception {
    List<Calcado> calcado = new ArrayList<Calcado>();
    try {
      String sql = "SELECT * FROM calcado";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      rs = stmt.executeQuery();
      while (rs.next()) {
        Calcado calcados = new Calcado();
        calcados.setNome(rs.getString("nome"));
        calcados.setPreco(rs.getDouble("preco"));
        calcados.setDescricao(rs.getString("descricao"));
        calcados.setTipo(rs.getString("tipo"));
        calcados.setMarca(rs.getString("marca"));
        calcados.setNumero(rs.getInt("numero"));
        calcado.add(calcados);
      }
      rs.close();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return calcado;
  }

  public static Calcado leUm(int id) throws Exception {
    Calcado calcado = new Calcado();
    try {
      String sql = "SELECT * FROM calcado WHERE id_calcado = ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setInt(1, id);
      rs = stmt.executeQuery();
      while (rs.next()) {
        calcado.setNome(rs.getString("nome"));
        calcado.setPreco(rs.getDouble("preco"));
        calcado.setDescricao(rs.getString("descricao"));
        calcado.setTipo(rs.getString("tipo"));
        calcado.setMarca(rs.getString("marca"));
        calcado.setNumero(rs.getInt("numero"));
      }
      rs.close();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return calcado;
  }

  public static int altera(int id, Calcado calcado) throws Exception {
      int ret = 0;
    try {
      String sql = "UPDATE calcado SET nome = ?, preco = ?, descricao = ?, tipo = ?, marca = ?, numero = ? WHERE id_calcado = ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, calcado.getNome());
      stmt.setDouble(2, calcado.getPreco());
      stmt.setString(3, calcado.getDescricao());
      stmt.setString(4, calcado.getTipo());
      stmt.setString(5, calcado.getMarca());
      stmt.setInt(6, calcado.getNumero());
      stmt.setInt(7, id);
      ret = stmt.executeUpdate();
      stmt.close();
    } catch (SQLException e) {
      
    }
    return ret;
  }

  public static int exclui(int id) throws Exception {
    try {
      String sql = "DELETE FROM calcado WHERE id_calcado = ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setInt(1, id);
      stmt.executeUpdate();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return id;
  }

  public static List<Calcado> pesquisaPorNomeInicial(String letra) throws Exception {
    List<Calcado> calcado = new ArrayList<Calcado>();
    try {
      String sql = "SELECT * FROM calcado WHERE nome LIKE ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, letra + "%");
      rs = stmt.executeQuery();
      while (rs.next()) {
        Calcado calcados = new Calcado();
        calcados.setNome(rs.getString("nome"));
        calcados.setPreco(rs.getDouble("preco"));
        calcados.setDescricao(rs.getString("descricao"));
        calcados.setTipo(rs.getString("tipo"));
        calcados.setMarca(rs.getString("marca"));
        calcados.setNumero(rs.getInt("numero"));
        calcado.add(calcados);
      }
      rs.close();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return calcado;
  }

  public static List<Calcado> pesquisaPorMultiplosIds(int id1, int id2, int id3) throws Exception {
    List<Calcado> calcado = new ArrayList<Calcado>();

    try {
      String sql = "SELECT * FROM calcado WHERE id_calcado IN (?,?,?)";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);

      stmt.setInt(1, id1);
      stmt.setInt(2, id2);
      stmt.setInt(3, id3);

      rs = stmt.executeQuery();

      while (rs.next()) {
        Calcado calcados = new Calcado();
        calcados.setNome(rs.getString("nome"));
        calcados.setPreco(rs.getDouble("preco"));
        calcados.setDescricao(rs.getString("descricao"));
        calcados.setTipo(rs.getString("tipo"));
        calcados.setMarca(rs.getString("marca"));
        calcados.setNumero(rs.getInt("numero"));
        calcado.add(calcados);
      }

      rs.close();
      stmt.close();

    } catch (SQLException e) {
      e.printStackTrace();
    }

    return calcado;
  }

  public static List<Calcado> pesquisaPorIdForaIntervalo(int idMin, int idMax) throws Exception {
    List<Calcado> calcado = new ArrayList<Calcado>();
    try {
      String sql = "SELECT * FROM calcado WHERE id_calcado NOT BETWEEN ? AND ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setInt(1, idMin);
      stmt.setInt(2, idMax);
      rs = stmt.executeQuery();
      while (rs.next()) {
        Calcado calcados = new Calcado();
        calcados.setNome(rs.getString("nome"));
        calcados.setPreco(rs.getDouble("preco"));
        calcados.setDescricao(rs.getString("descricao"));
        calcados.setTipo(rs.getString("tipo"));
        calcados.setMarca(rs.getString("marca"));
        calcados.setNumero(rs.getInt("numero"));
        calcado.add(calcados);
      }
      rs.close();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return calcado;
  }

  public static int atualizaPrecoPorTiposExceto(double novoPreco, String tipo1, String tipo2, String tipo3)
      throws Exception {
    int ret = 0;

    try {
      String sql = "UPDATE calcado SET preco = ? WHERE tipo NOT IN (?,?,?)";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);

      stmt.setDouble(1, novoPreco);
      stmt.setString(2, tipo1);
      stmt.setString(3, tipo2);
      stmt.setString(4, tipo3);

      ret = stmt.executeUpdate();
      stmt.close();

    } catch (SQLException e) {
      e.printStackTrace();
    }

    return ret;
  }

  public static int atualizaMarcaPorMarca(String novaMarca, String marca) throws Exception {
    int ret = 0;
    try {
      String sql = "UPDATE calcado SET marca = ? WHERE marca = ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, novaMarca);
      stmt.setString(2, marca);
      ret = stmt.executeUpdate();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return ret;
  }

  public static int atualizaDescricaoPrecoMarca(String novaDescricao, double precoMinimo, String marca)
      throws Exception {
    int ret = 0;
    try {
      String sql = "UPDATE calcado SET descricao = ? WHERE preco > ? AND marca = ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, novaDescricao);
      stmt.setDouble(2, precoMinimo);
      stmt.setString(3, marca);
      ret = stmt.executeUpdate();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return ret;
  }
}
