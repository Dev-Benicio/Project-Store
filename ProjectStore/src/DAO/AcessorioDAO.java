package DAO;

import modelos.Acessorio;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AcessorioDAO {
  protected static Connection conexao;
  protected static PreparedStatement stmt;
  protected static ResultSet rs;

  public static int grava(Acessorio acessorio) throws Exception {
    int id = 0;
    try {
      String sql = "INSERT INTO acessorio (nome, preco, descricao, tipo, material) VALUES (?, ?, ?, ?, ?)";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, acessorio.getNome());
      stmt.setDouble(2, acessorio.getPreco());
      stmt.setString(3, acessorio.getDescricao());
      stmt.setString(4, acessorio.getTipo());
      stmt.setString(5, acessorio.getMaterial());
      id = stmt.executeUpdate();
      stmt.close();
    } catch (SQLException e) {

    }
    return id;
  }

  public static List<Acessorio> leTodos() throws Exception {
    List<Acessorio> acessorio = new ArrayList<Acessorio>();
    try {
      String sql = "SELECT * FROM acessorio";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      rs = stmt.executeQuery();
      while (rs.next()) {
        Acessorio acessorios = new Acessorio();
        acessorios.setNome(rs.getString("nome"));
        acessorios.setPreco(rs.getDouble("preco"));
        acessorios.setDescricao(rs.getString("descricao"));
        acessorios.setTipo(rs.getString("tipo"));
        acessorios.setMaterial(rs.getString("material"));
        acessorio.add(acessorios);
      }
      rs.close();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return acessorio;
  }

  public static Acessorio leUm(int id) throws Exception {
    Acessorio acessorio = new Acessorio();
    try {
      String sql = "SELECT * FROM acessorio WHERE id_acessorio = ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setInt(1, id);
      rs = stmt.executeQuery();
      while (rs.next()) {
        acessorio.setNome(rs.getString("nome"));
        acessorio.setPreco(rs.getDouble("preco"));
        acessorio.setDescricao(rs.getString("descricao"));
        acessorio.setTipo(rs.getString("tipo"));
        acessorio.setMaterial(rs.getString("material"));
      }
      rs.close();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return acessorio;
  }

  public static int altera(int id, Acessorio acessorio) throws Exception {
    try {
      String sql = "UPDATE acessorio SET nome = ?, preco = ?, descricao = ?, tipo = ?, material = ? WHERE id_acessorio = ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, acessorio.getNome());
      stmt.setDouble(2, acessorio.getPreco());
      stmt.setString(3, acessorio.getDescricao());
      stmt.setString(4, acessorio.getTipo());
      stmt.setString(5, acessorio.getMaterial());
      stmt.setInt(6, id);
      stmt.executeUpdate();
      rs = stmt.getGeneratedKeys();
      if (rs.next()) {
        id = rs.getInt(1);
      }
      rs.close();
      stmt.close();
    } catch (SQLException e) {
      
    }
    return id;
  }

  public static int exclui(int id) throws Exception {
      int ret = 0;
    try {
      String sql = "DELETE FROM acessorio WHERE id_acessorio = ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setInt(1, id);
      ret = stmt.executeUpdate();
      stmt.close();
    } catch (SQLException e) {
      
    }
    return ret;
  }

  public static List<Acessorio> pesquisaPorNomeInicial(String letra) throws Exception {
    List<Acessorio> acessorio = new ArrayList<Acessorio>();
    try {
      String sql = "SELECT * FROM acessorio WHERE nome LIKE ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, letra + "%");
      rs = stmt.executeQuery();
      while (rs.next()) {
        Acessorio acessorios = new Acessorio();
        acessorios.setNome(rs.getString("nome"));
        acessorios.setPreco(rs.getDouble("preco"));
        acessorios.setDescricao(rs.getString("descricao"));
        acessorios.setTipo(rs.getString("tipo"));
        acessorios.setMaterial(rs.getString("material"));
        acessorio.add(acessorios);
      }
      rs.close();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return acessorio;
  }

  public static List<Acessorio> pesquisaPorMultiplosIds(int id1, int id2, int id3) throws Exception {
    List<Acessorio> acessorio = new ArrayList<Acessorio>();

    try {
      String sql = "SELECT * FROM acessorio WHERE id_acessorio IN (?,?,?)";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);

      stmt.setInt(1, id1);
      stmt.setInt(2, id2);
      stmt.setInt(3, id3);

      rs = stmt.executeQuery();

      while (rs.next()) {
        Acessorio acessorios = new Acessorio();
        acessorios.setNome(rs.getString("nome"));
        acessorios.setPreco(rs.getDouble("preco"));
        acessorios.setDescricao(rs.getString("descricao"));
        acessorios.setTipo(rs.getString("tipo"));
        acessorios.setMaterial(rs.getString("material"));
        acessorio.add(acessorios);
      }

      rs.close();
      stmt.close();

    } catch (SQLException e) {
      e.printStackTrace();
    }

    return acessorio;
  }

  public static List<Acessorio> pesquisaPorIdForaIntervalo(int idMin, int idMax) throws Exception {
    List<Acessorio> acessorio = new ArrayList<Acessorio>();
    try {
      String sql = "SELECT * FROM acessorio WHERE id_acessorio NOT BETWEEN ? AND ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setInt(1, idMin);
      stmt.setInt(2, idMax);
      rs = stmt.executeQuery();
      while (rs.next()) {
        Acessorio acessorios = new Acessorio();
        acessorios.setNome(rs.getString("nome"));
        acessorios.setPreco(rs.getDouble("preco"));
        acessorios.setDescricao(rs.getString("descricao"));
        acessorios.setTipo(rs.getString("tipo"));
        acessorios.setMaterial(rs.getString("material"));
        acessorio.add(acessorios);
      }
      rs.close();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return acessorio;
  }

  public static int atualizaPrecoPorTiposExceto(double novoPreco, String tipo1, String tipo2, String tipo3)
      throws Exception {
    int ret = 0;

    try {
      String sql = "UPDATE acessorio SET preco = ? WHERE tipo NOT IN (?,?,?)";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);

      stmt.setDouble(1, novoPreco);
      stmt.setString(2, tipo1);
      stmt.setString(3, tipo2);
      stmt.setString(4, tipo3);

      ret = stmt.executeUpdate();
      stmt.close();

    } catch (SQLException e) {
      
    }

    return ret;
  }

  public static int atualizaMaterialPorTipo(String novoMaterial, String tipo) throws Exception {
    int ret = 0;
    try {
      String sql = "UPDATE acessorio SET material = ? WHERE tipo = ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, novoMaterial);
      stmt.setString(2, tipo);
      ret = stmt.executeUpdate();
      stmt.close();
    } catch (SQLException e) {
      
    }
    return ret;
  }

  public static int atualizaDescricaoPrecoMaterial(String novaDescricao, double precoMinimo, String material)
      throws Exception {
    int ret = 0;
    try {
      String sql = "UPDATE acessorio SET descricao = ? WHERE preco > ? AND material = ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, novaDescricao);
      stmt.setDouble(2, precoMinimo);
      stmt.setString(3, material);
      ret = stmt.executeUpdate();
      stmt.close();
    } catch (SQLException e) {
      
    }
    return ret;
  }
}
