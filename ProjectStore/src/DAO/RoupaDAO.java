package DAO;

import modelos.Roupa;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoupaDAO {
  protected static Connection conexao;
  protected static PreparedStatement stmt;
  protected static ResultSet rs;

  public static int grava(Roupa roupa) throws Exception {
    int id = 0;
    try {
      String sql = "INSERT INTO roupa (nome, preco, descricao, marca, tamanho, material) VALUES (?, ?, ?, ?, ?, ?)";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, roupa.getNome());
      stmt.setDouble(2, roupa.getPreco());
      stmt.setString(3, roupa.getDescricao());
      stmt.setString(4, roupa.getMarca());
      stmt.setString(5, roupa.getTamanho());
      stmt.setString(6, roupa.getMaterial());

      id = stmt.executeUpdate();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return id;
  }

  public static List<Roupa> leTodos() throws Exception {
    List<Roupa> roupa = new ArrayList<Roupa>();
    try {
      String sql = "SELECT * FROM roupa";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      rs = stmt.executeQuery();
      while (rs.next()) {
        Roupa roupas = new Roupa();
        roupas.setNome(rs.getString("nome"));
        roupas.setPreco(rs.getDouble("preco"));
        roupas.setDescricao(rs.getString("descricao"));
        roupas.setMarca(rs.getString("marca"));
        roupas.setTamanho(rs.getString("tamanho"));
        roupas.setMaterial(rs.getString("material"));
        roupa.add(roupas);
      }
      rs.close();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return roupa;
  }

  public static Roupa leUm(int id) throws Exception {
    Roupa roupa = new Roupa();
    try {
      String sql = "SELECT * FROM roupa WHERE id_roupa = ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setInt(1, id);
      rs = stmt.executeQuery();
      while (rs.next()) {
        roupa.setNome(rs.getString("nome"));
        roupa.setPreco(rs.getDouble("preco"));
        roupa.setDescricao(rs.getString("descricao"));
        roupa.setMarca(rs.getString("marca"));
        roupa.setTamanho(rs.getString("tamanho"));
        roupa.setMaterial(rs.getString("material"));
      }
      rs.close();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return roupa;
  }

  public static int altera(int id, Roupa roupa) throws Exception {
    int ret = 0;
    try {
      String sql = "UPDATE roupa SET nome = ?, preco = ?, descricao = ?, marca = ?, tamanho = ?, material = ? WHERE id_roupa = ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, roupa.getNome());
      stmt.setDouble(2, roupa.getPreco());
      stmt.setString(3, roupa.getDescricao());
      stmt.setString(4, roupa.getMarca());
      stmt.setString(5, roupa.getTamanho());
      stmt.setString(6, roupa.getMaterial());
      stmt.setInt(7, id);
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
      String sql = "DELETE FROM roupa WHERE id_roupa = ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setInt(1, id);
      ret = stmt.executeUpdate();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return ret;
  }

  public static List<Roupa> pesquisaPorNomeInicial(String letra) throws Exception {
    List<Roupa> roupa = new ArrayList<Roupa>();
    try {
      String sql = "SELECT * FROM roupa WHERE nome LIKE ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, letra + "%");
      rs = stmt.executeQuery();
      while (rs.next()) {
        Roupa roupas = new Roupa();
        roupas.setNome(rs.getString("nome"));
        roupas.setPreco(rs.getDouble("preco"));
        roupas.setDescricao(rs.getString("descricao"));
        roupas.setMarca(rs.getString("marca"));
        roupas.setTamanho(rs.getString("tamanho"));
        roupas.setMaterial(rs.getString("material"));
        roupa.add(roupas);
      }
      rs.close();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return roupa;
  }

  public static List<Roupa> pesquisaPorMultiplosIds(int id1, int id2, int id3) throws Exception {
    List<Roupa> roupa = new ArrayList<Roupa>();

    try {
      String sql = "SELECT * FROM roupa WHERE id_roupa IN (?,?,?)";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);

      stmt.setInt(1, id1);
      stmt.setInt(2, id2);
      stmt.setInt(3, id3);

      rs = stmt.executeQuery();

      while (rs.next()) {
        Roupa roupas = new Roupa();
        roupas.setNome(rs.getString("nome"));
        roupas.setPreco(rs.getDouble("preco"));
        roupas.setDescricao(rs.getString("descricao"));
        roupas.setMarca(rs.getString("marca"));
        roupas.setTamanho(rs.getString("tamanho"));
        roupas.setMaterial(rs.getString("material"));
        roupa.add(roupas);
      }

      rs.close();
      stmt.close();

    } catch (SQLException e) {
      e.printStackTrace();
    }

    return roupa;
  }

  public static List<Roupa> pesquisaPorIdForaIntervalo(int idMin, int idMax) throws Exception {
    List<Roupa> roupa = new ArrayList<Roupa>();
    try {
      String sql = "SELECT * FROM roupa WHERE id_roupa NOT BETWEEN ? AND ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setInt(1, idMin);
      stmt.setInt(2, idMax);
      rs = stmt.executeQuery();
      while (rs.next()) {
        Roupa roupas = new Roupa();
        roupas.setNome(rs.getString("nome"));
        roupas.setPreco(rs.getDouble("preco"));
        roupas.setDescricao(rs.getString("descricao"));
        roupas.setMarca(rs.getString("marca"));
        roupas.setTamanho(rs.getString("tamanho"));
        roupas.setMaterial(rs.getString("material"));
        roupa.add(roupas);
      }
      rs.close();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return roupa;
  }

  public static int atualizaPrecoPorTiposExceto(double novoPreco, String tipo1, String tipo2, String tipo3)
      throws Exception {
    int ret = 0;

    try {
      String sql = "UPDATE roupa SET preco = ? WHERE marca NOT IN (?,?,?)";
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

  public static int atualizaMarcaPorTamanho(String novaMarca, String tamanho) throws Exception {
    int ret = 0;
    try {
      String sql = "UPDATE roupa SET marca = ? WHERE tamanho = ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, novaMarca);
      stmt.setString(2, tamanho);
      ret = stmt.executeUpdate();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return ret;
  }

  public static int atualizaDescricaoPrecoMaterial(String novaDescricao, double precoMinimo, String material)
      throws Exception {
    int ret = 0;
    try {
      String sql = "UPDATE roupa SET descricao = ? WHERE preco > ? AND material = ?";
      conexao = ConnectionFactory.getConnection();
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, novaDescricao);
      stmt.setDouble(2, precoMinimo);
      stmt.setString(3, material);
      ret = stmt.executeUpdate();
      stmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return ret;
  }
}
